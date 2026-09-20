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

import com.entity.FuyaojiluEntity;
import com.entity.view.FuyaojiluView;

import com.service.FuyaojiluService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.EncryptUtil;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 服药记录
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-08 14:03:13
 */
@RestController
@RequestMapping("/fuyaojilu")
public class FuyaojiluController {
    @Autowired
    private FuyaojiluService fuyaojiluService;




    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,FuyaojiluEntity fuyaojilu,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			fuyaojilu.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<FuyaojiluEntity> ew = new EntityWrapper<FuyaojiluEntity>();

		PageUtils page = fuyaojiluService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, fuyaojilu), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,FuyaojiluEntity fuyaojilu, 
		HttpServletRequest request){
        EntityWrapper<FuyaojiluEntity> ew = new EntityWrapper<FuyaojiluEntity>();

		PageUtils page = fuyaojiluService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, fuyaojilu), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( FuyaojiluEntity fuyaojilu){
       	EntityWrapper<FuyaojiluEntity> ew = new EntityWrapper<FuyaojiluEntity>();
      	ew.allEq(MPUtil.allEQMapPre( fuyaojilu, "fuyaojilu")); 
        return R.ok().put("data", fuyaojiluService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(FuyaojiluEntity fuyaojilu){
        EntityWrapper< FuyaojiluEntity> ew = new EntityWrapper< FuyaojiluEntity>();
 		ew.allEq(MPUtil.allEQMapPre( fuyaojilu, "fuyaojilu")); 
		FuyaojiluView fuyaojiluView =  fuyaojiluService.selectView(ew);
		return R.ok("查询服药记录成功").put("data", fuyaojiluView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        FuyaojiluEntity fuyaojilu = fuyaojiluService.selectById(id);
        return R.ok().put("data", fuyaojilu);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        FuyaojiluEntity fuyaojilu = fuyaojiluService.selectById(id);
        return R.ok().put("data", fuyaojilu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody FuyaojiluEntity fuyaojilu, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(fuyaojilu);
        fuyaojiluService.insert(fuyaojilu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody FuyaojiluEntity fuyaojilu, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(fuyaojilu);
        fuyaojiluService.insert(fuyaojilu);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody FuyaojiluEntity fuyaojilu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(fuyaojilu);
        fuyaojiluService.updateById(fuyaojilu);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        fuyaojiluService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
