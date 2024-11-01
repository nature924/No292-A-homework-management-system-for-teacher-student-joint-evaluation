package com.entity.view;

import com.entity.ZuoyehupingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 作业互评
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-17 20:30:54
 */
@TableName("zuoyehuping")
public class ZuoyehupingView  extends ZuoyehupingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZuoyehupingView(){
	}
 
 	public ZuoyehupingView(ZuoyehupingEntity zuoyehupingEntity){
 	try {
			BeanUtils.copyProperties(this, zuoyehupingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
