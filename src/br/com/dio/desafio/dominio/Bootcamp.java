package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Classe que representa um Bootcamp.
 */
public class Bootcamp {
    /**
     * Nome do Bootcamp.
     */
    private final String nome;

    /**
     * Descrição do Bootcamp.
     */
    private final String descricao;

    /**
     * Data de início do Bootcamp.
     */
    private final LocalDate dataInicial;

    /**
     * Data de término do Bootcamp.
     */
    private final LocalDate dataFinal;

    /**
     * Conjunto de desenvolvedores inscritos no Bootcamp.
     */
    private Set<Dev> devsInscritos = new HashSet<>();

    /**
     * Conjunto de conteúdos do Bootcamp.
     */
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    /**
     * Cria Bootcamp.
     *
     * @param nome       nome do Bootcamp
     * @param descricao  descrição do Bootcamp
     */
    public Bootcamp(String nome, String descricao) {
        this.nome = Objects.requireNonNull(nome, "nome nao pode ser nulo");
        this.descricao = Objects.requireNonNull(descricao, "descricao nao pode ser nulo");
        this.dataInicial = LocalDate.now();
        this.dataFinal = dataInicial.plusDays(45);
    }

    /**
     * Obtém o nome do Bootcamp.
     * @return nome do Bootcamp.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Obtém a descrição do Bootcamp.
     * @return descrição do Bootcamp.
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Obtém a data de início do Bootcamp.
     * @return data de início do Bootcamp.
     */
    public LocalDate getDataInicial() {
        return dataInicial;
    }

    /**
     * Obtém a data de término do Bootcamp.
     * @return data de término do Bootcamp.
     */
    public LocalDate getDataFinal() {
        return dataFinal;
    }

    /**
     * Obtém o conjunto de desenvolvedores inscritos no Bootcamp.
     * @return conjunto de desenvolvedores inscritos.
     */
    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    /**
     * Define o conjunto de desenvolvedores inscritos no Bootcamp.
     * @param devsInscritos Conjunto de desenvolvedores inscritos.
     */
    public void setDevsInscritos(Set<Dev> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

    /**
     * Obtém o conjunto de conteúdos do Bootcamp.
     * @return conjunto de conteúdos.
     */
    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    /**
     * Define o conjunto de conteúdos do Bootcamp.
     * @param conteudos Conjunto de conteúdos.
     */
    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    /**
     * Verifica se dois Bootcamps são iguais.
     * @param o Objeto a ser comparado.
     * @return true se os Bootcamps forem iguais, caso contrário false.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(nome, bootcamp.nome) && Objects.equals(descricao, bootcamp.descricao) && Objects.equals(dataInicial, bootcamp.dataInicial) && Objects.equals(dataFinal, bootcamp.dataFinal) && Objects.equals(devsInscritos, bootcamp.devsInscritos) && Objects.equals(conteudos, bootcamp.conteudos);
    }

    /**
     * Calcula o hash code do Bootcamp.
     * @return hash code do Bootcamp.
     */
    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicial, dataFinal, devsInscritos, conteudos);
    }
}
