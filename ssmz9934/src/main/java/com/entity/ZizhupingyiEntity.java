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
 * 资助评议
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-31 10:40:54
 */
@TableName("zizhupingyi")
public class ZizhupingyiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZizhupingyiEntity() {
		
	}
	
	public ZizhupingyiEntity(T t) {
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
	 * 评议标题
	 */
					
	private String pingyibiaoti;
	
	/**
	 * 评议封面
	 */
					
	private String pingyifengmian;
	
	/**
	 * 申请时间
	 */
					
	private String shenqingshijian;
	
	/**
	 * 班主任工号
	 */
					
	private String banzhurengonghao;
	
	/**
	 * 班主任姓名
	 */
					
	private String banzhurenxingming;
	
	/**
	 * 家长账号
	 */
					
	private String jiazhangzhanghao;
	
	/**
	 * 家长姓名
	 */
					
	private String jiazhangxingming;
	
	/**
	 * 学生姓名
	 */
					
	private String xueshengxingming;
	
	/**
	 * 贫困等级
	 */
					
	private String pinkundengji;
	
	/**
	 * 学校班级
	 */
					
	private String xuexiaobanji;
	
	/**
	 * 评议内容
	 */
					
	private String pingyineirong;
	
	/**
	 * 评议时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date pingyishijian;
	
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
	 * 设置：评议标题
	 */
	public void setPingyibiaoti(String pingyibiaoti) {
		this.pingyibiaoti = pingyibiaoti;
	}
	/**
	 * 获取：评议标题
	 */
	public String getPingyibiaoti() {
		return pingyibiaoti;
	}
	/**
	 * 设置：评议封面
	 */
	public void setPingyifengmian(String pingyifengmian) {
		this.pingyifengmian = pingyifengmian;
	}
	/**
	 * 获取：评议封面
	 */
	public String getPingyifengmian() {
		return pingyifengmian;
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
	 * 设置：班主任工号
	 */
	public void setBanzhurengonghao(String banzhurengonghao) {
		this.banzhurengonghao = banzhurengonghao;
	}
	/**
	 * 获取：班主任工号
	 */
	public String getBanzhurengonghao() {
		return banzhurengonghao;
	}
	/**
	 * 设置：班主任姓名
	 */
	public void setBanzhurenxingming(String banzhurenxingming) {
		this.banzhurenxingming = banzhurenxingming;
	}
	/**
	 * 获取：班主任姓名
	 */
	public String getBanzhurenxingming() {
		return banzhurenxingming;
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
	 * 设置：评议内容
	 */
	public void setPingyineirong(String pingyineirong) {
		this.pingyineirong = pingyineirong;
	}
	/**
	 * 获取：评议内容
	 */
	public String getPingyineirong() {
		return pingyineirong;
	}
	/**
	 * 设置：评议时间
	 */
	public void setPingyishijian(Date pingyishijian) {
		this.pingyishijian = pingyishijian;
	}
	/**
	 * 获取：评议时间
	 */
	public Date getPingyishijian() {
		return pingyishijian;
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
