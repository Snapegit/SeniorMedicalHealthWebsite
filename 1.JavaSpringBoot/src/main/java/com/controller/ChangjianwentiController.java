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

import com.entity.ChangjianwentiEntity;
import com.entity.view.ChangjianwentiView;

import com.service.ChangjianwentiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.EncryptUtil;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * 常见问题
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-08 14:03:13
 */
@RestController
@RequestMapping("/changjianwenti")
public class ChangjianwentiController {
    @Autowired
    private ChangjianwentiService changjianwentiService;

    @Autowired
    private StoreupService storeupService;



    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ChangjianwentiEntity changjianwenti,
		HttpServletRequest request){
        EntityWrapper<ChangjianwentiEntity> ew = new EntityWrapper<ChangjianwentiEntity>();

		PageUtils page = changjianwentiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, changjianwenti), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ChangjianwentiEntity changjianwenti, 
		HttpServletRequest request){
        EntityWrapper<ChangjianwentiEntity> ew = new EntityWrapper<ChangjianwentiEntity>();

		PageUtils page = changjianwentiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, changjianwenti), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ChangjianwentiEntity changjianwenti){
       	EntityWrapper<ChangjianwentiEntity> ew = new EntityWrapper<ChangjianwentiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( changjianwenti, "changjianwenti")); 
        return R.ok().put("data", changjianwentiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ChangjianwentiEntity changjianwenti){
        EntityWrapper< ChangjianwentiEntity> ew = new EntityWrapper< ChangjianwentiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( changjianwenti, "changjianwenti")); 
		ChangjianwentiView changjianwentiView =  changjianwentiService.selectView(ew);
		return R.ok("查询常见问题成功").put("data", changjianwentiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ChangjianwentiEntity changjianwenti = changjianwentiService.selectById(id);
        return R.ok().put("data", changjianwenti);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ChangjianwentiEntity changjianwenti = changjianwentiService.selectById(id);
        return R.ok().put("data", changjianwenti);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R vote(@PathVariable("id") String id,String type){
        ChangjianwentiEntity changjianwenti = changjianwentiService.selectById(id);
        if(type.equals("1")) {
        	changjianwenti.setThumbsupnum(changjianwenti.getThumbsupnum()+1);
        } else {
        	changjianwenti.setCrazilynum(changjianwenti.getCrazilynum()+1);
        }
        changjianwentiService.updateById(changjianwenti);
        return R.ok("投票成功");
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ChangjianwentiEntity changjianwenti, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(changjianwenti);
        changjianwentiService.insert(changjianwenti);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ChangjianwentiEntity changjianwenti, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(changjianwenti);
        changjianwentiService.insert(changjianwenti);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ChangjianwentiEntity changjianwenti, HttpServletRequest request){
        //ValidatorUtils.validateEntity(changjianwenti);
        changjianwentiService.updateById(changjianwenti);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        changjianwentiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
