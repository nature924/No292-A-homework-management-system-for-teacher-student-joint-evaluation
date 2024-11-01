package com.entity.view;

import com.entity.KechengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 课程
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-17 20:30:54
 */
@TableName("kecheng")
public class KechengView  extends KechengEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public KechengView(){
	}
 
 	public KechengView(KechengEntity kechengEntity){
 	try {
			BeanUtils.copyProperties(this, kechengEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
