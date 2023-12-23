package produto.model;

public class Caneca extends Produto {
	
	private String material;
	private int capacidade;

	public Caneca(int codigo, String nome, float valor, String material, int capacidade1) {
		super(codigo, nome, valor);
		this.capacidade = capacidade1;
		this.material = material;
		
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	
	 @Override
		public void visualizar() {
			super.visualizar();
			System.out.println("Informações: " + this.capacidade + "mls " + this.material);
	 }
}


