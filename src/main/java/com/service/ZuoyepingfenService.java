package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZuoyepingfenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZuoyepingfenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZuoyepingfenView;


/**
 * 作业评分
 *
 * @author 
 * @email 
 * @date 2021-04-17 20:30:54
 */
public interface ZuoyepingfenService extends IService<ZuoyepingfenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZuoyepingfenVO> selectListVO(Wrapper<ZuoyepingfenEntity> wrapper);
   	
   	ZuoyepingfenVO selectVO(@Param("ew") Wrapper<ZuoyepingfenEntity> wrapper);
   	
   	List<ZuoyepingfenView> selectListView(Wrapper<ZuoyepingfenEntity> wrapper);
   	
   	ZuoyepingfenView selectView(@Param("ew") Wrapper<ZuoyepingfenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZuoyepingfenEntity> wrapper);
   	
}

