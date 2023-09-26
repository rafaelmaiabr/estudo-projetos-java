package controller;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AlunoController controller = new AlunoController();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar Aluno");
            System.out.println("2. Atualizar Aluno");
            System.out.println("3. Remover Aluno");
            System.out.println("4. Listar Alunos");
            System.out.println("5. Buscar Aluno por RA");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");

            int escolha = scanner.nextInt();
            scanner.nextLine();  // Consumir a nova linha após a entrada do número

            switch (escolha) {
                case 1:
                    // Adicionar Aluno
                    System.out.print("RA: ");
                    int ra = scanner.nextInt();
                    scanner.nextLine();  // Consumir a nova linha após a entrada do número
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Curso: ");
                    String curso = scanner.nextLine();
                    System.out.print("Sexo (M/F): ");
                    char sexo = scanner.nextLine().charAt(0);
                    System.out.print("Turno: ");
                    String turno = scanner.nextLine();

                    Aluno novoAluno = new Aluno(ra, nome, curso, sexo, turno);
                    controller.adicionarAluno(novoAluno);
                    System.out.println("Aluno adicionado com sucesso!");
                    break;
                case 2:
                    // Atualizar Aluno
                    System.out.print("RA do aluno a ser atualizado: ");
                    int raAtualizar = scanner.nextInt();
                    scanner.nextLine();  // Consumir a nova linha após a entrada do número
                    Aluno alunoAtualizar = controller.buscarPorRA(raAtualizar);
                    if (alunoAtualizar != null) {
                        System.out.print("Novo nome: ");
                        alunoAtualizar.setNome(scanner.nextLine());
                        System.out.print("Novo curso: ");
                        alunoAtualizar.setCurso(scanner.nextLine());
                        System.out.print("Novo sexo (M/F): ");
                        alunoAtualizar.setSexo(scanner.nextLine().charAt(0));
                        System.out.print("Novo turno: ");
                        alunoAtualizar.setTurno(scanner.nextLine());
                        controller.atualizarAluno(raAtualizar, alunoAtualizar);
                        System.out.println("Aluno atualizado com sucesso!");
                    } else {
                        System.out.println("Aluno não encontrado!");
                    }
                    break;
                case 3:
                    // Remover Aluno
                    System.out.print("RA do aluno a ser removido: ");
                    int raRemover = scanner.nextInt();
                    controller.removerAluno(raRemover);
                    System.out.println("Aluno removido com sucesso!");
                    break;
                case 4:
                    // Listar Alunos
                    List<Aluno> listaAlunos = controller.listarAlunos();
                    System.out.println("\nLista de Alunos:");
                    for (Aluno aluno : listaAlunos) {
                        System.out.println(aluno);
                        System.out.println("------------------");
                    }
                    break;
                case 5:
                    // Buscar Aluno por RA
                    System.out.print("RA do aluno a ser buscado: ");
                    int raBuscar = scanner.nextInt();
                    Aluno alunoBuscado = controller.buscarPorRA(raBuscar);
                    if (alunoBuscado != null) {
                        System.out.println("\nAluno encontrado:");
                        System.out.println(alunoBuscado);
                    } else {
                        System.out.println("Aluno não encontrado!");
                    }
                    break;
                case 6:
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
