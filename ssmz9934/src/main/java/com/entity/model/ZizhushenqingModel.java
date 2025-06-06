package com.entity.model;

import com.entity.ZizhushenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 资助申请
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-03-31 10:40:54
 */
public class ZizhushenqingModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 申请时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shenqingshijian;
		
	/**
	 * 申请图片
	 */
	
	private String shenqingtupian;
		
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
	 * 班主任工号
	 */
	
	private String banzhurengonghao;
		
	/**
	 * 学校班级
	 */
	
	private String xuexiaobanji;
		
	/**
	 * 学生姓名
	 */
	
	private String xueshengxingming;
		
	/**
	 * 贫困等级
	 */
	
	private String pinkundengji;
		
	/**
	 * 申请理由
	 */
	
	private String shenqingliyou;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
	/**
	 * 设置：申请时间
	 */
	 
	public void setShenqingshijian(Date shenqingshijian) {
		this.shenqingshijian = shenqingshijian;
	}
	
	/**
	 * 获取：申请时间
	 */
	public Date getShenqingshijian() {
		return shenqingshijian;
	}
				
	
	/**
	 * 设置：申请图片
	 */
	 
	public void setShenqingtupian(String shenqingtupian) {
		this.shenqingtupian = shenqingtupian;
	}
	
	/**
	 * 获取：申请图片
	 */
	public String getShenqingtupian() {
		return shenqingtupian;
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
	 * 设置：申请理由
	 */
	 
	public void setShenqingliyou(String shenqingliyou) {
		this.shenqingliyou = shenqingliyou;
	}
	
	/**
	 * 获取：申请理由
	 */
	public String getShenqingliyou() {
		return shenqingliyou;
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
