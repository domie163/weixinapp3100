package com.entity.view;

import com.entity.GonggaofenleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 公告分类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-31 10:40:54
 */
@TableName("gonggaofenlei")
public class GonggaofenleiView  extends GonggaofenleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GonggaofenleiView(){
	}
 
 	public GonggaofenleiView(GonggaofenleiEntity gonggaofenleiEntity){
 	try {
			BeanUtils.copyProperties(this, gonggaofenleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
