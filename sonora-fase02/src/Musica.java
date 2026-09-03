
public class Musica {

    private static int contador = 1;
    private int id;
    private String titulo;
    private String artista;
    private int duracaoSegundos;
    private int reproducoes;

    public Musica(String titulo, String artista, int duracaoSegundos) {
        if (titulo == null || titulo.isBlank() ){
            throw new IllegalArgumentException("Título é inválido, não pode estar vazio");
        }

        if (artista == null || artista.isBlank()){
            throw new IllegalArgumentException("Artista é inválido, não pode estar vazio");
        }

        if (duracaoSegundos <= 0) {
            throw new IllegalArgumentException("Duração inválida, precisa ser maior que zero");
        }
       
        id = contador;
        contador++;

        this.titulo = titulo;
        this.artista = artista;
        this.duracaoSegundos = duracaoSegundos;
        reproducoes = 0;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }

    public int getDuracaoSegundos() {
        return duracaoSegundos;
    }

    public int getReproducoes() {
        return reproducoes;
    }

    public void reproduzir() {
        reproducoes++;
    }

    public String getDuracaoFormatada() {
        int minutos = duracaoSegundos / 60;
        int segundos = duracaoSegundos % 60;

        return String.format("%02d:%02d", minutos, segundos);
    }
}