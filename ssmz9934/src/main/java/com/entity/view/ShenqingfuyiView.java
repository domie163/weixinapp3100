package com.entity.view;

import com.entity.ShenqingfuyiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 申请复议
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-31 10:40:54
 */
@TableName("shenqingfuyi")
public class ShenqingfuyiView  extends ShenqingfuyiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShenqingfuyiView(){
	}
 
 	public ShenqingfuyiView(ShenqingfuyiEntity shenqingfuyiEntity){
 	try {
			BeanUtils.copyProperties(this, shenqingfuyiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
