import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main{

    public static void main(String[] args){

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("Descrição do curso de Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de MySQL");
        curso2.setDescricao("Descrição do curso de MySQL");
        curso2.setCargaHoraria(8);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Descrição da mentoria de Java");
        mentoria1.setData(LocalDate.of(2023,8,31));

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria de MySQL");
        mentoria2.setDescricao("Descrição da mentoria de MySQL");
        mentoria2.setData(LocalDate.of(2023,9,11));


        Bootcamp bootcampJava = new Bootcamp();
        bootcampJava.setNome("Bootcamp Java");
        bootcampJava.setDescricao("Descrição do Bootcamp Java");
        bootcampJava.setConteudos(curso1);
        bootcampJava.setConteudos(mentoria1);


        Bootcamp bootcampMySQL = new Bootcamp();
        bootcampMySQL.setNome("Bootcamp MySQL");
        bootcampMySQL.setDescricao("Descrição do Bootcamp MySQL");
        bootcampMySQL.setConteudos(curso2);
        bootcampMySQL.setConteudos(mentoria2);

        System.out.println(bootcampJava);
        System.out.println(bootcampMySQL);

        Dev dev1 = new Dev();
        dev1.setNome("Rafael");
        dev1.inscreverBootcamp(bootcampJava);
        System.out.println(dev1);
        dev1.progredir(mentoria2);
        dev1.progredir(curso1);
        System.out.println(dev1);
        dev1.calcularTotalXp();

        Dev dev2 = new Dev();
        dev2.setNome("Maria");
        dev2.inscreverBootcamp(bootcampMySQL);
        System.out.println(dev2);
        dev2.progredir(curso2);
        dev2.progredir(mentoria2);
        System.out.println(dev2);
        dev2.calcularTotalXp();


        System.out.println(bootcampJava);
        System.out.println(bootcampMySQL);



    }

}


