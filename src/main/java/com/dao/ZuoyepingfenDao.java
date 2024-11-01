package com.dao;

import com.entity.ZuoyepingfenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZuoyepingfenVO;
import com.entity.view.ZuoyepingfenView;


/**
 * 作业评分
 * 
 * @author 
 * @email 
 * @date 2021-04-17 20:30:54
 */
public interface ZuoyepingfenDao extends BaseMapper<ZuoyepingfenEntity> {
	
	List<ZuoyepingfenVO> selectListVO(@Param("ew") Wrapper<ZuoyepingfenEntity> wrapper);
	
	ZuoyepingfenVO selectVO(@Param("ew") Wrapper<ZuoyepingfenEntity> wrapper);
	
	List<ZuoyepingfenView> selectListView(@Param("ew") Wrapper<ZuoyepingfenEntity> wrapper);

	List<ZuoyepingfenView> selectListView(Pagination page,@Param("ew") Wrapper<ZuoyepingfenEntity> wrapper);
	
	ZuoyepingfenView selectView(@Param("ew") Wrapper<ZuoyepingfenEntity> wrapper);
	
}
