package com.entity.view;

import com.entity.ZizhushenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 资助申请
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-31 10:40:54
 */
@TableName("zizhushenqing")
public class ZizhushenqingView  extends ZizhushenqingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZizhushenqingView(){
	}
 
 	public ZizhushenqingView(ZizhushenqingEntity zizhushenqingEntity){
 	try {
			BeanUtils.copyProperties(this, zizhushenqingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
