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
 * 体检项目
 * 数据库通用操作实体类（普通增删改查）
 */
@TableName("tijianxiangmu")
public class TijianxiangmuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public TijianxiangmuEntity() {
		
	}
	
	public TijianxiangmuEntity(T t) {
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
	 * 项目封面
	 */
					
	private String xiangmufengmian;
	
	/**
	 * 项目价格
	 */
					
	private Integer xiangmujiage;
	
	/**
	 * 体检类型
	 */
					
	private String tijianleixing;
	
	/**
	 * 体检套餐
	 */
					
	private String tijiantaocan;
	
	/**
	 * 套餐内容
	 */
					
	private String taocanneirong;
	
	/**
	 * 适宜人群
	 */
					
	private String shiyirenqun;
	
	/**
	 * 项目介绍
	 */
					
	private String xiangmujieshao;
	
	
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
	 * 设置：项目封面
	 */
	public void setXiangmufengmian(String xiangmufengmian) {
		this.xiangmufengmian = xiangmufengmian;
	}
	/**
	 * 获取：项目封面
	 */
	public String getXiangmufengmian() {
		return xiangmufengmian;
	}
	/**
	 * 设置：项目价格
	 */
	public void setXiangmujiage(Integer xiangmujiage) {
		this.xiangmujiage = xiangmujiage;
	}
	/**
	 * 获取：项目价格
	 */
	public Integer getXiangmujiage() {
		return xiangmujiage;
	}
	/**
	 * 设置：体检类型
	 */
	public void setTijianleixing(String tijianleixing) {
		this.tijianleixing = tijianleixing;
	}
	/**
	 * 获取：体检类型
	 */
	public String getTijianleixing() {
		return tijianleixing;
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
	 * 设置：套餐内容
	 */
	public void setTaocanneirong(String taocanneirong) {
		this.taocanneirong = taocanneirong;
	}
	/**
	 * 获取：套餐内容
	 */
	public String getTaocanneirong() {
		return taocanneirong;
	}
	/**
	 * 设置：适宜人群
	 */
	public void setShiyirenqun(String shiyirenqun) {
		this.shiyirenqun = shiyirenqun;
	}
	/**
	 * 获取：适宜人群
	 */
	public String getShiyirenqun() {
		return shiyirenqun;
	}
	/**
	 * 设置：项目介绍
	 */
	public void setXiangmujieshao(String xiangmujieshao) {
		this.xiangmujieshao = xiangmujieshao;
	}
	/**
	 * 获取：项目介绍
	 */
	public String getXiangmujieshao() {
		return xiangmujieshao;
	}

}
