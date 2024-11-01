package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 小组信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-17 20:30:54
 */
@TableName("xiaozuxinxi")
public class XiaozuxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XiaozuxinxiEntity() {
		
	}
	
	public XiaozuxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 小组编号
	 */
					
	private String xiaozubianhao;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：小组编号
	 */
	public void setXiaozubianhao(String xiaozubianhao) {
		this.xiaozubianhao = xiaozubianhao;
	}
	/**
	 * 获取：小组编号
	 */
	public String getXiaozubianhao() {
		return xiaozubianhao;
	}
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
