package com.entity.vo;

import com.entity.TijiantaocanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 体检套餐
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author  
 * @email 
 * @date 2022-04-16 19:54:53
 */
public class TijiantaocanVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 套餐内容
	 */
	
	private String taocanneirong;
				
	
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
			
}
