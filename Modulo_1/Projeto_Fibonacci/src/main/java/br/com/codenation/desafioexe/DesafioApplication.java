package br.com.codenation.desafioexe;

import java.util.ArrayList;
import java.util.List;

public class DesafioApplication {

	public static void main(String[] args) {
			System.out.println("O numero faz parte do Fibonacci? (true or false) => " + isFibonacci(8));
	}

	public static List<Integer> fibonacci() {
		List<Integer> listFibonacci = new ArrayList<>();
		listFibonacci.add(0);
		listFibonacci.add(1);
		int limit = 350;
		int fib = 0;
		while(fib < limit){
			int length = listFibonacci.size();
			fib = listFibonacci.get(length -1) + listFibonacci.get(length -2);
			listFibonacci.add(fib);
		}
	return listFibonacci;
	};

	public static Boolean isFibonacci(Integer a) {
		return fibonacci().contains(a);
	}
}