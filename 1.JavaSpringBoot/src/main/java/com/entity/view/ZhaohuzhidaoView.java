package com.entity.view;

import com.entity.ZhaohuzhidaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 照护指导
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-03-08 14:03:12
 */
@TableName("zhaohuzhidao")
public class ZhaohuzhidaoView  extends ZhaohuzhidaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhaohuzhidaoView(){
	}
 
 	public ZhaohuzhidaoView(ZhaohuzhidaoEntity zhaohuzhidaoEntity){
 	try {
			BeanUtils.copyProperties(this, zhaohuzhidaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
