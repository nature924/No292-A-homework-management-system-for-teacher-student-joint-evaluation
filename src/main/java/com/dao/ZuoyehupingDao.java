package com.dao;

import com.entity.ZuoyehupingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZuoyehupingVO;
import com.entity.view.ZuoyehupingView;


/**
 * 作业互评
 * 
 * @author 
 * @email 
 * @date 2021-04-17 20:30:54
 */
public interface ZuoyehupingDao extends BaseMapper<ZuoyehupingEntity> {
	
	List<ZuoyehupingVO> selectListVO(@Param("ew") Wrapper<ZuoyehupingEntity> wrapper);
	
	ZuoyehupingVO selectVO(@Param("ew") Wrapper<ZuoyehupingEntity> wrapper);
	
	List<ZuoyehupingView> selectListView(@Param("ew") Wrapper<ZuoyehupingEntity> wrapper);

	List<ZuoyehupingView> selectListView(Pagination page,@Param("ew") Wrapper<ZuoyehupingEntity> wrapper);
	
	ZuoyehupingView selectView(@Param("ew") Wrapper<ZuoyehupingEntity> wrapper);
	
}
