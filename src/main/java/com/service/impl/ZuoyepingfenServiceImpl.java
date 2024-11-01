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


import com.dao.ZuoyepingfenDao;
import com.entity.ZuoyepingfenEntity;
import com.service.ZuoyepingfenService;
import com.entity.vo.ZuoyepingfenVO;
import com.entity.view.ZuoyepingfenView;

@Service("zuoyepingfenService")
public class ZuoyepingfenServiceImpl extends ServiceImpl<ZuoyepingfenDao, ZuoyepingfenEntity> implements ZuoyepingfenService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZuoyepingfenEntity> page = this.selectPage(
                new Query<ZuoyepingfenEntity>(params).getPage(),
                new EntityWrapper<ZuoyepingfenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZuoyepingfenEntity> wrapper) {
		  Page<ZuoyepingfenView> page =new Query<ZuoyepingfenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZuoyepingfenVO> selectListVO(Wrapper<ZuoyepingfenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZuoyepingfenVO selectVO(Wrapper<ZuoyepingfenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZuoyepingfenView> selectListView(Wrapper<ZuoyepingfenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZuoyepingfenView selectView(Wrapper<ZuoyepingfenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
