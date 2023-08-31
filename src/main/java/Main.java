import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

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


        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
        System.out.println(mentoria2);



    }

}


