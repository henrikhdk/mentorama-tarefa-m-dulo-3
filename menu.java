import java.util.Scanner;
// Classe menu
public class menu {

    public static void main(String[] args) {
        int opcao = 0;
        // Árvore de seleção do menu em loop
        do {
            System.out.println("| MENU DE OPÇÕES:       |");
            System.out.println("|                       |");
            System.out.println("|         1. Opção 1    |");
            System.out.println("|         2. Opção 2    |");
            System.out.println("|         3. Sair       |");
            Scanner menu = new Scanner(System.in);

            //Print final
            System.out.println("Digite a opção desejada:");
            opcao = menu.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu a primeira opção");
                    break;
                case 2:
                    System.out.println("Você escolheu a segunda opção:");
                    break;
                case 3:
                    System.out.println("O programa foi encerrado");
                    break;
                default:
                    System.out.println("Seleção inválida");
                    break;
            }
        } while (opcao < 3);
    }
}

