import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PL04 {

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
    @DisplayName("Posição válida devolve a música correta")
    public void PosicaoValida() {
        Musica resultado = playlist.getNaPosicao(1);

        assertEquals("Somewhere I belong", resultado.getTitulo());
    }

    @Test
    @DisplayName("Índice negativo deve lançar IndexOutOfBoundsException")
    public void IndiceNegativo() {
        assertThrows(
                IndexOutOfBoundsException.class,
                () -> playlist.getNaPosicao(-1)
        );
    }

    @Test
    @DisplayName("Índice além da quantidade deve lançar IndexOutOfBoundsException")
    public void IndiceAlemDaQuantidade() {
        assertThrows(
                IndexOutOfBoundsException.class,
                () -> playlist.getNaPosicao(3)
        );
    }
}
