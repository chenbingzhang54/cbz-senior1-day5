package com.cbz.bean;

public class GoodsBean extends Book{
	private int bid;
	
	private String bname;

	public GoodsBean() {
		super();
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	@Override
	public String toString() {
		return "GoodsBean [bid=" + bid + ", bname=" + bname + "]";
	}
	
	

}
