package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

import entidades.Produto;

public class App05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		List<Produto> list = new ArrayList<>();

		list.add(new Produto("Tv", 900.0));
		list.add(new Produto("Mouse", 50.00));
		list.add(new Produto("Tablet", 350.00));
		list.add(new Produto("HD Case", 80.90));
		
		double factor= 1.1;
		
		
		
		list.forEach(p -> p.setPreco(p.getPreco()* factor));
		list.forEach(System.out::println);

	}
}





	


