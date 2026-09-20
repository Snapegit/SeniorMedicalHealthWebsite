package com.entity.vo;

import com.entity.YundongjianyiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 运动建议
 * @author 
 * @email 
 * @date 2024-03-08 14:03:13
 */
public class YundongjianyiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 运动图片
	 */
	
	private String yundongtupian;
		
	/**
	 * 建议时长
	 */
	
	private String jianyishizhang;
		
	/**
	 * 建议频率
	 */
	
	private String jianyipinlv;
		
	/**
	 * 注意事项
	 */
	
	private String zhuyishixiang;
		
	/**
	 * 用户账号
	 */
	
	private String yonghuzhanghao;
		
	/**
	 * 用户姓名
	 */
	
	private String yonghuxingming;
				
	
	/**
	 * 设置：运动图片
	 */
	 
	public void setYundongtupian(String yundongtupian) {
		this.yundongtupian = yundongtupian;
	}
	
	/**
	 * 获取：运动图片
	 */
	public String getYundongtupian() {
		return yundongtupian;
	}
				
	
	/**
	 * 设置：建议时长
	 */
	 
	public void setJianyishizhang(String jianyishizhang) {
		this.jianyishizhang = jianyishizhang;
	}
	
	/**
	 * 获取：建议时长
	 */
	public String getJianyishizhang() {
		return jianyishizhang;
	}
				
	
	/**
	 * 设置：建议频率
	 */
	 
	public void setJianyipinlv(String jianyipinlv) {
		this.jianyipinlv = jianyipinlv;
	}
	
	/**
	 * 获取：建议频率
	 */
	public String getJianyipinlv() {
		return jianyipinlv;
	}
				
	
	/**
	 * 设置：注意事项
	 */
	 
	public void setZhuyishixiang(String zhuyishixiang) {
		this.zhuyishixiang = zhuyishixiang;
	}
	
	/**
	 * 获取：注意事项
	 */
	public String getZhuyishixiang() {
		return zhuyishixiang;
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
