import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootecamp = new Bootcamp();
        bootecamp.setNome("Bootcamp Java Developer");
        bootecamp.setDescricao("Descricao Bootcamp Java Developer");
        bootecamp.getConteudos().add(curso1);
        bootecamp.getConteudos().add(curso2);
        bootecamp.getConteudos().add(mentoria);

        Dev devElizangela = new Dev();
        devElizangela.setNome("Elizangela");
        devElizangela.inscreverBootcamp(bootecamp);
        System.out.println("Conteúdos Inscritos Elizangela:" + devElizangela.getConteudoInscritos());
        devElizangela.progredir();
        devElizangela.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Elizangela:" + devElizangela.getConteudoInscritos());
        System.out.println("Conteúdos concluídos Elizangela:" + devElizangela.getConteudoConcluidos());
        System.out.println("XP:" + devElizangela.calcularTotalXP());

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootecamp);
        System.out.println("Conteúdos Inscritos Joao:" + devJoao.getConteudoInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Joao:" + devJoao.getConteudoInscritos());
        System.out.println("Conteúdos concluídos Joao:" + devJoao.getConteudoConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXP());
    }
}