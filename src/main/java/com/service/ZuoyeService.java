package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZuoyeEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZuoyeVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZuoyeView;


/**
 * 作业
 *
 * @author 
 * @email 
 * @date 2021-04-17 20:30:54
 */
public interface ZuoyeService extends IService<ZuoyeEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZuoyeVO> selectListVO(Wrapper<ZuoyeEntity> wrapper);
   	
   	ZuoyeVO selectVO(@Param("ew") Wrapper<ZuoyeEntity> wrapper);
   	
   	List<ZuoyeView> selectListView(Wrapper<ZuoyeEntity> wrapper);
   	
   	ZuoyeView selectView(@Param("ew") Wrapper<ZuoyeEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZuoyeEntity> wrapper);
   	
}

