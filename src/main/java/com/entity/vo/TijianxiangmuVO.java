package com.entity.vo;

import com.entity.TijianxiangmuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 体检项目 
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-16 19:54:53
 */
public class TijianxiangmuVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
