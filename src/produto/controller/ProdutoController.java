package produto.controller;

import java.util.ArrayList;

import produto.model.Produto;
import produto.repository.ProdutoRepository;


public class ProdutoController implements ProdutoRepository {

	
	private ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
	int numero = 0 ;


	@Override
	public void procurarPorNumero(int codigo) {
		var produto = buscarNaCollection(codigo);
		
		if(produto!= null)
			produto.visualizar();
		else
			System.out.println("\nProduto " + codigo + " não encontrado!");
		
	}

	@Override
	public void listarTodas() {
		for (Produto produto : listaProdutos) {
			produto.visualizar();
		}
	}

	@Override
	public void deletar(int codigo) {
	var produto = buscarNaCollection(codigo);
	if(produto != null) {
		if(listaProdutos.remove(produto) == true)
			System.out.println("\nProduto " + codigo + " foi deletado com sucesso!");
	}else
		System.out.println("\nProduto " + codigo + " não foi econtrado!");
	
		
	}

	@Override
	public void caneca() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void camiseta() {
		// TODO Auto-generated method stub
		
	}
	public int gerarNumero() {
		return ++numero;
		
	}

	public int obterNovoCodigo() {
		// TODO Auto-generated method stub
		return 0;
	}
	public Produto buscarNaCollection(int codigo) {
		for(var produto : listaProdutos) {
			if(produto.getCodigo()== codigo) {
				return produto;
			}
		}
		return null;
			}

	@Override
	public void cadastrar(Produto produto) {
		listaProdutos.add(produto);
		System.out.println("\nProduto " +produto.getNome()+ " cadastrado com sucesso!\n");
			
		
	}

	@Override
	public void atualizar(Produto produto) {
	var buscaProduto = buscarNaCollection(produto.getCodigo());
	if(buscaProduto != null) {
		listaProdutos.set(listaProdutos.indexOf(buscaProduto), produto);
		System.out.println("O produto " + produto.getCodigo() + " foi atualizado com sucesso!");
	}else 
		System.out.println("O produto \" + produto.getCodigo() + \" não foi encontrado!");
	}
	
	@Override
	public void pagar (int codigo, float valor) {
		var produto = buscarNaCollection (codigo);
		if(produto != null) {
			if(produto.pagar(valor) == true)
				System.out.print("\nCompra do produto código " + codigo +  " realizada com sucesso!");
			
		}else 
			System.out.println("Produto " + codigo + " não foi encontrado!");
		}
}
	