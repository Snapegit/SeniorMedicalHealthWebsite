package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FuyaojiluEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FuyaojiluVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FuyaojiluView;


/**
 * 服药记录
 *
 * @author 
 * @email 
 * @date 2024-03-08 14:03:13
 */
public interface FuyaojiluService extends IService<FuyaojiluEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FuyaojiluVO> selectListVO(Wrapper<FuyaojiluEntity> wrapper);
   	
   	FuyaojiluVO selectVO(@Param("ew") Wrapper<FuyaojiluEntity> wrapper);
   	
   	List<FuyaojiluView> selectListView(Wrapper<FuyaojiluEntity> wrapper);
   	
   	FuyaojiluView selectView(@Param("ew") Wrapper<FuyaojiluEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FuyaojiluEntity> wrapper);

   	

}

