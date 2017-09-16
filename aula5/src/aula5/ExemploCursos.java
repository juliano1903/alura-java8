package aula5;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

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

		Optional<Curso> optionalCursos = cursos.stream().filter(c -> c.getAlunos() >= 100).findAny();

		OptionalDouble mediaDouble = cursos.stream().mapToInt(c -> c.getAlunos()).average();

		optionalCursos.ifPresent(c -> System.out.println(c.getNome()));

		cursos.stream().filter(c -> c.getAlunos() >= 100).findAny().ifPresent(c -> System.out.println(c.getNome()));

		cursos.stream().filter(c -> c.getAlunos() >= 100)
				.collect(Collectors.toMap(c -> c.getNome(), c -> c.getAlunos()));

		cursos = cursos.stream().filter(c -> c.getAlunos() >= 100).collect(Collectors.toList());

		cursos.stream().filter(c -> c.getAlunos() > 50).findFirst();

	}

}
