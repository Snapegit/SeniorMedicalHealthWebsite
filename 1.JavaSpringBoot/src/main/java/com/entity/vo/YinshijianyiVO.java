package com.entity.vo;

import com.entity.YinshijianyiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 饮食建议
 * @author 
 * @email 
 * @date 2024-03-08 14:03:13
 */
public class YinshijianyiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 食物图片
	 */
	
	private String shiwutupian;
		
	/**
	 * 饮食分量
	 */
	
	private String yinshifenliang;
		
	/**
	 * 饮食频率
	 */
	
	private String yinshipinlv;
		
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
	 * 设置：食物图片
	 */
	 
	public void setShiwutupian(String shiwutupian) {
		this.shiwutupian = shiwutupian;
	}
	
	/**
	 * 获取：食物图片
	 */
	public String getShiwutupian() {
		return shiwutupian;
	}
				
	
	/**
	 * 设置：饮食分量
	 */
	 
	public void setYinshifenliang(String yinshifenliang) {
		this.yinshifenliang = yinshifenliang;
	}
	
	/**
	 * 获取：饮食分量
	 */
	public String getYinshifenliang() {
		return yinshifenliang;
	}
				
	
	/**
	 * 设置：饮食频率
	 */
	 
	public void setYinshipinlv(String yinshipinlv) {
		this.yinshipinlv = yinshipinlv;
	}
	
	/**
	 * 获取：饮食频率
	 */
	public String getYinshipinlv() {
		return yinshipinlv;
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
