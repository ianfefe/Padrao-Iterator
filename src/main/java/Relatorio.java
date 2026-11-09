import java.util.Iterator;

public class Relatorio {

    public static Integer contarVendasConcluidasPlataforma(Plataforma plataforma) {
        int quantidade = 0;
        for (Venda venda : plataforma) {
            if (venda.isConcluida()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalVendasPlataforma(Plataforma plataforma) {
        int quantidade = 0;
        for (Iterator a = plataforma.iterator(); a.hasNext(); ) {
            quantidade++;
            a.next();
        }
        return quantidade;
    }

}
