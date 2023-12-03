package Model;

import Repository.IRepositoryCRUD;
import Repository.RepositoryPessoaFisica;
import Repository.RepositoryPessoaJuridica;

import java.util.List;
import java.util.Scanner;

public class Index {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IRepositoryCRUD<Pessoa> pessoaRepository = new RepositoryPessoaFisica();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Cadastrar Pessoa Física");
            System.out.println("2. Cadastrar Pessoa Jurídica");
            System.out.println("3. Listar Pessoas");
            System.out.println("4. Excluir Pessoa");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int escolha = scanner.nextInt();
            scanner.nextLine();  // Consumir a nova linha após a entrada do número

            switch (escolha) {
                case 1:
                    // Cadastrar Pessoa Física
                    System.out.print("Nome da Pessoa Física: ");
                    String nomePessoaFisica = scanner.nextLine();
                    System.out.print("CPF: ");
                    int cpf = scanner.nextInt();
                    scanner.nextLine();  // Consumir a nova linha após a entrada do número
                    PessoaFisica pessoaFisica = new PessoaFisica(nomePessoaFisica, cpf);
                    pessoaRepository.adicionar(pessoaFisica);
                    System.out.println("Pessoa Física cadastrada com sucesso!");
                    break;

                case 2:
                    // Cadastrar Pessoa Jurídica
                    System.out.print("Nome da Pessoa Jurídica: ");
                    String nomePessoaJuridica = scanner.nextLine();
                    System.out.print("CNPJ: ");
                    int cnpj = scanner.nextInt();
                    scanner.nextLine();  // Consumir a nova linha após a entrada do número
                    PessoaJuridica pessoaJuridica = new PessoaJuridica(nomePessoaJuridica, cnpj);
                    pessoaRepository.adicionar(pessoaJuridica);
                    System.out.println("Pessoa Jurídica cadastrada com sucesso!");
                    break;

                case 3:
                    // Listar Pessoas
                    List<Pessoa> pessoas = pessoaRepository.listar();
                    System.out.println("\nLista de Pessoas:");
                    for (Pessoa pessoa : pessoas) {
                        if (pessoa instanceof PessoaFisica) {
                            System.out.println("Pessoa Física: " + pessoa.getNome());
                        } else if (pessoa instanceof PessoaJuridica) {
                            System.out.println("Pessoa Jurídica: " + pessoa.getNome());
                        }
                    }
                    break;

                case 4:
                    // Excluir Pessoa
                    System.out.print("Nome da Pessoa a ser excluída: ");
                    String nomeExcluir = scanner.nextLine();
                    Pessoa pessoaExcluir = pessoaRepository.buscarPorNome(nomeExcluir);
                    if (pessoaExcluir != null) {
                        pessoaRepository.remover(pessoaExcluir);
                        System.out.println("Pessoa excluída com sucesso!");
                    } else {
                        System.out.println("Pessoa não encontrada.");
                    }
                    break;

                case 5:
                    // Sair do programa
                    System.out.println("Saindo do programa.");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
