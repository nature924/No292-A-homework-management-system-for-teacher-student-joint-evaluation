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
 * 组长
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-17 20:30:54
 */
@TableName("zuzhang")
public class ZuzhangEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZuzhangEntity() {
		
	}
	
	public ZuzhangEntity(T t) {
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
	 * 组长学号
	 */
					
	private String zuzhangxuehao;
	
	/**
	 * 密码
	 */
					
	private String mima;
	
	/**
	 * 组长姓名
	 */
					
	private String zuzhangxingming;
	
	/**
	 * 组长照片
	 */
					
	private String zuzhangzhaopian;
	
	/**
	 * 所在小组
	 */
					
	private String suozaixiaozu;
	
	/**
	 * 性别
	 */
					
	private String xingbie;
	
	/**
	 * 联系电话
	 */
					
	private String lianxidianhua;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	
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
	 * 设置：密码
	 */
	public void setMima(String mima) {
		this.mima = mima;
	}
	/**
	 * 获取：密码
	 */
	public String getMima() {
		return mima;
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
	 * 设置：组长照片
	 */
	public void setZuzhangzhaopian(String zuzhangzhaopian) {
		this.zuzhangzhaopian = zuzhangzhaopian;
	}
	/**
	 * 获取：组长照片
	 */
	public String getZuzhangzhaopian() {
		return zuzhangzhaopian;
	}
	/**
	 * 设置：所在小组
	 */
	public void setSuozaixiaozu(String suozaixiaozu) {
		this.suozaixiaozu = suozaixiaozu;
	}
	/**
	 * 获取：所在小组
	 */
	public String getSuozaixiaozu() {
		return suozaixiaozu;
	}
	/**
	 * 设置：性别
	 */
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
	/**
	 * 设置：联系电话
	 */
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：审核回复
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}

}
