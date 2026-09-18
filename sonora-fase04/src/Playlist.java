import java.util.ArrayList;

public class Playlist {

    private String nome;
    private Usuario dono;
    private ArrayList<Musica> musicas;

    public Playlist(String nome, Usuario dono) {
        if (nome == null || nome.isBlank()){
            throw new IllegalArgumentException("Nome inválido, não pode estar em branco");
        }

        if (dono == null){
            throw new IllegalArgumentException("Dono inválido,não pode estar em branco");
        }

        this.nome = nome;
        this.dono = dono;
        this.musicas = new ArrayList<Musica>();
    }

    public String getNome() {
        return nome;
    }

    public Usuario getDono() {
        return dono;
    }

    public int getQuantidade() {
        return musicas.size();
    }

    public boolean adicionar(Musica musica) {
        if (musica == null){
            throw new IllegalArgumentException("Música inválida, não pode ser nula");
        }

        musicas.add(musica);
        return true;
    }

    public Musica getNaPosicao(int indice) {
        if (indice < 0 || indice >= musicas.size()) {
            throw new IndexOutOfBoundsException("Índice inválido, " +
                indice + " a playlist contém " + musicas.size() + " músicas");
        }

        return musicas.get(indice);
    }

    public void removerNaPosicao(int indice) {
        if (indice < 0 || indice >= musicas.size()) {
            throw new IndexOutOfBoundsException("Índice inválido, " +
                indice + " a playlist contém " + musicas.size() + " músicas");
        }

        musicas.remove(indice);
    }

    public int getDuracaoTotalSegundos() {
        int total = 0;

        for (int i = 0; i < musicas.size(); i++) {
            total += musicas.get(i).getDuracaoSegundos();
        }

        return total;
    }

    public void reproduzirTudo() {
        for (int i = 0; i < musicas.size(); i++) {
            musicas.get(i).reproduzir();
        }
    }
}