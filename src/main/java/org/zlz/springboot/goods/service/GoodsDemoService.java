package org.zlz.springboot.goods.service;

import java.util.List;

import org.zlz.springboot.goods.bean.GoodsDemo;

public interface GoodsDemoService {
	
	List<GoodsDemo> queryGoodsAll();
	
	int addGoods(GoodsDemo goodsdemo);
	
	int deleteGoods(int id);

	GoodsDemo queryGoodsById(GoodsDemo goodsdemo);

	int updateGoods(GoodsDemo goodsdemo);
}
