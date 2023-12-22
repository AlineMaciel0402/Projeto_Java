package produto;

import java.util.Scanner;
import produto.util.Cores;
import produto.model.Camiseta;
import produto.model.Caneca;
import produto.model.Produto;

public class Menu {

	public static void main(String[] args) {
		
		// Teste do Produto Caneca
				Caneca c1 = new Caneca(1,"Caneca", 30.0f, "Porcelana", 365);
				c1.visualizar();
				
		        // Teste da Camiseta
				Camiseta cm1 = new Camiseta (2, "Camiseta", 40.0f, "Algodão", "M");
				cm1.visualizar();
		      
		Scanner leia = new Scanner (System.in);
		int opcao;
		
		while(true) {
			
			System.out.println(Cores.TEXT_RED+ Cores.ANSI_BLACK_BACKGROUND
					+ "*****************************************************");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                IMPÉRIO DA ESTAMPA                   ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Cadastrar produto                    ");
			System.out.println("            2 - Listar produtos                      ");
			System.out.println("            3 - Buscar produto por código            ");
			System.out.println("            4 - Comprar                              ");
			System.out.println("            5 - Remover produto da lista             ");
			System.out.println("            6 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     " + Cores.TEXT_RESET);

			opcao = leia.nextInt();
			
			if (opcao == 6) {
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
					System.out.println("Comprar\n\n");
				break;
				case 5:
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
