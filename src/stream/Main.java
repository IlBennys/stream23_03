package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	Logger logger = Logger.getLogger("com.api.jar");

	Product a1 = new Product("Horror", "Books", 120);
	Product a2 = new Product("Avengers", "Film", 90);
	Product a3 = new Product("Yellow", "Books", 90);
	Product a4 = new Product("Bimbo", "Baby", 150);
	Product a5 = new Product("Bimba", "Baby", 20);
	Product a6 = new Product("Bambino", "Boys", 10);
	Product a7 = new Product("Bambina", "Boys", 200);

	List<Product> prodotti = new ArrayList<Product>();
	prodotti.add(a1);
	prodotti.add(a2);
	prodotti.add(a3);
	prodotti.add(a4);
	prodotti.add(a5);
	prodotti.add(a6);
	prodotti.add(a7);

	List<Product> ordini = new ArrayList<Product>();
	prodotti.add(a1);
	prodotti.add(a2);
	prodotti.add(a3);
	prodotti.add(a4);
	prodotti.add(a5);
	prodotti.add(a6);
	prodotti.add(a7);

	List<Product> ordiniPlus = new ArrayList<Product>();
	ordiniPlus.add(a1);
	ordiniPlus.add(a2);
	ordiniPlus.add(a3);
	ordiniPlus.add(a4);
	ordiniPlus.add(a5);
	ordiniPlus.add(a6);
	ordiniPlus.add(a7);

	// PRODOTTI
	List<Product> resultArr = prodotti.stream().filter(x -> x.getCategory().equals("Books") && x.getPrice() > 100)
		.collect(Collectors.toList());

	System.out.println(resultArr.toString());

	// ORDINI
	List<Product> soloBaby = ordini.stream().filter(x -> x.getCategory().equals("Baby"))
		.collect(Collectors.toList());
	System.out.println(soloBaby.toString());

	Order o1 = new Order(soloBaby);
	Order o2 = new Order(soloBaby);
	Order o3 = new Order(soloBaby);
	Order o4 = new Order(soloBaby);
	Order o5 = new Order(soloBaby);

	logger.info(o1.toString());

	List<Double> soloBoys = ordiniPlus.stream().filter(x -> x.getCategory().equals("Boys")).map(x -> x.sconto())
		.collect(Collectors.toList());

	logger.info(soloBoys.toString());

    }

}