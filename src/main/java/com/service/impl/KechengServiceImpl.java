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


import com.dao.KechengDao;
import com.entity.KechengEntity;
import com.service.KechengService;
import com.entity.vo.KechengVO;
import com.entity.view.KechengView;

@Service("kechengService")
public class KechengServiceImpl extends ServiceImpl<KechengDao, KechengEntity> implements KechengService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KechengEntity> page = this.selectPage(
                new Query<KechengEntity>(params).getPage(),
                new EntityWrapper<KechengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KechengEntity> wrapper) {
		  Page<KechengView> page =new Query<KechengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KechengVO> selectListVO(Wrapper<KechengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KechengVO selectVO(Wrapper<KechengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KechengView> selectListView(Wrapper<KechengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KechengView selectView(Wrapper<KechengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
