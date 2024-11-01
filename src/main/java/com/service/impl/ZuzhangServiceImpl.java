package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ZuzhangDao;
import com.entity.ZuzhangEntity;
import com.service.ZuzhangService;
import com.entity.vo.ZuzhangVO;
import com.entity.view.ZuzhangView;

@Service("zuzhangService")
public class ZuzhangServiceImpl extends ServiceImpl<ZuzhangDao, ZuzhangEntity> implements ZuzhangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZuzhangEntity> page = this.selectPage(
                new Query<ZuzhangEntity>(params).getPage(),
                new EntityWrapper<ZuzhangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZuzhangEntity> wrapper) {
		  Page<ZuzhangView> page =new Query<ZuzhangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZuzhangVO> selectListVO(Wrapper<ZuzhangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZuzhangVO selectVO(Wrapper<ZuzhangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZuzhangView> selectListView(Wrapper<ZuzhangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZuzhangView selectView(Wrapper<ZuzhangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
