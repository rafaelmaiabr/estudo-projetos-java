package Model;

public class PessoaJuridica extends Pessoa {
    private int cnpj;

    public PessoaJuridica(String nome, int cnpj) {
        super(nome);
        this.cnpj = cnpj;
    }

    public int getCnpj() {
        return cnpj;
    }
}
