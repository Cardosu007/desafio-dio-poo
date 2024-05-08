import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Mentoria mentoria = new Mentoria();

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso de Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição do curso de JavaScript");
        curso2.setCargaHoraria(12);

        //System.out.println(curso);

        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição da mentoria de Java");
        mentoria.setData(LocalDate.now());

        // System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devWalter = new Dev();
        devWalter.setNome("Walter");
        devWalter.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Walter" + devWalter.getConteudosInscritos());
        devWalter.progredir();
        devWalter.progredir();
        System.out.println("-------");
        System.out.println("Conteúdos Inscritos Walter" + devWalter.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Walter" + devWalter.getConteudosConcluidos());
        System.out.println("XP: " + devWalter.calcularXp());
        System.out.println("------------------------------------------------------------------------------");
        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        System.out.println("-------");
        System.out.println("Conteúdos Inscritos Camila" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Camila" + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularXp());


    }
}