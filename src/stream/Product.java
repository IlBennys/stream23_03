package stream;

import lombok.ToString;

@ToString
public class Product {
    private long id;
    private String name;
    private String category;
    private double price;

    public Product(String n, String c, double p) {
	this.name = n;
	this.category = c;
	this.price = p;
    }

    public String getCategory() {
	return category;

    }

    public double getPrice() {
	return price;
    }

    public double sconto() {
	return (price * 10) / 100;
    };

}
