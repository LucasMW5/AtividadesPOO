import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PL08 {

    @Test
    @DisplayName("IDs de músicas devem ser sequenciais")
    public void IdsMusicasSequenciais() {
        Musica musica1 = new Musica(
                "Master of Puppets",
                "Metallica",
                355
        );

        Musica musica2 = new Musica(
                "Somewhere I belong",
                "Linkin Park",
                183
        );

        Musica musica3 = new Musica(
                "Psychossocial",
                "Slipknot",
                294
        );

        assertEquals(musica1.getId() + 1, musica2.getId());
        assertEquals(musica2.getId() + 1, musica3.getId());
    }

    @Test
    @DisplayName("IDs de usuários devem possuir contador independente dos IDs de músicas")
    public void IdsIndependentes() {
        Musica musica = new Musica(
                "Master of Puppets",
                "Metallica",
                355
        );

        Usuario usuario1 = new Usuario(
                "Lucas",
                "lucas@email.com"
        );

        Usuario usuario2 = new Usuario(
                "Lucas",
                "lucas@email.com"
        );

        Musica musica2 = new Musica(
                "Somewhere I belong",
                "Linkin Park",
                183
        );

        assertEquals(musica.getId() + 1, musica2.getId());
        assertEquals(usuario1.getId() + 1, usuario2.getId());
    }
}