package com.entity.model;

import com.entity.ZuoyetijiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 作业提交
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-17 20:30:54
 */
public class ZuoyetijiaoModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
