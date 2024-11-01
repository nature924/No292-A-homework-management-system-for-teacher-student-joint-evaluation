package com.entity.model;

import com.entity.XiaozuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 小组信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-17 20:30:54
 */
public class XiaozuxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 小组名称
	 */
	
	private String xiaozumingcheng;
		
	/**
	 * 组长学号
	 */
	
	private String zuzhangxuehao;
		
	/**
	 * 组长姓名
	 */
	
	private String zuzhangxingming;
		
	/**
	 * 小组人数
	 */
	
	private Integer xiaozurenshu;
		
	/**
	 * 小组职能
	 */
	
	private String xiaozuzhineng;
		
	/**
	 * 学号
	 */
	
	private String xuehao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
				
	
	/**
	 * 设置：小组名称
	 */
	 
	public void setXiaozumingcheng(String xiaozumingcheng) {
		this.xiaozumingcheng = xiaozumingcheng;
	}
	
	/**
	 * 获取：小组名称
	 */
	public String getXiaozumingcheng() {
		return xiaozumingcheng;
	}
				
	
	/**
	 * 设置：组长学号
	 */
	 
	public void setZuzhangxuehao(String zuzhangxuehao) {
		this.zuzhangxuehao = zuzhangxuehao;
	}
	
	/**
	 * 获取：组长学号
	 */
	public String getZuzhangxuehao() {
		return zuzhangxuehao;
	}
				
	
	/**
	 * 设置：组长姓名
	 */
	 
	public void setZuzhangxingming(String zuzhangxingming) {
		this.zuzhangxingming = zuzhangxingming;
	}
	
	/**
	 * 获取：组长姓名
	 */
	public String getZuzhangxingming() {
		return zuzhangxingming;
	}
				
	
	/**
	 * 设置：小组人数
	 */
	 
	public void setXiaozurenshu(Integer xiaozurenshu) {
		this.xiaozurenshu = xiaozurenshu;
	}
	
	/**
	 * 获取：小组人数
	 */
	public Integer getXiaozurenshu() {
		return xiaozurenshu;
	}
				
	
	/**
	 * 设置：小组职能
	 */
	 
	public void setXiaozuzhineng(String xiaozuzhineng) {
		this.xiaozuzhineng = xiaozuzhineng;
	}
	
	/**
	 * 获取：小组职能
	 */
	public String getXiaozuzhineng() {
		return xiaozuzhineng;
	}
				
	
	/**
	 * 设置：学号
	 */
	 
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	
	/**
	 * 获取：学号
	 */
	public String getXuehao() {
		return xuehao;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
			
}
