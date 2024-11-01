package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZuoyehupingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZuoyehupingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZuoyehupingView;


/**
 * 作业互评
 *
 * @author 
 * @email 
 * @date 2021-04-17 20:30:54
 */
public interface ZuoyehupingService extends IService<ZuoyehupingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZuoyehupingVO> selectListVO(Wrapper<ZuoyehupingEntity> wrapper);
   	
   	ZuoyehupingVO selectVO(@Param("ew") Wrapper<ZuoyehupingEntity> wrapper);
   	
   	List<ZuoyehupingView> selectListView(Wrapper<ZuoyehupingEntity> wrapper);
   	
   	ZuoyehupingView selectView(@Param("ew") Wrapper<ZuoyehupingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZuoyehupingEntity> wrapper);
   	
}

