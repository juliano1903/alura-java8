package aula4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ExemploCursos {

	static class Curso {

		String nome;
		int alunos;

		public Curso(String nome, int alunos) {
			this.nome = nome;
			this.alunos = alunos;
		}

		public String getNome() {
			return nome;
		}

		public int getAlunos() {
			return alunos;
		}

	}

	public static void main(String[] args) {

		List<Curso> cursos = new ArrayList<>();

		cursos.add(new Curso("Java", 135));
		cursos.add(new Curso("Python", 99));
		cursos.add(new Curso("C#", 150));

		cursos.sort(Comparator.comparing(Curso::getAlunos));

		cursos.stream().filter(c -> c.getAlunos() > 50).mapToInt(c -> c.getAlunos()).forEach(System.out::println);

		IntStream cursosInt = cursos.stream().filter(c -> c.getAlunos() > 100).mapToInt(c -> c.getAlunos());

		cursosInt.forEach(System.out::println);

		Stream<String> stringStream = cursos.stream().map(Curso::getNome);

		OptionalDouble mediaDouble = cursos.stream().filter(c -> c.getAlunos() >= 100).mapToInt(c -> c.getAlunos())
				.average();

		System.out.println(mediaDouble.getAsDouble());

		stringStream.forEach(System.out::println);

	}

}
