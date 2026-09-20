package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhaohuzhidaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhaohuzhidaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhaohuzhidaoView;


/**
 * 照护指导
 *
 * @author 
 * @email 
 * @date 2024-03-08 14:03:12
 */
public interface ZhaohuzhidaoService extends IService<ZhaohuzhidaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhaohuzhidaoVO> selectListVO(Wrapper<ZhaohuzhidaoEntity> wrapper);
   	
   	ZhaohuzhidaoVO selectVO(@Param("ew") Wrapper<ZhaohuzhidaoEntity> wrapper);
   	
   	List<ZhaohuzhidaoView> selectListView(Wrapper<ZhaohuzhidaoEntity> wrapper);
   	
   	ZhaohuzhidaoView selectView(@Param("ew") Wrapper<ZhaohuzhidaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhaohuzhidaoEntity> wrapper);

   	

}

