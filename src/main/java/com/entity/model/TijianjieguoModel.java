package com.entity.model;

import com.entity.TijianjieguoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 体检结果
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 */
public class TijianjieguoModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 项目名称
	 */
	
	private String xiangmumingcheng;
		
	/**
	 * 体检套餐
	 */
	
	private String tijiantaocan;
		
	/**
	 * 报告文件
	 */
	
	private String baogaowenjian;
		
	/**
	 * 报告日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date baogaoriqi;
		
	/**
	 * 报告内容
	 */
	
	private String baogaoneirong;
		
	/**
	 * 用户名
	 */
	
	private String yonghuming;
		
	/**
	 * 手机
	 */
	
	private String shouji;
				
	
	/**
	 * 设置：项目名称
	 */
	 
	public void setXiangmumingcheng(String xiangmumingcheng) {
		this.xiangmumingcheng = xiangmumingcheng;
	}
	
	/**
	 * 获取：项目名称
	 */
	public String getXiangmumingcheng() {
		return xiangmumingcheng;
	}
				
	
	/**
	 * 设置：体检套餐
	 */
	 
	public void setTijiantaocan(String tijiantaocan) {
		this.tijiantaocan = tijiantaocan;
	}
	
	/**
	 * 获取：体检套餐
	 */
	public String getTijiantaocan() {
		return tijiantaocan;
	}
				
	
	/**
	 * 设置：报告文件
	 */
	 
	public void setBaogaowenjian(String baogaowenjian) {
		this.baogaowenjian = baogaowenjian;
	}
	
	/**
	 * 获取：报告文件
	 */
	public String getBaogaowenjian() {
		return baogaowenjian;
	}
				
	
	/**
	 * 设置：报告日期
	 */
	 
	public void setBaogaoriqi(Date baogaoriqi) {
		this.baogaoriqi = baogaoriqi;
	}
	
	/**
	 * 获取：报告日期
	 */
	public Date getBaogaoriqi() {
		return baogaoriqi;
	}
				
	
	/**
	 * 设置：报告内容
	 */
	 
	public void setBaogaoneirong(String baogaoneirong) {
		this.baogaoneirong = baogaoneirong;
	}
	
	/**
	 * 获取：报告内容
	 */
	public String getBaogaoneirong() {
		return baogaoneirong;
	}
				
	
	/**
	 * 设置：用户名
	 */
	 
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
	}
				
	
	/**
	 * 设置：手机
	 */
	 
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
			
}
