public class Plataforma {

    private Musica[] musicas;
    private Usuario[] usuarios;
    private int totalMusicas;
    private int totalUsuarios;

    public Plataforma() {
        this.musicas = new Musica[500];
        this.usuarios = new Usuario[500];
        this.totalMusicas = 0;
        this.totalUsuarios = 0;
    }

    public boolean cadastrarMusica(Musica musica) {
        if (musica == null || totalMusicas == 500) {
            return false;
        }

        musicas[totalMusicas] = musica;
        totalMusicas++;

        return true;
    }

    public boolean cadastrarUsuario(Usuario usuario) {
        if (usuario == null || totalUsuarios == 500) {
            return false;
        }

        usuarios[totalUsuarios] = usuario;
        totalUsuarios++;

        return true;
    }

    public Musica buscarMusicaPorId(int id) {
        for (int i = 0; i < totalMusicas; i++) {
            if (musicas[i].getId() == id) {
                return musicas[i];
            }
        }

        return null;
    }

    public Musica buscarMusica(String titulo) {
        for (int i = 0; i < totalMusicas; i++) {
            if (musicas[i].getTitulo().equals(titulo)) {
                return musicas[i];
            }
        }

        return null;
    }

    public int getTotalMusicas() {
        return totalMusicas;
    }

    public int getTotalUsuarios() {
        return totalUsuarios;
    }
}