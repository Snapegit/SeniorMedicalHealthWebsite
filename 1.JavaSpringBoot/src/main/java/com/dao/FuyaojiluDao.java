package com.dao;

import com.entity.FuyaojiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FuyaojiluVO;
import com.entity.view.FuyaojiluView;


/**
 * 服药记录
 * 
 * @author 
 * @email 
 * @date 2024-03-08 14:03:13
 */
public interface FuyaojiluDao extends BaseMapper<FuyaojiluEntity> {
	
	List<FuyaojiluVO> selectListVO(@Param("ew") Wrapper<FuyaojiluEntity> wrapper);
	
	FuyaojiluVO selectVO(@Param("ew") Wrapper<FuyaojiluEntity> wrapper);
	
	List<FuyaojiluView> selectListView(@Param("ew") Wrapper<FuyaojiluEntity> wrapper);

	List<FuyaojiluView> selectListView(Pagination page,@Param("ew") Wrapper<FuyaojiluEntity> wrapper);

	
	FuyaojiluView selectView(@Param("ew") Wrapper<FuyaojiluEntity> wrapper);
	

}
