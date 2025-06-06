package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 名单公示
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-31 10:40:54
 */
@TableName("mingdangongshi")
public class MingdangongshiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public MingdangongshiEntity() {
		
	}
	
	public MingdangongshiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 申请时间
	 */
					
	private String shenqingshijian;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：申请时间
	 */
	public void setShenqingshijian(String shenqingshijian) {
		this.shenqingshijian = shenqingshijian;
	}
	/**
	 * 获取：申请时间
	 */
	public String getShenqingshijian() {
		return shenqingshijian;
	}
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
