package com.dao;

import com.entity.ZuoyeEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZuoyeVO;
import com.entity.view.ZuoyeView;


/**
 * 作业
 * 
 * @author 
 * @email 
 * @date 2021-04-17 20:30:54
 */
public interface ZuoyeDao extends BaseMapper<ZuoyeEntity> {
	
	List<ZuoyeVO> selectListVO(@Param("ew") Wrapper<ZuoyeEntity> wrapper);
	
	ZuoyeVO selectVO(@Param("ew") Wrapper<ZuoyeEntity> wrapper);
	
	List<ZuoyeView> selectListView(@Param("ew") Wrapper<ZuoyeEntity> wrapper);

	List<ZuoyeView> selectListView(Pagination page,@Param("ew") Wrapper<ZuoyeEntity> wrapper);
	
	ZuoyeView selectView(@Param("ew") Wrapper<ZuoyeEntity> wrapper);
	
}
