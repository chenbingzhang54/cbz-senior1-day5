package com.cbz.bean;

import java.util.Arrays;

public class GoodVo extends Goods{
	private String name;
	
	private Integer[] ids;

	public GoodVo() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer[] getIds() {
		return ids;
	}

	public void setIds(Integer[] ids) {
		this.ids = ids;
	}

	@Override
	public String toString() {
		return "GoodVo [name=" + name + ", ids=" + Arrays.toString(ids) + "]";
	}
	
	

}
