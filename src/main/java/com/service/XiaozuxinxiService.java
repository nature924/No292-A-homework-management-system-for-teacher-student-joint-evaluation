package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiaozuxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiaozuxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiaozuxinxiView;


/**
 * 小组信息
 *
 * @author 
 * @email 
 * @date 2021-04-17 20:30:54
 */
public interface XiaozuxinxiService extends IService<XiaozuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiaozuxinxiVO> selectListVO(Wrapper<XiaozuxinxiEntity> wrapper);
   	
   	XiaozuxinxiVO selectVO(@Param("ew") Wrapper<XiaozuxinxiEntity> wrapper);
   	
   	List<XiaozuxinxiView> selectListView(Wrapper<XiaozuxinxiEntity> wrapper);
   	
   	XiaozuxinxiView selectView(@Param("ew") Wrapper<XiaozuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiaozuxinxiEntity> wrapper);
   	
}

