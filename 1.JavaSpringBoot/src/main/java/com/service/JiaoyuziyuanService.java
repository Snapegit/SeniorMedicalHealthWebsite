package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaoyuziyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiaoyuziyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaoyuziyuanView;


/**
 * 教育资源
 *
 * @author 
 * @email 
 * @date 2024-03-08 14:03:13
 */
public interface JiaoyuziyuanService extends IService<JiaoyuziyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaoyuziyuanVO> selectListVO(Wrapper<JiaoyuziyuanEntity> wrapper);
   	
   	JiaoyuziyuanVO selectVO(@Param("ew") Wrapper<JiaoyuziyuanEntity> wrapper);
   	
   	List<JiaoyuziyuanView> selectListView(Wrapper<JiaoyuziyuanEntity> wrapper);
   	
   	JiaoyuziyuanView selectView(@Param("ew") Wrapper<JiaoyuziyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaoyuziyuanEntity> wrapper);

   	

}

