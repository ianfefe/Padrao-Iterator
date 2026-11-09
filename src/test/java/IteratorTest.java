import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IteratorTest {

    @Test
    void deveContarVendasConcluidasPlataforma() {
        Plataforma plataforma = new Plataforma(
                new Venda("VENDA_1", true),
                new Venda("VENDA_22", true),
                new Venda("VENDA_333", false),
                new Venda("VENDA_4444", true)
        );
        Assertions.assertEquals(3, Relatorio.contarVendasConcluidasPlataforma(plataforma));
    }

    @Test
    void deveContarTotalVendasPlataforma() {
        Plataforma plataforma = new Plataforma(
                new Venda("VENDA_1", true),
                new Venda("VENDA_22", true),
                new Venda("VENDA_333", false),
                new Venda("VENDA_4444", true)
        );
        Assertions.assertEquals(4, Relatorio.contarTotalVendasPlataforma(plataforma));
    }

}
