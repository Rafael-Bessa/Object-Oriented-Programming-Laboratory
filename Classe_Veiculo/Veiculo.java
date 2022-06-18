
public class Veiculo {
	private int anoDeFabricacao;
	private String modelo;
	private String marca;
	
	public String getModelo() {
		return modelo;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	Veiculo(int adf, String m, String ma){
		anoDeFabricacao = adf;
		modelo = m;
		marca = ma;
	}
	
	
	public int getAnoDeFabricacao() {
		return anoDeFabricacao;
	}


	public void setAnoDeFabricacao(int anoDeFabricacao) {
		this.anoDeFabricacao = anoDeFabricacao;
	}

	}