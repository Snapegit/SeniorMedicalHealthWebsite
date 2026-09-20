package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.YundongjianyiDao;
import com.entity.YundongjianyiEntity;
import com.service.YundongjianyiService;
import com.entity.vo.YundongjianyiVO;
import com.entity.view.YundongjianyiView;

@Service("yundongjianyiService")
public class YundongjianyiServiceImpl extends ServiceImpl<YundongjianyiDao, YundongjianyiEntity> implements YundongjianyiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YundongjianyiEntity> page = this.selectPage(
                new Query<YundongjianyiEntity>(params).getPage(),
                new EntityWrapper<YundongjianyiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YundongjianyiEntity> wrapper) {
		  Page<YundongjianyiView> page =new Query<YundongjianyiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<YundongjianyiVO> selectListVO(Wrapper<YundongjianyiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YundongjianyiVO selectVO(Wrapper<YundongjianyiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YundongjianyiView> selectListView(Wrapper<YundongjianyiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YundongjianyiView selectView(Wrapper<YundongjianyiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
