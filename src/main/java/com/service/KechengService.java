package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KechengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KechengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KechengView;


/**
 * 课程
 *
 * @author 
 * @email 
 * @date 2021-04-17 20:30:54
 */
public interface KechengService extends IService<KechengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KechengVO> selectListVO(Wrapper<KechengEntity> wrapper);
   	
   	KechengVO selectVO(@Param("ew") Wrapper<KechengEntity> wrapper);
   	
   	List<KechengView> selectListView(Wrapper<KechengEntity> wrapper);
   	
   	KechengView selectView(@Param("ew") Wrapper<KechengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KechengEntity> wrapper);
   	
}

