package stream;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import lombok.ToString;

@ToString
public class Order {
    private long id;
    private String status;
    private LocalDate orderDate;
    private LocalDate deliveryDate;
    private List<Product> products = new ArrayList<Product>();
    private Customer customer;

    public Order(List<Product> p) {
	this.products = p;
    }

}
