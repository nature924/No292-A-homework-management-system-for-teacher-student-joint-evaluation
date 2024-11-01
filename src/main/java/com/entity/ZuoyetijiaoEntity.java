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
 * 作业提交
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-17 20:30:54
 */
@TableName("zuoyetijiao")
public class ZuoyetijiaoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZuoyetijiaoEntity() {
		
	}
	
	public ZuoyetijiaoEntity(T t) {
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
	 * 作业编号
	 */
					
	private String zuoyebianhao;
	
	/**
	 * 题目
	 */
					
	private String timu;
	
	/**
	 * 组
	 */
					
	private String zu;
	
	/**
	 * 内容
	 */
					
	private String neirong;
	
	/**
	 * 教师
	 */
					
	private String jiaoshi;
	
	/**
	 * 作业照片
	 */
					
	private String zuoyezhaopian;
	
	/**
	 * 工号
	 */
					
	private String gonghao;
	
	/**
	 * 教师姓名
	 */
					
	private String jiaoshixingming;
	
	/**
	 * 作业附件
	 */
					
	private String zuoyefujian;
	
	/**
	 * 附件名
	 */
					
	private String fujianming;
	
	/**
	 * 附件编号
	 */
					
	private String fujianbianhao;
	
	/**
	 * 上传时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date shangchuanshijian;
	
	/**
	 * 学号
	 */
					
	private String xuehao;
	
	/**
	 * 学生姓名
	 */
					
	private String xueshengxingming;
	
	/**
	 * 互评给分
	 */
					
	private String hupingjifen;
	
	
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
	 * 设置：作业编号
	 */
	public void setZuoyebianhao(String zuoyebianhao) {
		this.zuoyebianhao = zuoyebianhao;
	}
	/**
	 * 获取：作业编号
	 */
	public String getZuoyebianhao() {
		return zuoyebianhao;
	}
	/**
	 * 设置：题目
	 */
	public void setTimu(String timu) {
		this.timu = timu;
	}
	/**
	 * 获取：题目
	 */
	public String getTimu() {
		return timu;
	}
	/**
	 * 设置：组
	 */
	public void setZu(String zu) {
		this.zu = zu;
	}
	/**
	 * 获取：组
	 */
	public String getZu() {
		return zu;
	}
	/**
	 * 设置：内容
	 */
	public void setNeirong(String neirong) {
		this.neirong = neirong;
	}
	/**
	 * 获取：内容
	 */
	public String getNeirong() {
		return neirong;
	}
	/**
	 * 设置：教师
	 */
	public void setJiaoshi(String jiaoshi) {
		this.jiaoshi = jiaoshi;
	}
	/**
	 * 获取：教师
	 */
	public String getJiaoshi() {
		return jiaoshi;
	}
	/**
	 * 设置：作业照片
	 */
	public void setZuoyezhaopian(String zuoyezhaopian) {
		this.zuoyezhaopian = zuoyezhaopian;
	}
	/**
	 * 获取：作业照片
	 */
	public String getZuoyezhaopian() {
		return zuoyezhaopian;
	}
	/**
	 * 设置：工号
	 */
	public void setGonghao(String gonghao) {
		this.gonghao = gonghao;
	}
	/**
	 * 获取：工号
	 */
	public String getGonghao() {
		return gonghao;
	}
	/**
	 * 设置：教师姓名
	 */
	public void setJiaoshixingming(String jiaoshixingming) {
		this.jiaoshixingming = jiaoshixingming;
	}
	/**
	 * 获取：教师姓名
	 */
	public String getJiaoshixingming() {
		return jiaoshixingming;
	}
	/**
	 * 设置：作业附件
	 */
	public void setZuoyefujian(String zuoyefujian) {
		this.zuoyefujian = zuoyefujian;
	}
	/**
	 * 获取：作业附件
	 */
	public String getZuoyefujian() {
		return zuoyefujian;
	}
	/**
	 * 设置：附件名
	 */
	public void setFujianming(String fujianming) {
		this.fujianming = fujianming;
	}
	/**
	 * 获取：附件名
	 */
	public String getFujianming() {
		return fujianming;
	}
	/**
	 * 设置：附件编号
	 */
	public void setFujianbianhao(String fujianbianhao) {
		this.fujianbianhao = fujianbianhao;
	}
	/**
	 * 获取：附件编号
	 */
	public String getFujianbianhao() {
		return fujianbianhao;
	}
	/**
	 * 设置：上传时间
	 */
	public void setShangchuanshijian(Date shangchuanshijian) {
		this.shangchuanshijian = shangchuanshijian;
	}
	/**
	 * 获取：上传时间
	 */
	public Date getShangchuanshijian() {
		return shangchuanshijian;
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
	 * 设置：学生姓名
	 */
	public void setXueshengxingming(String xueshengxingming) {
		this.xueshengxingming = xueshengxingming;
	}
	/**
	 * 获取：学生姓名
	 */
	public String getXueshengxingming() {
		return xueshengxingming;
	}
	/**
	 * 设置：互评给分
	 */
	public void setHupingjifen(String hupingjifen) {
		this.hupingjifen = hupingjifen;
	}
	/**
	 * 获取：互评给分
	 */
	public String getHupingjifen() {
		return hupingjifen;
	}

}
