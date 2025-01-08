package com.entity.model;

import com.entity.TijianyuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 体检预约
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 */
public class TijianyuyueModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 项目名称
	 */
	
	private String xiangmumingcheng;
		
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
	 * 体检状态
	 */
	
	private String tijianzhuangtai;
		
	/**
	 * 预约时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date yuyueshijian;
		
	/**
	 * 预约内容
	 */
	
	private String yuyueneirong;
		
	/**
	 * 用户名
	 */
	
	private String yonghuming;
		
	/**
	 * 手机
	 */
	
	private String shouji;
		
	/**
	 * 身份证
	 */
	
	private String shenfenzheng;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
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
	 * 设置：体检状态
	 */
	 
	public void setTijianzhuangtai(String tijianzhuangtai) {
		this.tijianzhuangtai = tijianzhuangtai;
	}
	
	/**
	 * 获取：体检状态
	 */
	public String getTijianzhuangtai() {
		return tijianzhuangtai;
	}
				
	
	/**
	 * 设置：预约时间
	 */
	 
	public void setYuyueshijian(Date yuyueshijian) {
		this.yuyueshijian = yuyueshijian;
	}
	
	/**
	 * 获取：预约时间
	 */
	public Date getYuyueshijian() {
		return yuyueshijian;
	}
				
	
	/**
	 * 设置：预约内容
	 */
	 
	public void setYuyueneirong(String yuyueneirong) {
		this.yuyueneirong = yuyueneirong;
	}
	
	/**
	 * 获取：预约内容
	 */
	public String getYuyueneirong() {
		return yuyueneirong;
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
				
	
	/**
	 * 设置：身份证
	 */
	 
	public void setShenfenzheng(String shenfenzheng) {
		this.shenfenzheng = shenfenzheng;
	}
	
	/**
	 * 获取：身份证
	 */
	public String getShenfenzheng() {
		return shenfenzheng;
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
				
	
	/**
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
			
}
