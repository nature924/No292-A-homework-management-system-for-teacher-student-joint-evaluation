package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZuzhangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZuzhangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZuzhangView;


/**
 * 组长
 *
 * @author 
 * @email 
 * @date 2021-04-17 20:30:54
 */
public interface ZuzhangService extends IService<ZuzhangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZuzhangVO> selectListVO(Wrapper<ZuzhangEntity> wrapper);
   	
   	ZuzhangVO selectVO(@Param("ew") Wrapper<ZuzhangEntity> wrapper);
   	
   	List<ZuzhangView> selectListView(Wrapper<ZuzhangEntity> wrapper);
   	
   	ZuzhangView selectView(@Param("ew") Wrapper<ZuzhangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZuzhangEntity> wrapper);
   	
}

