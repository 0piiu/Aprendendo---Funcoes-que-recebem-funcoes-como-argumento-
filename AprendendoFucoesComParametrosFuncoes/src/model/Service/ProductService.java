package model.Service;

import java.util.List;
import java.util.function.Predicate;

import entities.Product;

public class ProductService {
	public double filteredSum(List<Product> list, Predicate<Product> criteria) { // coloquei um predicato como sendo um parametro da minha funcao
		double sum = 0.0;
		 for(Product p : list) {
			 if(criteria.test(p)) {
				 sum += p.getPrice();
			 }
		 }
		 return sum;
	}
}


// obs: Lembrando que a interface funcional predicate, e uma  interface usada para FILTRAGEM, retornando um valor boolean