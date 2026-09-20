package com.dao;

import com.entity.ZhaohuzhidaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhaohuzhidaoVO;
import com.entity.view.ZhaohuzhidaoView;


/**
 * 照护指导
 * 
 * @author 
 * @email 
 * @date 2024-03-08 14:03:12
 */
public interface ZhaohuzhidaoDao extends BaseMapper<ZhaohuzhidaoEntity> {
	
	List<ZhaohuzhidaoVO> selectListVO(@Param("ew") Wrapper<ZhaohuzhidaoEntity> wrapper);
	
	ZhaohuzhidaoVO selectVO(@Param("ew") Wrapper<ZhaohuzhidaoEntity> wrapper);
	
	List<ZhaohuzhidaoView> selectListView(@Param("ew") Wrapper<ZhaohuzhidaoEntity> wrapper);

	List<ZhaohuzhidaoView> selectListView(Pagination page,@Param("ew") Wrapper<ZhaohuzhidaoEntity> wrapper);

	
	ZhaohuzhidaoView selectView(@Param("ew") Wrapper<ZhaohuzhidaoEntity> wrapper);
	

}
