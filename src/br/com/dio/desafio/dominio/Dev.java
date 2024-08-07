package br.com.dio.desafio.dominio;

import java.util.*;

/**
 * Classe que representa um Desenvolvedor (Dev).
 */
public class Dev {
    /**
     * Nome do desenvolvedor.
     */
    private String nome;

    /**
     * Conjunto de conteúdos inscritos pelo desenvolvedor.
     */
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();

    /**
     * Conjunto de conteúdos concluídos pelo desenvolvedor.
     */
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    /**
     * Inscreve o desenvolvedor em um bootcamp.
     * @param bootcamp Bootcamp no qual o desenvolvedor será inscrito.
     */
    public void inscreverBootcamp(Bootcamp bootcamp){
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }

    /**
     * Marca o progresso do desenvolvedor no bootcamp.
     */
    public void progredir() {
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        if(conteudo.isPresent()) {
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
        } else {
            System.err.println("Você não está matriculado em nenhum conteúdo!");
        }
    }

    /**
     * Calcula o total de XP do desenvolvedor.
     * @return total de XP.
     */
    public double calcularTotalXp() {
        return this.conteudosConcluidos
                .stream()
                .mapToDouble(Conteudo::calcularXp)
                .sum();
    }

    /**
     * Obtém o nome do desenvolvedor.
     * @return nome do desenvolvedor.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do desenvolvedor.
     * @param nome Nome do desenvolvedor.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém o conjunto de conteúdos inscritos pelo desenvolvedor.
     * @return conjunto de conteúdos inscritos.
     */
    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    /**
     * Define o conjunto de conteúdos inscritos pelo desenvolvedor.
     * @param conteudosInscritos Conjunto de conteúdos inscritos.
     */
    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    /**
     * Obtém o conjunto de conteúdos concluídos pelo desenvolvedor.
     * @return conjunto de conteúdos concluídos.
     */
    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    /**
     * Define o conjunto de conteúdos concluídos pelo desenvolvedor.
     * @param conteudosConcluidos Conjunto de conteúdos concluídos.
     */
    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    /**
     * Verifica se dois desenvolvedores são iguais.
     * @param o Objeto a ser comparado.
     * @return true se os desenvolvedores forem iguais, caso contrário false.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    /**
     * Calcula o hash code do desenvolvedor.
     * @return hash code do desenvolvedor.
     */
    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }
}
