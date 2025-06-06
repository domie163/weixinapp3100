package com.entity.view;

import com.entity.HuizhigonggaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 回执公告
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-31 10:40:54
 */
@TableName("huizhigonggao")
public class HuizhigonggaoView  extends HuizhigonggaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HuizhigonggaoView(){
	}
 
 	public HuizhigonggaoView(HuizhigonggaoEntity huizhigonggaoEntity){
 	try {
			BeanUtils.copyProperties(this, huizhigonggaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
