package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ZhaohuzhidaoEntity;
import com.entity.view.ZhaohuzhidaoView;

import com.service.ZhaohuzhidaoService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.EncryptUtil;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 照护指导
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-08 14:03:12
 */
@RestController
@RequestMapping("/zhaohuzhidao")
public class ZhaohuzhidaoController {
    @Autowired
    private ZhaohuzhidaoService zhaohuzhidaoService;




    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZhaohuzhidaoEntity zhaohuzhidao,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			zhaohuzhidao.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yisheng")) {
			zhaohuzhidao.setYishenggonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ZhaohuzhidaoEntity> ew = new EntityWrapper<ZhaohuzhidaoEntity>();

		PageUtils page = zhaohuzhidaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhaohuzhidao), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZhaohuzhidaoEntity zhaohuzhidao, 
		HttpServletRequest request){
        EntityWrapper<ZhaohuzhidaoEntity> ew = new EntityWrapper<ZhaohuzhidaoEntity>();

		PageUtils page = zhaohuzhidaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhaohuzhidao), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZhaohuzhidaoEntity zhaohuzhidao){
       	EntityWrapper<ZhaohuzhidaoEntity> ew = new EntityWrapper<ZhaohuzhidaoEntity>();
      	ew.allEq(MPUtil.allEQMapPre( zhaohuzhidao, "zhaohuzhidao")); 
        return R.ok().put("data", zhaohuzhidaoService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZhaohuzhidaoEntity zhaohuzhidao){
        EntityWrapper< ZhaohuzhidaoEntity> ew = new EntityWrapper< ZhaohuzhidaoEntity>();
 		ew.allEq(MPUtil.allEQMapPre( zhaohuzhidao, "zhaohuzhidao")); 
		ZhaohuzhidaoView zhaohuzhidaoView =  zhaohuzhidaoService.selectView(ew);
		return R.ok("查询照护指导成功").put("data", zhaohuzhidaoView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ZhaohuzhidaoEntity zhaohuzhidao = zhaohuzhidaoService.selectById(id);
        return R.ok().put("data", zhaohuzhidao);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ZhaohuzhidaoEntity zhaohuzhidao = zhaohuzhidaoService.selectById(id);
        return R.ok().put("data", zhaohuzhidao);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZhaohuzhidaoEntity zhaohuzhidao, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(zhaohuzhidao);
        zhaohuzhidaoService.insert(zhaohuzhidao);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ZhaohuzhidaoEntity zhaohuzhidao, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(zhaohuzhidao);
        zhaohuzhidaoService.insert(zhaohuzhidao);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ZhaohuzhidaoEntity zhaohuzhidao, HttpServletRequest request){
        //ValidatorUtils.validateEntity(zhaohuzhidao);
        zhaohuzhidaoService.updateById(zhaohuzhidao);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        zhaohuzhidaoService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
