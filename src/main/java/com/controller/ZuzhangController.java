package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ZuzhangEntity;
import com.entity.view.ZuzhangView;

import com.service.ZuzhangService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 组长
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-17 20:30:54
 */
@RestController
@RequestMapping("/zuzhang")
public class ZuzhangController {
    @Autowired
    private ZuzhangService zuzhangService;
    
	@Autowired
	private TokenService tokenService;
	
	/**
	 * 登录
	 */
	@IgnoreAuth
	@RequestMapping(value = "/login")
	public R login(String username, String password, String captcha, HttpServletRequest request) {
		ZuzhangEntity user = zuzhangService.selectOne(new EntityWrapper<ZuzhangEntity>().eq("zuzhangxuehao", username));
		if(user==null || !user.getMima().equals(password)) {
			return R.error("账号或密码不正确");
		}
		
                if("否".equals(user.getSfsh())) return R.error("账号已锁定，请联系管理员审核。");
		String token = tokenService.generateToken(user.getId(), username,"zuzhang",  "组长" );
		return R.ok().put("token", token);
	}
	
	/**
     * 注册
     */
	@IgnoreAuth
    @RequestMapping("/register")
    public R register(@RequestBody ZuzhangEntity zuzhang){
    	//ValidatorUtils.validateEntity(zuzhang);
    	ZuzhangEntity user = zuzhangService.selectOne(new EntityWrapper<ZuzhangEntity>().eq("zuzhangxuehao", zuzhang.getZuzhangxuehao()));
		if(user!=null) {
			return R.error("注册用户已存在");
		}
		Long uId = new Date().getTime();
		zuzhang.setId(uId);
        zuzhangService.insert(zuzhang);
        return R.ok();
    }
	
	/**
	 * 退出
	 */
	@RequestMapping("/logout")
	public R logout(HttpServletRequest request) {
		request.getSession().invalidate();
		return R.ok("退出成功");
	}
	
	/**
     * 获取用户的session用户信息
     */
    @RequestMapping("/session")
    public R getCurrUser(HttpServletRequest request){
    	Long id = (Long)request.getSession().getAttribute("userId");
        ZuzhangEntity user = zuzhangService.selectById(id);
        return R.ok().put("data", user);
    }
    
    /**
     * 密码重置
     */
    @IgnoreAuth
	@RequestMapping(value = "/resetPass")
    public R resetPass(String username, HttpServletRequest request){
    	ZuzhangEntity user = zuzhangService.selectOne(new EntityWrapper<ZuzhangEntity>().eq("zuzhangxuehao", username));
    	if(user==null) {
    		return R.error("账号不存在");
    	}
        user.setMima("123456");
        zuzhangService.updateById(user);
        return R.ok("密码已重置为：123456");
    }


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZuzhangEntity zuzhang,
		HttpServletRequest request){
        EntityWrapper<ZuzhangEntity> ew = new EntityWrapper<ZuzhangEntity>();
		PageUtils page = zuzhangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zuzhang), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZuzhangEntity zuzhang, HttpServletRequest request){
        EntityWrapper<ZuzhangEntity> ew = new EntityWrapper<ZuzhangEntity>();
		PageUtils page = zuzhangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zuzhang), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZuzhangEntity zuzhang){
       	EntityWrapper<ZuzhangEntity> ew = new EntityWrapper<ZuzhangEntity>();
      	ew.allEq(MPUtil.allEQMapPre( zuzhang, "zuzhang")); 
        return R.ok().put("data", zuzhangService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZuzhangEntity zuzhang){
        EntityWrapper< ZuzhangEntity> ew = new EntityWrapper< ZuzhangEntity>();
 		ew.allEq(MPUtil.allEQMapPre( zuzhang, "zuzhang")); 
		ZuzhangView zuzhangView =  zuzhangService.selectView(ew);
		return R.ok("查询组长成功").put("data", zuzhangView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ZuzhangEntity zuzhang = zuzhangService.selectById(id);
        return R.ok().put("data", zuzhang);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ZuzhangEntity zuzhang = zuzhangService.selectById(id);
        return R.ok().put("data", zuzhang);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZuzhangEntity zuzhang, HttpServletRequest request){
    	zuzhang.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zuzhang);
    	ZuzhangEntity user = zuzhangService.selectOne(new EntityWrapper<ZuzhangEntity>().eq("zuzhangxuehao", zuzhang.getZuzhangxuehao()));
		if(user!=null) {
			return R.error("用户已存在");
		}
		zuzhang.setId(new Date().getTime());
        zuzhangService.insert(zuzhang);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ZuzhangEntity zuzhang, HttpServletRequest request){
    	zuzhang.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zuzhang);
    	ZuzhangEntity user = zuzhangService.selectOne(new EntityWrapper<ZuzhangEntity>().eq("zuzhangxuehao", zuzhang.getZuzhangxuehao()));
		if(user!=null) {
			return R.error("用户已存在");
		}
		zuzhang.setId(new Date().getTime());
        zuzhangService.insert(zuzhang);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ZuzhangEntity zuzhang, HttpServletRequest request){
        //ValidatorUtils.validateEntity(zuzhang);
        zuzhangService.updateById(zuzhang);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        zuzhangService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<ZuzhangEntity> wrapper = new EntityWrapper<ZuzhangEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = zuzhangService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
