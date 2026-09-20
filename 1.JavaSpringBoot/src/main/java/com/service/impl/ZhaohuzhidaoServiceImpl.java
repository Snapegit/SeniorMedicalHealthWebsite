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


import com.dao.ZhaohuzhidaoDao;
import com.entity.ZhaohuzhidaoEntity;
import com.service.ZhaohuzhidaoService;
import com.entity.vo.ZhaohuzhidaoVO;
import com.entity.view.ZhaohuzhidaoView;

@Service("zhaohuzhidaoService")
public class ZhaohuzhidaoServiceImpl extends ServiceImpl<ZhaohuzhidaoDao, ZhaohuzhidaoEntity> implements ZhaohuzhidaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhaohuzhidaoEntity> page = this.selectPage(
                new Query<ZhaohuzhidaoEntity>(params).getPage(),
                new EntityWrapper<ZhaohuzhidaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhaohuzhidaoEntity> wrapper) {
		  Page<ZhaohuzhidaoView> page =new Query<ZhaohuzhidaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<ZhaohuzhidaoVO> selectListVO(Wrapper<ZhaohuzhidaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhaohuzhidaoVO selectVO(Wrapper<ZhaohuzhidaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhaohuzhidaoView> selectListView(Wrapper<ZhaohuzhidaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhaohuzhidaoView selectView(Wrapper<ZhaohuzhidaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
