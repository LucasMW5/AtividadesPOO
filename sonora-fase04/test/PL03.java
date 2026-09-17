import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PL03 {

    private Playlist playlist;

    @BeforeEach
    public void prepararCenario() {
        Usuario usuario = new Usuario("Lucas", "lucas@email.com");
        playlist = new Playlist("Minha Playlist", usuario);
    }

    @Test
    @DisplayName("Adicionar música em playlist com espaço disponível")
    public void deveAdicionarMusicaComEspacoDisponivel() {
        Musica musica = new Musica("Master of Puppets", "Metallica", 355);

        boolean resultado = playlist.adicionar(musica);

        assertTrue(resultado);
        assertEquals(1, playlist.getQuantidade());
    }

    @Test
    @DisplayName("Adicionar várias músicas em playlist com espaço disponível")
    public void AdicionarVariasMusicas() {
        Musica musica1 = new Musica("Master of Puppets", "Metallica", 355);
        Musica musica2 = new Musica("Somewhere I belong", "Linkin Park", 183);
        Musica musica3 = new Musica("Psychossocial", "Slipknot", 294);

        boolean resultado1 = playlist.adicionar(musica1);
        boolean resultado2 = playlist.adicionar(musica2);
        boolean resultado3 = playlist.adicionar(musica3);

        assertTrue(resultado1);
        assertTrue(resultado2);
        assertTrue(resultado3);

        assertEquals(3, playlist.getQuantidade());
    }

    @Test
    @DisplayName("Adicionar música quando a playlist está cheia")
    public void EncherPlaylist() {

        for (int i = 0; i < 100; i++) {
            Musica musica = new Musica(
                    "Master of Puppets",
                    "Metallica",
                    355
            );

            assertTrue(playlist.adicionar(musica));
        }

        assertEquals(100, playlist.getQuantidade());

        Musica musicaExtra = new Musica(
                "Psychossocial",
                "Slipknot",
                294
        );

        boolean resultado = playlist.adicionar(musicaExtra);

        assertFalse(resultado);
        assertEquals(100, playlist.getQuantidade());
    }
}