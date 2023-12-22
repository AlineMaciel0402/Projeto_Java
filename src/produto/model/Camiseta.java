package produto.model;

public class Camiseta extends Produto {
	
	String tamanho;
	String material;

	public Camiseta(int codigo, String nome, float valor, String tamanho, String material) {
		super(codigo, nome, valor);
	
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Informações: " + this.tamanho + " composição " + this.material);
	}
	}
	