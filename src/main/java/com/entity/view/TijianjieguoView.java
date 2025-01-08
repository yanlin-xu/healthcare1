package com.entity.view;

import com.entity.TijianjieguoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/** 
 * 体检结果
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("tijianjieguo")
public class TijianjieguoView  extends TijianjieguoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TijianjieguoView(){
	}
 
 	public TijianjieguoView(TijianjieguoEntity tijianjieguoEntity){
 	try {
			BeanUtils.copyProperties(this, tijianjieguoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
