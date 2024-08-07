package br.com.dio.desafio.dominio;

/**
 * Classe que representa um Curso.
 */
public class Curso extends Conteudo{

    /**
     * Carga horária do curso.
     */
    private int cargaHoraria;

    /**
     * Calcula o XP do curso.
     * @return XP do curso.
     */
    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    /**
     * Construtor padrão.
     */
    public Curso() {
    }

    /**
     * Obtém a carga horária do curso.
     * @return carga horária do curso.
     */
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    /**
     * Define a carga horária do curso.
     * @param cargaHoraria Carga horária do curso.
     */
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    /**
     * Retorna a representação em string do curso.
     * @return representação em string do curso.
     */
    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() +
                ", descricao='" + getDescricao() +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
