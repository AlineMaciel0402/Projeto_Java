package produto;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import produto.controller.ProdutoController;
import produto.model.Camiseta;
import produto.model.Caneca;
import produto.util.Cores;

public class Menu {

    public static void main(String[] args) {
        ProdutoController produtos = new ProdutoController();
        Scanner leia = new Scanner(System.in);

        int opcao, pagar, capacidade;  
        String nome, material;
        float valor;

        Caneca caneca = new Caneca(1, "Caneca", 30.0f, "Porcelana", 365);
        produtos.cadastrar(caneca);
        Camiseta camiseta = new Camiseta(2, "Camiseta", 40.0f, "Algodão", "M");
        produtos.cadastrar(camiseta);
        
        
        while (true) {
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
		System.out.println("            5 - Atualizar  produto da lista          ");
		System.out.println("            6 - Remover produto da lista             ");
		System.out.println("            7 - Sair                                 ");
		System.out.println("                                                     ");
		System.out.println("*****************************************************");
		System.out.println("Entre com a opção desejada:                          ");
		System.out.println("                                                     " + Cores.TEXT_RESET);


            try {
                opcao = leia.nextInt();
            } catch (InputMismatchException e) {
                System.out.println(Cores.TEXT_RED+ Cores.ANSI_BLACK_BACKGROUND+ "\nDigite valores inteiros!");
                leia.nextLine();
                opcao = 0;
            }
            leia.nextLine();
            
            switch (opcao) {
            case 1:
                System.out.println(Cores.TEXT_WHITE + Cores.ANSI_BLACK_BACKGROUND +"Cadastrar produto");
                System.out.print("Digite o tipo de produto (1 - Caneca, 2 - Camiseta): ");
                int tipoProduto = leia.nextInt();

                leia.nextLine();

                System.out.print("Digite o nome do produto: ");
                String nomeProduto = leia.nextLine();

                System.out.print("Digite o código do produto: ");
                int codigoProduto = leia.nextInt();

                if (tipoProduto == 1) {
                    System.out.print("Digite o material da caneca: ");
                    String material1 = leia.next();
                    System.out.print("Digite a capacidade da caneca: ");
                    int capacidade1 = leia.nextInt();
                    System.out.print("Digite o preço da caneca: ");
                    float valor1 = leia.nextFloat();

                    Caneca novaCaneca = new Caneca(codigoProduto, nomeProduto, valor1, material1, capacidade1);
                    produtos.cadastrar(novaCaneca);
                    
                } else if (tipoProduto == 2) {
                    System.out.print("Digite o material da camiseta: ");
                    String material1 = leia.next();
                    System.out.print("Digite o tamanho da camiseta: ");
                    String tamanho = leia.next();
                    System.out.print("Digite o preço da camiseta: ");
                    float valor1 = leia.nextFloat();


                    Camiseta novaCamiseta = new Camiseta(codigoProduto, nomeProduto,valor1, material1, tamanho);
                    produtos.cadastrar(novaCamiseta);
                } else {
                    System.out.println("Tipo de produto inválido!");
                keyPress();
                break;
                }
                case 2:
                    System.out.println(Cores.TEXT_WHITE + Cores.ANSI_BLACK_BACKGROUND +"Listar produtos\n\n");
                    produtos.listarTodas();
                    keyPress();
                    break;
                case 3:
                    System.out.println(Cores.TEXT_WHITE + Cores.ANSI_BLACK_BACKGROUND +"Buscar produto por código\n");
                    System.out.print("Digite o código do produto: ");
                    int codigo = leia.nextInt();
                    produtos.procurarPorNumero(codigo);
                    keyPress();
                    break;
                case 4:
                    System.out.println(Cores.TEXT_WHITE + Cores.ANSI_BLACK_BACKGROUND +"Comprar\n\n");
                    System.out.print("Digite o código do produto: ");
                    codigo = leia.nextInt();
                    
                    do {
                    	System.out.print("Digite o valor para pagar: ");
                    	valor = leia.nextFloat();
                    }while (valor <= 0);
                    produtos.pagar(codigo, valor);
                    
                    keyPress();
                    break;
                case 5:
                    System.out.println(Cores.TEXT_WHITE + Cores.ANSI_BLACK_BACKGROUND +"Atualizar produto\n\n");
                    System.out.print("Digite o código do produto: ");
                    codigo = leia.nextInt();
                    
                    var buscaProduto = produtos.buscarNaCollection(codigo);
                    if (buscaProduto != null) {
                    	
                    	System.out.print("Digite o Código: ");
    					codigo = leia.nextInt();
    					System.out.print("Digite o Nome do produto: ");
    					leia.skip("\\R?");
    					nome = leia.nextLine();
    							
    					System.out.print("Digite o preço do produto (R$): ");
    					valor = leia.nextFloat();
    						
    					codigo = buscaProduto.getCodigo();
    						
    		switch(codigo) {
    			case 1 -> {
    					System.out.print("Digite o material (R$): ");
    					material = leia.next();
    					System.out.print("Digite a capacidade: ");
    					capacidade = leia.nextInt();
    					produtos.atualizar(new Caneca( codigo, nome, valor, material, capacidade));
    					}
    			case 2 -> {
    					System.out.print("Digite o material: ");
    					material = leia.next();
    					System.out.print("Digite o tamanho: ");
    					String tamanho = leia.next();
    					produtos.atualizar(new Camiseta(codigo,nome,valor,tamanho, material));
    					}
    			default ->{
    					System.out.println("Código do produto inválido!");
    					}
    		}	
    				}else
    					System.out.println("\nProduto não encontrad0o!");
					keyPress();
                    break;
            
                case 6:
                    System.out.println(Cores.TEXT_WHITE + Cores.ANSI_BLACK_BACKGROUND +"Remover produto da lista\n\n");
                    System.out.print("Digite o código do produto a ser removido: ");
                    int codigo1 = leia.nextInt();
                    produtos.deletar(codigo1);
                    keyPress();
                    break;
                case 7:
                    System.out.println(Cores.TEXT_WHITE + Cores.ANSI_BLACK_BACKGROUND +"\nImpério da Estampa"
                    		+ " - Você imagina, a gente cria!");
                    sobre();
                    leia.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("\nOpção Inválida!\n");
                    keyPress();
                    break;
            }
        }
    }
    public static void sobre() {
        System.out.println(Cores.TEXT_PURPLE_BOLD + Cores.ANSI_BLACK_BACKGROUND +"\n*********************************************************");
        System.out.println("Projeto Desenvolvido por: ");
        System.out.println("Aline Maciel - alinemaciel.dev@gmail.com");
        System.out.println("github.com/AlineMaciel0402");
        System.out.println("*********************************************************");
    }


    public static void keyPress() {
        try {
            System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
            System.in.read();
        } catch (IOException e) {
            System.out.println("Você pressionou uma tecla diferente de enter!");
        }
    }
}