package com.dao;

import com.entity.JiaoyuziyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaoyuziyuanVO;
import com.entity.view.JiaoyuziyuanView;


/**
 * 教育资源
 * 
 * @author 
 * @email 
 * @date 2024-03-08 14:03:13
 */
public interface JiaoyuziyuanDao extends BaseMapper<JiaoyuziyuanEntity> {
	
	List<JiaoyuziyuanVO> selectListVO(@Param("ew") Wrapper<JiaoyuziyuanEntity> wrapper);
	
	JiaoyuziyuanVO selectVO(@Param("ew") Wrapper<JiaoyuziyuanEntity> wrapper);
	
	List<JiaoyuziyuanView> selectListView(@Param("ew") Wrapper<JiaoyuziyuanEntity> wrapper);

	List<JiaoyuziyuanView> selectListView(Pagination page,@Param("ew") Wrapper<JiaoyuziyuanEntity> wrapper);

	
	JiaoyuziyuanView selectView(@Param("ew") Wrapper<JiaoyuziyuanEntity> wrapper);
	

}
