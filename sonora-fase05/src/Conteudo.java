public class Conteudo {

    private static int contador = 0;
    private int id;
    private String titulo;
    private int duracaoSegundos;
    private int reproducoes;

    public Conteudo(String titulo, int duracaoSegundos) {
        this.id = ++contador;
        setTitulo(titulo);
        setDuracaoSegundos(duracaoSegundos);
        reproducoes = 0;
    }

    public int getId() {
        return id;
    }

    protected void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo == null || titulo.isBlank()){
            throw new IllegalArgumentException("Título é inválido, não pode estar vazio");
        }

        this.titulo = titulo;
    }

    public int getDuracaoSegundos() {
        return duracaoSegundos;
    }

    public void setDuracaoSegundos(int duracaoSegundos) {
        if (duracaoSegundos <= 0) {
            throw new IllegalArgumentException("Duração inválida, precisa ser maior que zero");
        }

        this.duracaoSegundos = duracaoSegundos;
    }

    public int getReproducoes() {
        return reproducoes;
    }

    public void reproduzir() {
        reproducoes++;
        System.out.println("Reproduzindo: " + toString());
    }

    @Override
    public String toString() {
        return "[" + getId() + "] " + titulo
                + " (" + duracaoSegundos + "s)";
    }
}