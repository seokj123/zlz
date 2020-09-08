package org.zlz.springboot.goods.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.zlz.springboot.goods.bean.GoodsDemo;
import org.zlz.springboot.goods.service.GoodsDemoService;

@RestController
public class GoodsDemoController {
	
	@Autowired
	private GoodsDemoService goodsdemoService;
	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	/*
	 * restful风格
	 * get查询
	 * post添加
	 * put修改
	 * delete删除
	 */
	@GetMapping(value="queryGoodsAll")
	public List<GoodsDemo> queryGoogsAll(){
		return goodsdemoService.queryGoodsAll();
	}
	@PostMapping(value="addGoods")
	public boolean addGoods(@RequestBody GoodsDemo goodsdemo) throws ParseException {
		//先把creatData转成日期 然后再转成yyyy-mm-dd格式的字符串
		String string = goodsdemo.getCreatDate();
		Date parse = sdf.parse(string);
		goodsdemo.setCreatDate(sdf.format(parse));
		return goodsdemoService.addGoods(goodsdemo) > 0 ? true : false;
	} 
	@DeleteMapping(value="deleteGoods")
	public boolean deleteGoods(int id) {
		System.out.println("78979877");
		return goodsdemoService.deleteGoods(id) > 0 ? true : false;
	}
	
	@PostMapping(value="queryGoodsById")
	public GoodsDemo queryGoodsById(@RequestBody GoodsDemo goodsdemo){
		//先把creatData转成日期 然后再转成yyyy-mm-dd格式的字符串
		return goodsdemoService.queryGoodsById(goodsdemo);
	} 
	@PutMapping(value="updateGoods")
	public boolean updateGoods(@RequestBody GoodsDemo goodsdemo) throws ParseException {
		//先把creatData转成日期 然后再转成yyyy-mm-dd格式的字符串
		String string = goodsdemo.getCreatDate();
		System.out.println(string);
		Date parse = sdf.parse(string);
		System.out.println(parse);
		goodsdemo.setCreatDate(sdf.format(parse));
		return goodsdemoService.updateGoods(goodsdemo) > 0 ? true : false;
	} 
}
