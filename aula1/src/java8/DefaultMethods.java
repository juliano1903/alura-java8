package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Consumer;

public class DefaultMethods {

	public static void main(String[] args) {

		ArrayList<String> palavras = new ArrayList<>(Arrays.asList("Caelum", "Casa do codigo", "Alura"));

		Consumer<String> consumidorString = new ConsumidorString();


		Comparator<String> comparadorPorTamanho = new ComparadorPorTamanho();
		palavras.sort(comparadorPorTamanho);
		palavras.forEach(consumidorString);

	}

	static class ComparadorPorTamanho implements Comparator<String> {

		@Override
		public int compare(String s1, String s2) {
			if (s1.length() < s2.length())
				return -1;
			if (s1.length() > s2.length())
				return 1;
			return 0;
		}

	}

	static class ConsumidorString implements Consumer<String> {

		@Override
		public void accept(String s) {
			System.out.println(s);
		}

	}

}
