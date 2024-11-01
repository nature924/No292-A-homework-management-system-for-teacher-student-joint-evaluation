package com.dao;

import com.entity.XiaozuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiaozuxinxiVO;
import com.entity.view.XiaozuxinxiView;


/**
 * 小组信息
 * 
 * @author 
 * @email 
 * @date 2021-04-17 20:30:54
 */
public interface XiaozuxinxiDao extends BaseMapper<XiaozuxinxiEntity> {
	
	List<XiaozuxinxiVO> selectListVO(@Param("ew") Wrapper<XiaozuxinxiEntity> wrapper);
	
	XiaozuxinxiVO selectVO(@Param("ew") Wrapper<XiaozuxinxiEntity> wrapper);
	
	List<XiaozuxinxiView> selectListView(@Param("ew") Wrapper<XiaozuxinxiEntity> wrapper);

	List<XiaozuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<XiaozuxinxiEntity> wrapper);
	
	XiaozuxinxiView selectView(@Param("ew") Wrapper<XiaozuxinxiEntity> wrapper);
	
}
