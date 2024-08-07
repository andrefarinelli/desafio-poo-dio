package br.com.dio.desafio.dominio;

/**
 * Classe abstrata que representa um Conteúdo.
 */
public abstract class Conteudo {

    /**
     * XP padrão para todos os conteúdos.
     */
    protected static final double XP_PADRAO = 10d;

    /**
     * Título do conteúdo.
     */
    private String titulo;

    /**
     * Descrição do conteúdo.
     */
    private String descricao;

    /**
     * Calcula o XP do conteúdo.
     * @return XP do conteúdo.
     */
    public abstract double calcularXp();

    /**
     * Obtém o título do conteúdo.
     * @return título do conteúdo.
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Define o título do conteúdo.
     * @param titulo Título do conteúdo.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Obtém a descrição do conteúdo.
     * @return descrição do conteúdo.
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Define a descrição do conteúdo.
     * @param descricao Descrição do conteúdo.
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
