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

import com.entity.JiaoyuziyuanEntity;
import com.entity.view.JiaoyuziyuanView;

import com.service.JiaoyuziyuanService;
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
 * 教育资源
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-08 14:03:13
 */
@RestController
@RequestMapping("/jiaoyuziyuan")
public class JiaoyuziyuanController {
    @Autowired
    private JiaoyuziyuanService jiaoyuziyuanService;

    @Autowired
    private StoreupService storeupService;



    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JiaoyuziyuanEntity jiaoyuziyuan,
		HttpServletRequest request){
        EntityWrapper<JiaoyuziyuanEntity> ew = new EntityWrapper<JiaoyuziyuanEntity>();

		PageUtils page = jiaoyuziyuanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiaoyuziyuan), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JiaoyuziyuanEntity jiaoyuziyuan, 
		HttpServletRequest request){
        EntityWrapper<JiaoyuziyuanEntity> ew = new EntityWrapper<JiaoyuziyuanEntity>();

		PageUtils page = jiaoyuziyuanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiaoyuziyuan), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JiaoyuziyuanEntity jiaoyuziyuan){
       	EntityWrapper<JiaoyuziyuanEntity> ew = new EntityWrapper<JiaoyuziyuanEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jiaoyuziyuan, "jiaoyuziyuan")); 
        return R.ok().put("data", jiaoyuziyuanService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JiaoyuziyuanEntity jiaoyuziyuan){
        EntityWrapper< JiaoyuziyuanEntity> ew = new EntityWrapper< JiaoyuziyuanEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jiaoyuziyuan, "jiaoyuziyuan")); 
		JiaoyuziyuanView jiaoyuziyuanView =  jiaoyuziyuanService.selectView(ew);
		return R.ok("查询教育资源成功").put("data", jiaoyuziyuanView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JiaoyuziyuanEntity jiaoyuziyuan = jiaoyuziyuanService.selectById(id);
		jiaoyuziyuan.setClicknum(jiaoyuziyuan.getClicknum()+1);
		jiaoyuziyuan.setClicktime(new Date());
		jiaoyuziyuanService.updateById(jiaoyuziyuan);
        jiaoyuziyuan = jiaoyuziyuanService.selectView(new EntityWrapper<JiaoyuziyuanEntity>().eq("id", id));
        return R.ok().put("data", jiaoyuziyuan);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JiaoyuziyuanEntity jiaoyuziyuan = jiaoyuziyuanService.selectById(id);
		jiaoyuziyuan.setClicknum(jiaoyuziyuan.getClicknum()+1);
		jiaoyuziyuan.setClicktime(new Date());
		jiaoyuziyuanService.updateById(jiaoyuziyuan);
        jiaoyuziyuan = jiaoyuziyuanService.selectView(new EntityWrapper<JiaoyuziyuanEntity>().eq("id", id));
        return R.ok().put("data", jiaoyuziyuan);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R vote(@PathVariable("id") String id,String type){
        JiaoyuziyuanEntity jiaoyuziyuan = jiaoyuziyuanService.selectById(id);
        if(type.equals("1")) {
        	jiaoyuziyuan.setThumbsupnum(jiaoyuziyuan.getThumbsupnum()+1);
        } else {
        	jiaoyuziyuan.setCrazilynum(jiaoyuziyuan.getCrazilynum()+1);
        }
        jiaoyuziyuanService.updateById(jiaoyuziyuan);
        return R.ok("投票成功");
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JiaoyuziyuanEntity jiaoyuziyuan, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(jiaoyuziyuan);
        jiaoyuziyuanService.insert(jiaoyuziyuan);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JiaoyuziyuanEntity jiaoyuziyuan, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(jiaoyuziyuan);
        jiaoyuziyuanService.insert(jiaoyuziyuan);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody JiaoyuziyuanEntity jiaoyuziyuan, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jiaoyuziyuan);
        jiaoyuziyuanService.updateById(jiaoyuziyuan);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jiaoyuziyuanService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	
	/**
     * 前端智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,JiaoyuziyuanEntity jiaoyuziyuan, HttpServletRequest request,String pre){
        EntityWrapper<JiaoyuziyuanEntity> ew = new EntityWrapper<JiaoyuziyuanEntity>();
        Map<String, Object> newMap = new HashMap<String, Object>();
        Map<String, Object> param = new HashMap<String, Object>();
		Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = it.next();
			String key = entry.getKey();
			String newKey = entry.getKey();
			if (pre.endsWith(".")) {
				newMap.put(pre + newKey, entry.getValue());
			} else if (StringUtils.isEmpty(pre)) {
				newMap.put(newKey, entry.getValue());
			} else {
				newMap.put(pre + "." + newKey, entry.getValue());
			}
		}
		params.put("sort", "clicknum");
        params.put("order", "desc");
		PageUtils page = jiaoyuziyuanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiaoyuziyuan), params), params));
        return R.ok().put("data", page);
    }










}
