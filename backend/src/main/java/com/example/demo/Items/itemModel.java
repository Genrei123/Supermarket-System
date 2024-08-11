package com.example.demo.Items;
import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;



@Entity 
@Table(name="items")
public class itemModel {

	
	public itemModel() {}
	
	public itemModel(long id, String desc, String title, Float price, int quantity, String image) {
		super();
		this.id = id;
		this.desc = desc;
		this.title = title;
		this.price = price;
		this.quantity = quantity;
		this.image = image;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "description")
	private String desc;
	@Column(name = "title")
	private String title;
	@Column(name = "price")
	private Float price;
	@Column(name = "quantity")
	private int quantity;
	@Column(name = "image")
	private String image;

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
}
