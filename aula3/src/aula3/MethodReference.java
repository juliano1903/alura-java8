package aula3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class MethodReference {

	public static void main(String[] args) {

		ArrayList<String> palavras = new ArrayList<>(Arrays.asList("Caelum", "Casa do codigo", "Alura"));
		
		palavras.sort(String.CASE_INSENSITIVE_ORDER);
		
		Consumer<String> impressor = System.out::println;
		
		palavras.forEach(System.out::println);
		
		palavras.forEach(impressor);
	}

}
