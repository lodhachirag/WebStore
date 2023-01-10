package com.vwits.webstore.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_cart")
public class Cart {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable=false)
	private String item_name;
	@Column(nullable=false)
	private int item_price;
	@Column(nullable=false)
	private int user_id;
	@Column(nullable=false)
	private String img;
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cart(int id, String item_name, int item_price, int user_id, String img) {
		super();
		this.id = id;
		this.item_name = item_name;
		this.item_price = item_price;
		this.user_id = user_id;
		this.img= img;
	}
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public int getItem_price() {
		return item_price;
	}
	public void setItem_price(int item_price) {
		this.item_price = item_price;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	@Override
	public String toString() {
		return "Cart [id=" + id + ", item_name=" + item_name + ", item_price=" + item_price + ", user_id=" + user_id
				+ "]";
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	
}
