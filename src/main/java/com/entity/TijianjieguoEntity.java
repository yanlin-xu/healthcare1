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
 * 体检结果
 * 数据库通用操作实体类（普通增删改查）
 */
@TableName("tijianjieguo")
public class TijianjieguoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public TijianjieguoEntity() {
		
	}
	
	public TijianjieguoEntity(T t) {
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
	 * 科室名称
	 */
					
	private String keshimingcheng;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
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
	 * 设置：科室名称
	 */
	public void setKeshimingcheng(String keshimingcheng) {
		this.keshimingcheng = keshimingcheng;
	}
	/**
	 * 获取：科室名称
	 */
	public String getKeshimingcheng() {
		return keshimingcheng;
	}
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
