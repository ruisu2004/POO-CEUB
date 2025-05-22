import java.util.Scanner;

public class AppProfessor {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        telaInicial();
    }

    // Tela 1: Tela Inicial
    public static void telaInicial() {
        System.out.println("=== Tela Inicial ===");
        System.out.println("1 - Professor(a)");
        System.out.println("2 - Aluno(a)");
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();
        scanner.nextLine(); // consumir \n

        if (opcao == 1) {
            telaLoginProfessor();
        } else {
            System.out.println("Opção para Aluno não implementada neste protótipo.");
        }
    }

    // Tela 2: Tela de Login do Professor
    public static void telaLoginProfessor() {
        System.out.println("\n=== Login Professor ===");
        System.out.print("Nome completo: ");
        String nome = scanner.nextLine();
        System.out.print("Matrícula: ");
        String matricula = scanner.nextLine();

        System.out.println("1 - Acessar");
        System.out.println("2 - Limpar");
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();
        scanner.nextLine();

        if (opcao == 1) {
            telaOpcoesProfessor(nome);
        } else {
            System.out.println("Campos limpos.");
            telaLoginProfessor();
        }
    }

    // Tela 3: Tela de Opções do Professor
    public static void telaOpcoesProfessor(String nomeProfessor) {
        System.out.println("\n=== Opções do Professor ===");
        System.out.println("Professor: " + nomeProfessor);
        System.out.println("1 - Cadastrar Aluno");
        System.out.println("2 - Cadastrar Atividade");
        System.out.println("3 - Lançar Nota");
        System.out.println("4 - Sair");
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao) {
            case 1:
                telaCadastrarAluno();
                break;
            case 2:
                telaCadastrarAtividade();
                break;
            case 3:
                telaLancarNota();
                break;
            case 4:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção inválida.");
                telaOpcoesProfessor(nomeProfessor);
        }
    }

    // Tela 4: Tela de Cadastro de Aluno
    public static void telaCadastrarAluno() {
        System.out.println("\n=== Cadastro de Aluno ===");
        System.out.print("Nome completo: ");
        String nomeAluno = scanner.nextLine();
        System.out.print("Turma: ");
        String turma = scanner.nextLine();

        System.out.println("1 - Cadastrar");
        System.out.println("2 - Limpar");
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();
        scanner.nextLine();

        if (opcao == 1) {
            System.out.println("Aluno " + nomeAluno + " da turma " + turma + " cadastrado com sucesso!");
            telaOpcoesProfessor("Professor");
        } else {
            System.out.println("Campos limpos.");
            telaCadastrarAluno();
        }
    }

    // Tela 5: Tela de Cadastro de Atividade
    public static void telaCadastrarAtividade() {
        System.out.println("\n=== Cadastro de Atividade ===");
        System.out.print("Nome do aluno: ");
        String nomeAluno = scanner.nextLine();
        System.out.print("Turma: ");
        String turma = scanner.nextLine();
        System.out.print("Título da atividade: ");
        String titulo = scanner.nextLine();
        System.out.print("Atividade: ");
        String atividade = scanner.nextLine();

        System.out.println("1 - Cadastrar Atividade");
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();
        scanner.nextLine();

        if (opcao == 1) {
            System.out.println("Atividade '" + titulo + "' cadastrada para o aluno " + nomeAluno + ".");
            telaOpcoesProfessor("Professor");
        } else {
            System.out.println("Operação cancelada.");
            telaOpcoesProfessor("Professor");
        }
    }

    // Tela 6: Tela de Lançar Nota
    public static void telaLancarNota() {
        System.out.println("\n=== Lançar Nota ===");
        System.out.print("Nome: ");
        String nomeAluno = scanner.nextLine();
        System.out.print("Atividade 1 - Nota: ");
        String nota = scanner.nextLine();

        System.out.println("1 - Lançar nota");
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();
        scanner.nextLine();

        if (opcao == 1) {
            System.out.println("Nota " + nota + " lançada para o aluno " + nomeAluno + ".");
            telaOpcoesProfessor("Professor");
        } else {
            System.out.println("Operação cancelada.");
            telaOpcoesProfessor("Professor");
        }
    }
}
