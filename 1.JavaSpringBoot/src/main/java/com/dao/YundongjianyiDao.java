package com.dao;

import com.entity.YundongjianyiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YundongjianyiVO;
import com.entity.view.YundongjianyiView;


/**
 * 运动建议
 * 
 * @author 
 * @email 
 * @date 2024-03-08 14:03:13
 */
public interface YundongjianyiDao extends BaseMapper<YundongjianyiEntity> {
	
	List<YundongjianyiVO> selectListVO(@Param("ew") Wrapper<YundongjianyiEntity> wrapper);
	
	YundongjianyiVO selectVO(@Param("ew") Wrapper<YundongjianyiEntity> wrapper);
	
	List<YundongjianyiView> selectListView(@Param("ew") Wrapper<YundongjianyiEntity> wrapper);

	List<YundongjianyiView> selectListView(Pagination page,@Param("ew") Wrapper<YundongjianyiEntity> wrapper);

	
	YundongjianyiView selectView(@Param("ew") Wrapper<YundongjianyiEntity> wrapper);
	

}
