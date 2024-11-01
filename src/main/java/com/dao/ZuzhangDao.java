package com.dao;

import com.entity.ZuzhangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZuzhangVO;
import com.entity.view.ZuzhangView;


/**
 * 组长
 * 
 * @author 
 * @email 
 * @date 2021-04-17 20:30:54
 */
public interface ZuzhangDao extends BaseMapper<ZuzhangEntity> {
	
	List<ZuzhangVO> selectListVO(@Param("ew") Wrapper<ZuzhangEntity> wrapper);
	
	ZuzhangVO selectVO(@Param("ew") Wrapper<ZuzhangEntity> wrapper);
	
	List<ZuzhangView> selectListView(@Param("ew") Wrapper<ZuzhangEntity> wrapper);

	List<ZuzhangView> selectListView(Pagination page,@Param("ew") Wrapper<ZuzhangEntity> wrapper);
	
	ZuzhangView selectView(@Param("ew") Wrapper<ZuzhangEntity> wrapper);
	
}
