public class Venda {
    private String codigo;
    private boolean concluida;

    public Venda(String codigo, boolean concluida) {
        this.codigo = codigo;
        this.concluida = concluida;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }
}
