package org.zlz.springboot.goods.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.zlz.springboot.goods.bean.GoodsDemo;

@Mapper
public interface GoodsDemoMapper {
	
	List<GoodsDemo> queryGoodsAll();
	
	int addGoods(GoodsDemo goodsdemo);
	
	int deleteGoods(int id);
	
	GoodsDemo queryGoodsById(GoodsDemo goodsdemo);

	int updateGoods(GoodsDemo goodsdemo);
}
