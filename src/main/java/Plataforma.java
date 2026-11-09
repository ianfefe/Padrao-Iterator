import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Plataforma implements Iterable<Venda>{

    private List<Venda> vendas = new ArrayList<Venda>();

    public Plataforma(Venda... vendas){
        this.vendas = Arrays.asList(vendas);
    }

    @Override
    public Iterator<Venda> iterator() {
        return vendas.iterator();
    }
}
