package br.com.dio.desafio.dominio;

import java.util.*;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public Dev() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Conteudo conteudo) {
        conteudosInscritos.add(conteudo);
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Conteudo conteudo) {
        conteudosConcluidos.add(conteudo);
    }

    public void inscreverBootcamp(Bootcamp bootcamp) {
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.setDevsInscritos(this);
    }

    public void progredir(Conteudo conteudo) {
        if (this.conteudosInscritos.contains(conteudo)){
            this.conteudosConcluidos.add(conteudo);
            this.conteudosInscritos.remove(conteudo);
        }else {
            System.out.println("Vocé não está matriculado em " + conteudo);
        }
    }

    public void calcularTotalXp() {
        double xpTotal = 0d;
        for (Conteudo conteudo : conteudosConcluidos) {
                xpTotal += conteudo.calcularXp();
        }
        System.out.println("XP Total: " + xpTotal);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }

    @Override
    public String toString() {
        return "Dev{" +
                "nome='" + nome + '\'' +
                ", conteudosInscritos=" + conteudosInscritos +
                ", conteudosConcluidos=" + conteudosConcluidos +
                '}';
    }
}
