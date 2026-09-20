package com.entity.vo;

import com.entity.JiankangshujuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 健康数据
 * @author 
 * @email 
 * @date 2024-03-08 14:03:13
 */
public class JiankangshujuVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date riqi;
		
	/**
	 * 体重
	 */
	
	private Double tizhong;
		
	/**
	 * 血压
	 */
	
	private Double xueya;
		
	/**
	 * 血脂
	 */
	
	private Double xuezhi;
		
	/**
	 * 血糖
	 */
	
	private Double xuetang;
		
	/**
	 * 心率
	 */
	
	private Double xinlv;
		
	/**
	 * 用户账号
	 */
	
	private String yonghuzhanghao;
		
	/**
	 * 用户姓名
	 */
	
	private String yonghuxingming;
		
	/**
	 * 头像
	 */
	
	private String touxiang;
				
	
	/**
	 * 设置：日期
	 */
	 
	public void setRiqi(Date riqi) {
		this.riqi = riqi;
	}
	
	/**
	 * 获取：日期
	 */
	public Date getRiqi() {
		return riqi;
	}
				
	
	/**
	 * 设置：体重
	 */
	 
	public void setTizhong(Double tizhong) {
		this.tizhong = tizhong;
	}
	
	/**
	 * 获取：体重
	 */
	public Double getTizhong() {
		return tizhong;
	}
				
	
	/**
	 * 设置：血压
	 */
	 
	public void setXueya(Double xueya) {
		this.xueya = xueya;
	}
	
	/**
	 * 获取：血压
	 */
	public Double getXueya() {
		return xueya;
	}
				
	
	/**
	 * 设置：血脂
	 */
	 
	public void setXuezhi(Double xuezhi) {
		this.xuezhi = xuezhi;
	}
	
	/**
	 * 获取：血脂
	 */
	public Double getXuezhi() {
		return xuezhi;
	}
				
	
	/**
	 * 设置：血糖
	 */
	 
	public void setXuetang(Double xuetang) {
		this.xuetang = xuetang;
	}
	
	/**
	 * 获取：血糖
	 */
	public Double getXuetang() {
		return xuetang;
	}
				
	
	/**
	 * 设置：心率
	 */
	 
	public void setXinlv(Double xinlv) {
		this.xinlv = xinlv;
	}
	
	/**
	 * 获取：心率
	 */
	public Double getXinlv() {
		return xinlv;
	}
				
	
	/**
	 * 设置：用户账号
	 */
	 
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
				
	
	/**
	 * 设置：用户姓名
	 */
	 
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
				
	
	/**
	 * 设置：头像
	 */
	 
	public void setTouxiang(String touxiang) {
		this.touxiang = touxiang;
	}
	
	/**
	 * 获取：头像
	 */
	public String getTouxiang() {
		return touxiang;
	}
			
}
