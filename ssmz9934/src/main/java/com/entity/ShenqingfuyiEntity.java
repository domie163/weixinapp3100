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
 * 申请复议
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-31 10:40:54
 */
@TableName("shenqingfuyi")
public class ShenqingfuyiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShenqingfuyiEntity() {
		
	}
	
	public ShenqingfuyiEntity(T t) {
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
	 * 公示标题
	 */
					
	private String gongshibiaoti;
	
	/**
	 * 公示图片
	 */
					
	private String gongshitupian;
	
	/**
	 * 家长账号
	 */
					
	private String jiazhangzhanghao;
	
	/**
	 * 家长姓名
	 */
					
	private String jiazhangxingming;
	
	/**
	 * 家长手机
	 */
					
	private String jiazhangshouji;
	
	/**
	 * 复议内容
	 */
					
	private String fuyineirong;
	
	/**
	 * 复议时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date fuyishijian;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	
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
	/**
	 * 设置：家长账号
	 */
	public void setJiazhangzhanghao(String jiazhangzhanghao) {
		this.jiazhangzhanghao = jiazhangzhanghao;
	}
	/**
	 * 获取：家长账号
	 */
	public String getJiazhangzhanghao() {
		return jiazhangzhanghao;
	}
	/**
	 * 设置：家长姓名
	 */
	public void setJiazhangxingming(String jiazhangxingming) {
		this.jiazhangxingming = jiazhangxingming;
	}
	/**
	 * 获取：家长姓名
	 */
	public String getJiazhangxingming() {
		return jiazhangxingming;
	}
	/**
	 * 设置：家长手机
	 */
	public void setJiazhangshouji(String jiazhangshouji) {
		this.jiazhangshouji = jiazhangshouji;
	}
	/**
	 * 获取：家长手机
	 */
	public String getJiazhangshouji() {
		return jiazhangshouji;
	}
	/**
	 * 设置：复议内容
	 */
	public void setFuyineirong(String fuyineirong) {
		this.fuyineirong = fuyineirong;
	}
	/**
	 * 获取：复议内容
	 */
	public String getFuyineirong() {
		return fuyineirong;
	}
	/**
	 * 设置：复议时间
	 */
	public void setFuyishijian(Date fuyishijian) {
		this.fuyishijian = fuyishijian;
	}
	/**
	 * 获取：复议时间
	 */
	public Date getFuyishijian() {
		return fuyishijian;
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

}
