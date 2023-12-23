package produto.repository;

import produto.model.Produto;

public interface ProdutoRepository {
	
		public void procurarPorNumero(int numero);
		public void listarTodas();
		public void cadastrar(Produto produto);
		public void atualizar(Produto produto);
		public void deletar(int numero);
		
		public void caneca ();
		public void camiseta();
		public void pagar(int codigo, float valor);
}
