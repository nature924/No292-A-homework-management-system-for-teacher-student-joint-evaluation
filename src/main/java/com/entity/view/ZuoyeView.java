package com.entity.view;

import com.entity.ZuoyeEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 作业
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-17 20:30:54
 */
@TableName("zuoye")
public class ZuoyeView  extends ZuoyeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZuoyeView(){
	}
 
 	public ZuoyeView(ZuoyeEntity zuoyeEntity){
 	try {
			BeanUtils.copyProperties(this, zuoyeEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
