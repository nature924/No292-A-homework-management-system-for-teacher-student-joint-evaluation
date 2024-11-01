package com.entity.view;

import com.entity.ZuoyepingfenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 作业评分
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-17 20:30:54
 */
@TableName("zuoyepingfen")
public class ZuoyepingfenView  extends ZuoyepingfenEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZuoyepingfenView(){
	}
 
 	public ZuoyepingfenView(ZuoyepingfenEntity zuoyepingfenEntity){
 	try {
			BeanUtils.copyProperties(this, zuoyepingfenEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
