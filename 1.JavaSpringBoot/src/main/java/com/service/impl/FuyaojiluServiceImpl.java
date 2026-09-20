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


import com.dao.FuyaojiluDao;
import com.entity.FuyaojiluEntity;
import com.service.FuyaojiluService;
import com.entity.vo.FuyaojiluVO;
import com.entity.view.FuyaojiluView;

@Service("fuyaojiluService")
public class FuyaojiluServiceImpl extends ServiceImpl<FuyaojiluDao, FuyaojiluEntity> implements FuyaojiluService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FuyaojiluEntity> page = this.selectPage(
                new Query<FuyaojiluEntity>(params).getPage(),
                new EntityWrapper<FuyaojiluEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FuyaojiluEntity> wrapper) {
		  Page<FuyaojiluView> page =new Query<FuyaojiluView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<FuyaojiluVO> selectListVO(Wrapper<FuyaojiluEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FuyaojiluVO selectVO(Wrapper<FuyaojiluEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FuyaojiluView> selectListView(Wrapper<FuyaojiluEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FuyaojiluView selectView(Wrapper<FuyaojiluEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
