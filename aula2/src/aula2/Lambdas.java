package aula2;

import java.util.ArrayList;
import java.util.Arrays;

public class Lambdas {
	public static void main(String[] args) {

		ArrayList<String> palavras = new ArrayList<>(Arrays.asList("Caelum", "Casa do codigo", "Alura"));

		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		palavras.sort((s1, s2) -> s1.length() - s2.length());
		palavras.forEach(s -> System.out.println(s));
		
		new Thread(() -> System.out.println("Executando")).start();
		
	}
}
