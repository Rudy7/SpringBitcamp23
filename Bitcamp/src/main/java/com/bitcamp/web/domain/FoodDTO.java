package com.bitcamp.web.domain;

public class FoodDTO {
	private	String foodSeq, menu, price, count;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "메뉴[상품명:"+ menu + ", 가격:" + price + "원, 수량: " +count+"]";
}
}
