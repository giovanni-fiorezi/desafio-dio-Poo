package br.com.dio.desafio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {

		Curso curso = new Curso();
		curso.setTitulo("Curso Java");
		curso.setDescricao("Curso de programação orientada a objetos");
		curso.setCargaHoraria(8);

		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria Java");
		mentoria.setDescricao("Mentoria do curso de Java");
		mentoria.setData(LocalDate.now());

		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devGiovanni = new Dev();
		devGiovanni.setNome("Giovanni");
		devGiovanni.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos" + devGiovanni.getConteudosInscritos());
		
//		System.out.println(curso);
//		System.out.println(mentoria);

	}

}
