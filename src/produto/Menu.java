package produto;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner (System.in);
		int opcao;
		
		while(true) {
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                IMPÉRIO DA ESTAMPA                   ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Cadastrar produto                    ");
			System.out.println("            2 - Listar produtos                      ");
			System.out.println("            3 - Buscar produto por código            ");
			System.out.println("            4 - Adicionar produto ao carrinho        ");
			System.out.println("            5 - Ver carrinho de compras              ");
			System.out.println("            6 - Remover produto do carrinho          ");
			System.out.println("            7 - Pagamento                            ");
			System.out.println("            8 - Remover produto da lista             ");
			System.out.println("            9 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");

			opcao = leia.nextInt();
			
			if (opcao == 9) {
				System.out.println("\nImpério da Estampa - Você imagina, a gente cria!");
				sobre();
                 leia.close();
				System.exit(0);
			}

			switch (opcao) {
				case 1:
					System.out.println("Cadastrar produto\n\n");

					break;
				case 2:
					System.out.println("Listar produtos\n\n");

					break;
				case 3:
					System.out.println("Buscar produto por código\n\n");

					break;
				case 4:
					System.out.println("Adicionar produto ao carrinho\n\n");

					break;
				case 5:
					System.out.println("Ver carrinho de compras\n\n");

					break;
				case 6:
					System.out.println("Remover produto do carrinho\n\n");

					break;
				case 7:
					System.out.println("Pagamento\n\n");

					break;
				case 8:
					System.out.println("Remover produto da lista\n\n");

					break;
				default:
					System.out.println("\nOpção Inválida!\n");
					break;
			}
		}
	}
    
	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: ");
		System.out.println("Aline Maciel - alinemaciel.dev@gmail.com");
		System.out.println("github.com/AlineMaciel0402");
		System.out.println("*********************************************************");
	}
}
