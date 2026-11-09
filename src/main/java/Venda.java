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

    public void setNome(String codigo) {
        this.codigo = codigo;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setAtivo(boolean concluida) {
        this.concluida = concluida;
    }
}
