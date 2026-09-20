package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YundongjianyiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YundongjianyiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YundongjianyiView;


/**
 * 运动建议
 *
 * @author 
 * @email 
 * @date 2024-03-08 14:03:13
 */
public interface YundongjianyiService extends IService<YundongjianyiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YundongjianyiVO> selectListVO(Wrapper<YundongjianyiEntity> wrapper);
   	
   	YundongjianyiVO selectVO(@Param("ew") Wrapper<YundongjianyiEntity> wrapper);
   	
   	List<YundongjianyiView> selectListView(Wrapper<YundongjianyiEntity> wrapper);
   	
   	YundongjianyiView selectView(@Param("ew") Wrapper<YundongjianyiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YundongjianyiEntity> wrapper);

   	

}

