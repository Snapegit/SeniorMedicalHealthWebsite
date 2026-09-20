package com.entity.vo;

import com.entity.FuyaojiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 服药记录
 * @author 
 * @email 
 * @date 2024-03-08 14:03:13
 */
public class FuyaojiluVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 剂量
	 */
	
	private String jiliang;
		
	/**
	 * 服用时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fuyongshijian;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 用户账号
	 */
	
	private String yonghuzhanghao;
		
	/**
	 * 用户姓名
	 */
	
	private String yonghuxingming;
				
	
	/**
	 * 设置：剂量
	 */
	 
	public void setJiliang(String jiliang) {
		this.jiliang = jiliang;
	}
	
	/**
	 * 获取：剂量
	 */
	public String getJiliang() {
		return jiliang;
	}
				
	
	/**
	 * 设置：服用时间
	 */
	 
	public void setFuyongshijian(Date fuyongshijian) {
		this.fuyongshijian = fuyongshijian;
	}
	
	/**
	 * 获取：服用时间
	 */
	public Date getFuyongshijian() {
		return fuyongshijian;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
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
			
}
