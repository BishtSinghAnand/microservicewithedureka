package io.abisht.moviecatalogservice.models;

public class CatalogItem {
	
	private String name;
	private String dese;
	private int rating;
	
	
	
	public CatalogItem(String name, String dese, int rating) {
		super();
		this.name = name;
		this.dese = dese;
		this.rating = rating;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDese() {
		return dese;
	}
	public void setDese(String dese) {
		this.dese = dese;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}

}
