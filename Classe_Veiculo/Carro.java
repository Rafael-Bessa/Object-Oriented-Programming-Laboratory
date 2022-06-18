
public class Carro extends Veiculo {
	private int cilindradas;
	
	public String toString() {
		return "Carro fabricado em " + getAnoDeFabricacao() + " com " + cilindradas + " cilindradas";
	}
	
	Carro(int ano, String modelo, String marca, int cilindradas){
		super(ano, modelo, marca);
		this.cilindradas = cilindradas;
		
	}
	
	public static void main(String[] args) {
		Carro ford = new Carro(1910, "Sedan", "Ford", 2900);
		
		System.out.println("O veículo criado foi " + ford);
		System.out.println("O Carro é do modelo " + ford.getModelo());
		System.out.println("O Carro é da marca " + ford.getMarca());
	}

}
