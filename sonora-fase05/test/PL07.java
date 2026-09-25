import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PL07 {

    private Musica musica;

    @BeforeEach
    public void prepararCenario() {
        musica = new Musica(
                "Master of Puppets",
                "Metallica",
                355
        );
    }

    @Test
    @DisplayName("Cada chamada de reproduzir aumenta o contador em um")
    public void ReproduzirUmaVez() {
        musica.reproduzir();

        assertEquals(1, musica.getReproducoes());
    }

    @Test
    @DisplayName("Duas chamadas de reproduzir aumentam o contador para dois")
    public void ReproduzirDuasVezes() {
        musica.reproduzir();
        musica.reproduzir();

        assertEquals(2, musica.getReproducoes());
    }

    @Test
    @DisplayName("Três chamadas de reproduzir aumentam o contador para três")
    public void ReproduzirTresVezes() {
        musica.reproduzir();
        musica.reproduzir();
        musica.reproduzir();

        assertEquals(3, musica.getReproducoes());
    }
}