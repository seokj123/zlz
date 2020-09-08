package org.zlz.springboot.goods.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zlz.springboot.goods.bean.GoodsDemo;
import org.zlz.springboot.goods.mapper.GoodsDemoMapper;
import org.zlz.springboot.goods.service.GoodsDemoService;

@Service
public class GoodsDemoServiceImpl implements GoodsDemoService{
	@Autowired
	private GoodsDemoMapper goodsDemoMapper;

	@Override
	public List<GoodsDemo> queryGoodsAll() {
		return goodsDemoMapper.queryGoodsAll();
	}

	@Override
	public int addGoods(GoodsDemo goodsdemo) {
		return goodsDemoMapper.addGoods(goodsdemo);
	}

	@Override
	public int deleteGoods(int id) {
		return goodsDemoMapper.deleteGoods(id);
	}

	@Override
	public GoodsDemo queryGoodsById(GoodsDemo goodsdemo) {
		return goodsDemoMapper.queryGoodsById(goodsdemo);
	}

	@Override
	public int updateGoods(GoodsDemo goodsdemo) {
		return goodsDemoMapper.updateGoods(goodsdemo);
	}
	
	
}
