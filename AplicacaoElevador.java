package java_com_classes.Elevador;

import java.util.Scanner;

public class AplicacaoElevador {

    public static void main(String[] args) {

        Elevador elevador = new Elevador();

        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;

        while (continuar) {
            System.out.println("Qual ação você deseja realizar?\n1.Inicializar\n2.Entrar\n3.Sair\n4.Subir\n5.Descer\n6.Status\n7.Sair");
            int opcao = scanner.nextInt();
            while ((opcao > 7) || (opcao < 1)) {
                System.out.println("Opção inválida. Qual ação você deseja realizar?\n1.Inicializar\n2.Entrar\n3.Sair\n4.Subir\n5.Descer\n6.Status\n7.Sair");
                opcao = scanner.nextInt();
            }
            if (opcao == 7) {
                System.out.println("Tudo bem, até logo!");
                System.exit(0);
            }
            switch (opcao) {
                case (1):
                    if (elevador.checarIniciado() == true) {
                        System.out.println("O elevador já está inicializado.");
                        break;
                    }
                    System.out.println("Qual a capacidade desejada do elevador?");
                    int capacidadeElevador = scanner.nextInt();
                    System.out.println("Qual o total de andares no edifício?");
                    int totalAndares = scanner.nextInt();
                    elevador.inicializa(capacidadeElevador, totalAndares);
                    break;
                case (2):
                    if (elevador.checarIniciado() == false) {
                        System.out.println("O elevador não foi inicializado");
                        break;
                    }
                    System.out.println("Quantas pessoas vão entrar?");
                    elevador.entra(scanner.nextInt());
                    break;
                case (3):
                    if (elevador.checarIniciado() == false) {
                        System.out.println("O elevador não foi inicializado");
                        break;
                    }
                    System.out.println("Quantas pessoas vão sair?");
                    elevador.sai(scanner.nextInt());
                    break;
                case (4):
                    if (elevador.checarIniciado() == false) {
                        break;
                    }
                    System.out.println("Quantos andares você quer subir?");
                    elevador.sobe(scanner.nextInt());
                    break;
                case (5):
                    if (elevador.checarIniciado() == false) {
                        break;
                    }
                    System.out.println("Quantos andares você quer descer?");
                    elevador.desce(scanner.nextInt());
                    break;
                case (6):
                    if (elevador.checarIniciado() == false) {
                        System.out.println("O elevador não está inicializado");
                    } else {
                        System.out.println("O elevador está inicializado.");
                    }
                    elevador.exibirCaracteristicas();
                    elevador.exibirAndarAtual();
                    elevador.exibirNumeroPessoasPresentes();
            }

            System.out.println("Deseja realizar outra operação?\n1.Sim\n2.Não");
            int outraOperacao = scanner.nextInt();
            if (outraOperacao == 2) {
                System.exit(0);

            }
        }
    }
}
