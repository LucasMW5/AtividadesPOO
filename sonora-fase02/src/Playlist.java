package src;
public class Playlist {

    private String nome;
    private Usuario dono;
    private Musica[] musicas;
    private int quantidade;

    public Playlist(String nome, Usuario dono) {
        if (nome == null || nome.isBlank()){
            throw new IllegalArgumentException("Nome inválido, não pode estar em branco");
        }

        if (dono == null){
            throw new IllegalArgumentException("Dono inválido,não pode estar em branco");
        }

        this.nome = nome;
        this.dono = dono;
        this.musicas = new Musica[100];
        this.quantidade = 0;
    }

    public String getNome() {
        return nome;
    }

    public Usuario getDono() {
        return dono;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public boolean adicionar(Musica musica) {
        if (musica == null){
            throw new IllegalArgumentException("Música inválida, não pode ser nula");
        }

        if (quantidade == musicas.length) {
            return false;

        } else {
            musicas[quantidade] = musica;
            quantidade++;
            return true;
        }
    }

    public Musica getNaPosicao(int indice) {
        if (indice < 0 || indice >= quantidade) {
            throw new IndexOutOfBoundsException("Índice inválido, " +
                indice + " a playlist contém " + quantidade + " músicas");
        }

        return musicas[indice];
    }

    public void removerNaPosicao(int indice) {
        if (indice < 0 || indice >= quantidade) {
            throw new IndexOutOfBoundsException("Índice inválido, " +
                indice + " a playlist contém " + quantidade + " músicas");
        }

        for (int i = indice; i < quantidade - 1; i++) {
            musicas[i] = musicas[i + 1];
        }

        musicas[quantidade - 1] = null;
        quantidade--;
    }

    public int getDuracaoTotalSegundos() {
        int total = 0;

        for (int i = 0; i < quantidade; i++) {
            total += musicas[i].getDuracaoSegundos();
        }

        return total;
    }

    public void reproduzirTudo() {
        for (int i = 0; i < quantidade; i++) {
            musicas[i].reproduzir();
        }
    }
}