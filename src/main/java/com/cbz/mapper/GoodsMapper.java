package com.cbz.mapper;

import java.util.List;

import com.cbz.bean.GoodVo;
import com.cbz.bean.Goods;
import com.cbz.bean.GoodsBean;

public interface GoodsMapper {
	public List<GoodsBean> getlist(GoodVo gv);
	
	public int addGoods(Goods gs);
	
	public Goods getlistgoodss(int id);
	
}
