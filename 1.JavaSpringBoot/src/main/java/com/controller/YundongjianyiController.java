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

import com.entity.YundongjianyiEntity;
import com.entity.view.YundongjianyiView;

import com.service.YundongjianyiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.EncryptUtil;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 运动建议
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-08 14:03:13
 */
@RestController
@RequestMapping("/yundongjianyi")
public class YundongjianyiController {
    @Autowired
    private YundongjianyiService yundongjianyiService;




    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YundongjianyiEntity yundongjianyi,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			yundongjianyi.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<YundongjianyiEntity> ew = new EntityWrapper<YundongjianyiEntity>();

		PageUtils page = yundongjianyiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yundongjianyi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YundongjianyiEntity yundongjianyi, 
		HttpServletRequest request){
        EntityWrapper<YundongjianyiEntity> ew = new EntityWrapper<YundongjianyiEntity>();

		PageUtils page = yundongjianyiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yundongjianyi), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YundongjianyiEntity yundongjianyi){
       	EntityWrapper<YundongjianyiEntity> ew = new EntityWrapper<YundongjianyiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yundongjianyi, "yundongjianyi")); 
        return R.ok().put("data", yundongjianyiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YundongjianyiEntity yundongjianyi){
        EntityWrapper< YundongjianyiEntity> ew = new EntityWrapper< YundongjianyiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yundongjianyi, "yundongjianyi")); 
		YundongjianyiView yundongjianyiView =  yundongjianyiService.selectView(ew);
		return R.ok("查询运动建议成功").put("data", yundongjianyiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YundongjianyiEntity yundongjianyi = yundongjianyiService.selectById(id);
        return R.ok().put("data", yundongjianyi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YundongjianyiEntity yundongjianyi = yundongjianyiService.selectById(id);
        return R.ok().put("data", yundongjianyi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YundongjianyiEntity yundongjianyi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(yundongjianyi);
        yundongjianyiService.insert(yundongjianyi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YundongjianyiEntity yundongjianyi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(yundongjianyi);
        yundongjianyiService.insert(yundongjianyi);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody YundongjianyiEntity yundongjianyi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yundongjianyi);
        yundongjianyiService.updateById(yundongjianyi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        yundongjianyiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
