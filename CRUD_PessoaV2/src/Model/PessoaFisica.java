package Model;

public class PessoaFisica extends Pessoa {
    private int cpf;

    public PessoaFisica(String nome, int cpf) {
        super(nome);
        this.cpf = cpf;
    }

    public int getCpf() {
        return cpf;
    }
}
