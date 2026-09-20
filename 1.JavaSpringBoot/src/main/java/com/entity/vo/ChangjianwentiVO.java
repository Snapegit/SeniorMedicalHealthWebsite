package com.entity.vo;

import com.entity.ChangjianwentiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 常见问题
 * @author 
 * @email 
 * @date 2024-03-08 14:03:13
 */
public class ChangjianwentiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 疾病类型
	 */
	
	private String jibingleixing;
		
	/**
	 * 疾病诊断
	 */
	
	private String jibingzhenduan;
		
	/**
	 * 疾病预防
	 */
	
	private String jibingyufang;
		
	/**
	 * 疾病治疗
	 */
	
	private String jibingzhiliao;
		
	/**
	 * 疾病图片
	 */
	
	private String jibingtupian;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
		
	/**
	 * 收藏数
	 */
	
	private Integer storeupnum;
				
	
	/**
	 * 设置：疾病类型
	 */
	 
	public void setJibingleixing(String jibingleixing) {
		this.jibingleixing = jibingleixing;
	}
	
	/**
	 * 获取：疾病类型
	 */
	public String getJibingleixing() {
		return jibingleixing;
	}
				
	
	/**
	 * 设置：疾病诊断
	 */
	 
	public void setJibingzhenduan(String jibingzhenduan) {
		this.jibingzhenduan = jibingzhenduan;
	}
	
	/**
	 * 获取：疾病诊断
	 */
	public String getJibingzhenduan() {
		return jibingzhenduan;
	}
				
	
	/**
	 * 设置：疾病预防
	 */
	 
	public void setJibingyufang(String jibingyufang) {
		this.jibingyufang = jibingyufang;
	}
	
	/**
	 * 获取：疾病预防
	 */
	public String getJibingyufang() {
		return jibingyufang;
	}
				
	
	/**
	 * 设置：疾病治疗
	 */
	 
	public void setJibingzhiliao(String jibingzhiliao) {
		this.jibingzhiliao = jibingzhiliao;
	}
	
	/**
	 * 获取：疾病治疗
	 */
	public String getJibingzhiliao() {
		return jibingzhiliao;
	}
				
	
	/**
	 * 设置：疾病图片
	 */
	 
	public void setJibingtupian(String jibingtupian) {
		this.jibingtupian = jibingtupian;
	}
	
	/**
	 * 获取：疾病图片
	 */
	public String getJibingtupian() {
		return jibingtupian;
	}
				
	
	/**
	 * 设置：赞
	 */
	 
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
				
	
	/**
	 * 设置：踩
	 */
	 
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
				
	
	/**
	 * 设置：收藏数
	 */
	 
	public void setStoreupnum(Integer storeupnum) {
		this.storeupnum = storeupnum;
	}
	
	/**
	 * 获取：收藏数
	 */
	public Integer getStoreupnum() {
		return storeupnum;
	}
			
}
