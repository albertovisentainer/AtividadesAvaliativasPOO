import java.util.Scanner;

public class MenuRefeicoes {
    public static Refeicao escolherRefeicao(){
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("==== MENU DE REFEIÇÕES ====");
            System.out.println("1 - Café da manhã");
            System.out.println("2 - Almoço");
            System.out.println("3 - Janta");
            System.out.println("0 - Encerrar sistema");
            System.out.print("Escolha o tipo de refeição: ");
            int opcaoRefeicao = sc.nextInt();

            int opcaoPrato;

            switch (opcaoRefeicao){
                case 0:
                    System.out.println("Encerrando o sistema. Até mais!");
                    return null;

                case 1:
                    while (true){
                        System.out.println("\n === CAFÉ DA MANHÃ ===");
                        System.out.println("1 - Pão com ovo");
                        System.out.println("2 - Panqueca");
                        System.out.println("9 - Voltar para o menu anterior");
                        System.out.print("Escolha o prato: ");
                        opcaoPrato = sc.nextInt();

                        switch (opcaoPrato){
                            case 1:
                                return new CafeDaManha("Pão com ovo", 7.50);
                            case 2:
                                return new CafeDaManha("Panqueca", 12.00, 320);
                            case 9:
                                System.out.println("Voltando ao menu anterior!");
                                break;
                            default:
                                System.out.println("Opção inválida. Tente novamente!");
                                continue; //volta ao inicio do while
                        }
                        break;
                    }
                    break;

                case 2:
                    while (true){
                        System.out.println("\n=== ALMOÇO ===");
                        System.out.println("1 - Arroz, feijão e bife");
                        System.out.println("2 - Macarronada");
                        System.out.println("9 - Voltar ao menu anterior");
                        System.out.print("Escolha o prato: ");
                        opcaoPrato = sc.nextInt();

                        switch (opcaoPrato){
                            case 1:
                                return new Almoco("Arroz, feijão e bife", 25.90, 680);
                            case 2:
                                return new Almoco("Macarronada", 22.50);
                            case 9:
                                System.out.println("Voltando ao menu anterior!");
                                break;
                            default:
                                System.out.println("Opção inválida. Tente novamente!");
                                continue; //volta ao inicio do while
                        }
                        break;
                    }
                    break;

                case 3:
                    while (true){
                        System.out.println("\n=== JANTA ===");
                        System.out.println("1 - Sopa");
                        System.out.println("2 - Sanduíche");
                        System.out.println("9 - Voltar ao menu anterior");
                        System.out.print("Escolha o prato: ");
                        opcaoPrato = sc.nextInt();

                        switch (opcaoPrato){
                            case 1:
                                return new Janta("Sopa", 15.00, 200);
                            case 2:
                                return new Janta("Sanduíche", 10.50);
                            case 9:
                                System.out.println("Voltando ao menu anterior!");
                                break;
                            default:
                                System.out.println("Opção de refeição inválida!");
                                continue; //volta ao inicio do while
                        }
                        break;
                    }
                    break;
                default:
                    System.out.println("Opção de refeição inválida!");
                    continue; //volta ao inicio do while
            }
        }
    }
}
