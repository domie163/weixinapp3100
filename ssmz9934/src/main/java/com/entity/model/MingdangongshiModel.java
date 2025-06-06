package com.entity.model;

import com.entity.MingdangongshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 名单公示
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-03-31 10:40:54
 */
public class MingdangongshiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 学校班级
	 */
	
	private String xuexiaobanji;
		
	/**
	 * 贫困等级
	 */
	
	private String pinkundengji;
		
	/**
	 * 审批时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shenpishijian;
		
	/**
	 * 资助金额
	 */
	
	private String zizhujine;
		
	/**
	 * 学生姓名
	 */
	
	private String xueshengxingming;
		
	/**
	 * 资助年限
	 */
	
	private String zizhunianxian;
		
	/**
	 * 公示标题
	 */
	
	private String gongshibiaoti;
		
	/**
	 * 公示图片
	 */
	
	private String gongshitupian;
				
	
	/**
	 * 设置：学校班级
	 */
	 
	public void setXuexiaobanji(String xuexiaobanji) {
		this.xuexiaobanji = xuexiaobanji;
	}
	
	/**
	 * 获取：学校班级
	 */
	public String getXuexiaobanji() {
		return xuexiaobanji;
	}
				
	
	/**
	 * 设置：贫困等级
	 */
	 
	public void setPinkundengji(String pinkundengji) {
		this.pinkundengji = pinkundengji;
	}
	
	/**
	 * 获取：贫困等级
	 */
	public String getPinkundengji() {
		return pinkundengji;
	}
				
	
	/**
	 * 设置：审批时间
	 */
	 
	public void setShenpishijian(Date shenpishijian) {
		this.shenpishijian = shenpishijian;
	}
	
	/**
	 * 获取：审批时间
	 */
	public Date getShenpishijian() {
		return shenpishijian;
	}
				
	
	/**
	 * 设置：资助金额
	 */
	 
	public void setZizhujine(String zizhujine) {
		this.zizhujine = zizhujine;
	}
	
	/**
	 * 获取：资助金额
	 */
	public String getZizhujine() {
		return zizhujine;
	}
				
	
	/**
	 * 设置：学生姓名
	 */
	 
	public void setXueshengxingming(String xueshengxingming) {
		this.xueshengxingming = xueshengxingming;
	}
	
	/**
	 * 获取：学生姓名
	 */
	public String getXueshengxingming() {
		return xueshengxingming;
	}
				
	
	/**
	 * 设置：资助年限
	 */
	 
	public void setZizhunianxian(String zizhunianxian) {
		this.zizhunianxian = zizhunianxian;
	}
	
	/**
	 * 获取：资助年限
	 */
	public String getZizhunianxian() {
		return zizhunianxian;
	}
				
	
	/**
	 * 设置：公示标题
	 */
	 
	public void setGongshibiaoti(String gongshibiaoti) {
		this.gongshibiaoti = gongshibiaoti;
	}
	
	/**
	 * 获取：公示标题
	 */
	public String getGongshibiaoti() {
		return gongshibiaoti;
	}
				
	
	/**
	 * 设置：公示图片
	 */
	 
	public void setGongshitupian(String gongshitupian) {
		this.gongshitupian = gongshitupian;
	}
	
	/**
	 * 获取：公示图片
	 */
	public String getGongshitupian() {
		return gongshitupian;
	}
			
}
