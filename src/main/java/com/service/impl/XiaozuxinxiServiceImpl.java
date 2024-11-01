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


import com.dao.XiaozuxinxiDao;
import com.entity.XiaozuxinxiEntity;
import com.service.XiaozuxinxiService;
import com.entity.vo.XiaozuxinxiVO;
import com.entity.view.XiaozuxinxiView;

@Service("xiaozuxinxiService")
public class XiaozuxinxiServiceImpl extends ServiceImpl<XiaozuxinxiDao, XiaozuxinxiEntity> implements XiaozuxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiaozuxinxiEntity> page = this.selectPage(
                new Query<XiaozuxinxiEntity>(params).getPage(),
                new EntityWrapper<XiaozuxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiaozuxinxiEntity> wrapper) {
		  Page<XiaozuxinxiView> page =new Query<XiaozuxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiaozuxinxiVO> selectListVO(Wrapper<XiaozuxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiaozuxinxiVO selectVO(Wrapper<XiaozuxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiaozuxinxiView> selectListView(Wrapper<XiaozuxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiaozuxinxiView selectView(Wrapper<XiaozuxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
