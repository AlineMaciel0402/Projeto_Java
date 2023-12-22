package produto.model;

public abstract class Produto {
	
	private int codigo;
	private String nome;
	private float preco;
	
	public Produto(int codigo, String nome, float valor) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.preco = valor;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float valor) {
		this.preco = valor;
	}

	public boolean pagar(float valor) { 
	    if(this.getPreco() <= valor) {
	        this.setPreco(this.getPreco() - valor);
	        System.out.println("\nCompra realizada!");
	        return true;
	    } else {
	        System.out.println("\nCompra não realizada!");
	        return false;
	    }
	}
	public void visualizar() {
        System.out.println("\n\n***********************************************************");
        System.out.println("Dados do Produto:");
        System.out.println("***********************************************************");
        System.out.println("Código: " + this.codigo);
        System.out.println("Produto: " + this.nome);
        System.out.println("Preço: " + this.preco);
    }
}
	