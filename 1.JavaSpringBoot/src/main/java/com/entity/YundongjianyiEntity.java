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
 * 运动建议
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-03-08 14:03:13
 */
@TableName("yundongjianyi")
public class YundongjianyiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YundongjianyiEntity() {
		
	}
	
	public YundongjianyiEntity(T t) {
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
    @TableId(type = IdType.AUTO)
    private Long id;
	/**
	 * 运动项目
	 */
					
	private String yundongxiangmu;
	
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
	 * 设置：运动项目
	 */
	public void setYundongxiangmu(String yundongxiangmu) {
		this.yundongxiangmu = yundongxiangmu;
	}
	/**
	 * 获取：运动项目
	 */
	public String getYundongxiangmu() {
		return yundongxiangmu;
	}
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
