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


import com.dao.ZuoyehupingDao;
import com.entity.ZuoyehupingEntity;
import com.service.ZuoyehupingService;
import com.entity.vo.ZuoyehupingVO;
import com.entity.view.ZuoyehupingView;

@Service("zuoyehupingService")
public class ZuoyehupingServiceImpl extends ServiceImpl<ZuoyehupingDao, ZuoyehupingEntity> implements ZuoyehupingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZuoyehupingEntity> page = this.selectPage(
                new Query<ZuoyehupingEntity>(params).getPage(),
                new EntityWrapper<ZuoyehupingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZuoyehupingEntity> wrapper) {
		  Page<ZuoyehupingView> page =new Query<ZuoyehupingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZuoyehupingVO> selectListVO(Wrapper<ZuoyehupingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZuoyehupingVO selectVO(Wrapper<ZuoyehupingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZuoyehupingView> selectListView(Wrapper<ZuoyehupingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZuoyehupingView selectView(Wrapper<ZuoyehupingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
