package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
import model.Service.ProductService;

public class Application {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		ProductService pS = new ProductService();
		List <Product> list = new ArrayList<Product>();
		
		list.add(new Product("TV", 900.0));
		list.add(new Product("Mouse", 50.0));
		list.add(new Product("Tablet", 350.0));
		list.add(new Product("HD case", 80.9));
		
		double sum = pS.filteredSum(list, p -> p.getName().charAt(0) == 'T'); // atribui minha funcao a uma variavel, para chama-la depois
		
		
		System.out.println("Sum = " + String.format("%.2f", sum));	
	}
}
