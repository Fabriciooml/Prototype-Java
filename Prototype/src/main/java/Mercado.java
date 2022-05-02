public class Mercado implements Cloneable {

    private String nome;
    private int numeroFuncionarios;
    private Gerente gerente;
    private Endereco endereco;

    public Mercado(String nome, int numeroFuncionarios, Gerente gerente, Endereco endereco) {
        this.nome = nome;
        this.numeroFuncionarios = numeroFuncionarios;
        this.gerente = gerente;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public void setNumeroFuncionarios(int numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    protected Mercado clone() throws CloneNotSupportedException {
        Mercado mercadoClone = (Mercado) super.clone();
        mercadoClone.endereco = (Endereco) mercadoClone.endereco.clone();
        return mercadoClone;
    }

    @Override
    public String toString() {
        return "Mercado{" +
                "nome='" + nome + '\'' +
                ", numeroFuncionarios=" + numeroFuncionarios +
                ", gerente=" + gerente +
                ", endereco=" + endereco +
                '}';
    }
}
