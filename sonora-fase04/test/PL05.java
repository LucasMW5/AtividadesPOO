import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PL05 {

    private Playlist playlist;

    @BeforeEach
    public void prepararCenario() {
        Usuario usuario = new Usuario("Lucas", "lucas@email.com");
        playlist = new Playlist("Minha Playlist", usuario);

        Musica musica1 = new Musica("Master of Puppets", "Metallica", 355);
        Musica musica2 = new Musica("Somewhere I belong", "Linkin Park", 183);
        Musica musica3 = new Musica("Psychossocial", "Slipknot", 294);

        playlist.adicionar(musica1);
        playlist.adicionar(musica2);
        playlist.adicionar(musica3);
    }

    @Test
    @DisplayName("Remover posição válida deve reorganizar a playlist")
    public void RemoverPosicaoValida() {
        playlist.removerNaPosicao(1);

        assertEquals(2, playlist.getQuantidade());
        assertEquals(
                "Master of Puppets",
                playlist.getNaPosicao(0).getTitulo()
        );
        assertEquals(
                "Psychossocial",
                playlist.getNaPosicao(1).getTitulo()
        );
    }

    @Test
    @DisplayName("Remover a primeira posição deve reorganizar a playlist")
    public void RemoverPrimeiraPosicao() {
        playlist.removerNaPosicao(0);

        assertEquals(2, playlist.getQuantidade());
        assertEquals(
                "Somewhere I belong",
                playlist.getNaPosicao(0).getTitulo()
        );
        assertEquals(
                "Psychossocial",
                playlist.getNaPosicao(1).getTitulo()
        );
    }

    @Test
    @DisplayName("Índice negativo deve lançar IndexOutOfBoundsException")
    public void IndiceNegativo() {
        assertThrows(
                IndexOutOfBoundsException.class,
                () -> playlist.removerNaPosicao(-1)
        );
    }

    @Test
    @DisplayName("Índice além da quantidade deve lançar IndexOutOfBoundsException")
    public void IndiceAlemDaQuantidade() {
        assertThrows(
                IndexOutOfBoundsException.class,
                () -> playlist.removerNaPosicao(3)
        );
    }
}