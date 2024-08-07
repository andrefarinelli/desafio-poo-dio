package br.com.dio.desafio.dominio;

import java.time.LocalDate;

/**
 * Classe que representa uma Mentoria.
 */
public class Mentoria extends Conteudo{

    /**
     * Data da mentoria.
     */
    private LocalDate data;

    /**
     * Calcula o XP da mentoria.
     * @return XP da mentoria.
     */
    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    /**
     * Construtor padrão.
     */
    public Mentoria() {
    }

    /**
     * Obtém a data da mentoria.
     * @return data da mentoria.
     */
    public LocalDate getData() {
        return data;
    }

    /**
     * Define a data da mentoria.
     * @param data Data da mentoria.
     */
    public void setData(LocalDate data) {
        this.data = data;
    }

    /**
     * Retorna a representação em string da mentoria.
     * @return representação em string da mentoria.
     */
    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() +
                ", descricao='" + getDescricao() +
                ", data=" + data +
                '}';
    }
}
