package com.entity.view;

import com.entity.TijianxiangmuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 体检项目 
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("tijianxiangmu")
public class TijianxiangmuView  extends TijianxiangmuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TijianxiangmuView(){
	}
 
 	public TijianxiangmuView(TijianxiangmuEntity tijianxiangmuEntity){
 	try {
			BeanUtils.copyProperties(this, tijianxiangmuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
