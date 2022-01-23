import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso("Curso JAVA", "Descrição Curso JAVA", 10);
        Curso curso2 = new Curso("Curso JS", "Descrição Curso JS", 4);

        Mentoria mentoria = new Mentoria("Mentoria de JAVA", "Descrição mentoria JAVA", LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp JAVA Developer");
        bootcamp.setDescricao("Descrição Bootcamp JAVA Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devLucas = new Dev();
        devLucas.setNome("Lucas");
        devLucas.inscreverBootcamp(bootcamp);
        System.out.println("\nConteudos Inscritos Lucas: " + devLucas.getConteudosInscritos());
        devLucas.progredir();
        devLucas.progredir();
        System.out.println("------------------------------------------------");
        System.out.println("Conteudos Inscritos Lucas: " + devLucas.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Lucas: " + devLucas.getConteudosConcluidos());
        System.out.println("XP: " + devLucas.calcularTotalXp());

        System.out.println("\n-\n");

        Dev devPedro = new Dev();
        devPedro.setNome("Pedro");
        devPedro.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Pedro: " + devPedro.getConteudosInscritos());
        devPedro.progredir();
        devPedro.progredir();
        devPedro.progredir();
        System.out.println("------------------------------------------------");
        System.out.println("Conteudos Inscritos Pedro: " + devPedro.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Pedro: " + devPedro.getConteudosConcluidos());
        System.out.println("XP: " + devPedro.calcularTotalXp());

    }
}
