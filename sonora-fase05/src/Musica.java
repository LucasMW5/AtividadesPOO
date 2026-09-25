public class Musica extends Conteudo {

    private String artista;
    private String album;

    public Musica(String titulo, String artista, int duracaoSegundos) {
        super(titulo, duracaoSegundos);
        setArtista(artista);
        setAlbum("");
    }

    public Musica(String titulo, int duracaoSegundos,
                  String artista, String album) {
        super(titulo, duracaoSegundos);
        setArtista(artista);
        setAlbum(album);
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        if (artista == null || artista.isBlank()){
            throw new IllegalArgumentException("Artista é inválido, não pode estar vazio");
        }

        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getDuracaoFormatada() {
        int minutos = getDuracaoSegundos() / 60;
        int segundos = getDuracaoSegundos() % 60;

        return String.format("%02d:%02d", minutos, segundos);
    }

    @Override
    public String toString() {
        return super.toString() + " - " + artista
                + " (" + album + ")";
    }
}