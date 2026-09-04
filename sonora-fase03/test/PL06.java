import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PL06 {

    private Plataforma plataforma;
    private Musica musica1;
    private Musica musica2;
    private Musica musica3;

    @BeforeEach
    public void prepararCenario() {
        plataforma = new Plataforma();

        musica1 = new Musica(
                "Master of Puppets",
                "Metallica",
                355
        );

        musica2 = new Musica(
                "Somewhere I belong",
                "Linkin Park",
                183
        );

        musica3 = new Musica(
                "Psychossocial",
                "Slipknot",
                294
        );

        plataforma.cadastrarMusica(musica1);
        plataforma.cadastrarMusica(musica2);
        plataforma.cadastrarMusica(musica3);
    }

    @Test
    @DisplayName("Buscar música pelo título deve encontrar a música cadastrada")
    public void BuscarMusicaPorTitulo() {
        Musica resultado = plataforma.buscarMusica("Master of Puppets");

        assertEquals(
                "Master of Puppets",
                resultado.getTitulo()
        );
    }

    @Test
    @DisplayName("Buscar música pelo ID deve encontrar a música cadastrada")
    public void BuscarMusicaPorId() {
        Musica resultado = plataforma.buscarMusicaPorId(musica2.getId());

        assertEquals(
                "Somewhere I belong",
                resultado.getTitulo()
        );
    }

    @Test
    @DisplayName("Buscar título inexistente deve retornar null")
    public void BuscarTituloInexistente() {
        Musica resultado = plataforma.buscarMusica("Musica");

        assertNull(resultado);
    }

    @Test
    @DisplayName("Buscar ID inexistente deve retornar null")
    public void BuscarIdInexistente() {
        Musica resultado = plataforma.buscarMusicaPorId(999999);

        assertNull(resultado);
    }
}