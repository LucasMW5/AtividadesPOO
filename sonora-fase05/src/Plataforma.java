import java.util.ArrayList;

public class Plataforma {

    private ArrayList<Musica> musicas;
    private ArrayList<Usuario> usuarios;

    public Plataforma() {
        this.musicas = new ArrayList<Musica>();
        this.usuarios = new ArrayList<Usuario>();
    }

    public boolean cadastrarMusica(Musica musica) {
        if (musica == null) {
            return false;
        }

        musicas.add(musica);

        return true;
    }

    public boolean cadastrarUsuario(Usuario usuario) {
        if (usuario == null) {
            return false;
        }

        usuarios.add(usuario);

        return true;
    }

    public Musica buscarMusicaPorId(int id) {
        for (int i = 0; i < musicas.size(); i++) {
            if (musicas.get(i).getId() == id) {
                return musicas.get(i);
            }
        }

        return null;
    }

    public Musica buscarMusica(String titulo) {
        for (int i = 0; i < musicas.size(); i++) {
            if (musicas.get(i).getTitulo().equals(titulo)) {
                return musicas.get(i);
            }
        }

        return null;
    }

    public Usuario buscarUsuarioPorId(int id) {
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getId() == id) {
                return usuarios.get(i);
            }
        }

        return null;
    }

    public int getTotalMusicas() {
        return musicas.size();
    }

    public int getTotalUsuarios() {
        return usuarios.size();
    }
}