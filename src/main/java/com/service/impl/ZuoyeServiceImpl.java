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


import com.dao.ZuoyeDao;
import com.entity.ZuoyeEntity;
import com.service.ZuoyeService;
import com.entity.vo.ZuoyeVO;
import com.entity.view.ZuoyeView;

@Service("zuoyeService")
public class ZuoyeServiceImpl extends ServiceImpl<ZuoyeDao, ZuoyeEntity> implements ZuoyeService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZuoyeEntity> page = this.selectPage(
                new Query<ZuoyeEntity>(params).getPage(),
                new EntityWrapper<ZuoyeEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZuoyeEntity> wrapper) {
		  Page<ZuoyeView> page =new Query<ZuoyeView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZuoyeVO> selectListVO(Wrapper<ZuoyeEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZuoyeVO selectVO(Wrapper<ZuoyeEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZuoyeView> selectListView(Wrapper<ZuoyeEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZuoyeView selectView(Wrapper<ZuoyeEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
