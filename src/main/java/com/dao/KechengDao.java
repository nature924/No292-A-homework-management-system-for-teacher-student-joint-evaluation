package com.dao;

import com.entity.KechengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KechengVO;
import com.entity.view.KechengView;


/**
 * 课程
 * 
 * @author 
 * @email 
 * @date 2021-04-17 20:30:54
 */
public interface KechengDao extends BaseMapper<KechengEntity> {
	
	List<KechengVO> selectListVO(@Param("ew") Wrapper<KechengEntity> wrapper);
	
	KechengVO selectVO(@Param("ew") Wrapper<KechengEntity> wrapper);
	
	List<KechengView> selectListView(@Param("ew") Wrapper<KechengEntity> wrapper);

	List<KechengView> selectListView(Pagination page,@Param("ew") Wrapper<KechengEntity> wrapper);
	
	KechengView selectView(@Param("ew") Wrapper<KechengEntity> wrapper);
	
}
