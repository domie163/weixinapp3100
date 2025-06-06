package com.entity.model;

import com.entity.ShenqingfuyiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 申请复议
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-03-31 10:40:54
 */
public class ShenqingfuyiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
