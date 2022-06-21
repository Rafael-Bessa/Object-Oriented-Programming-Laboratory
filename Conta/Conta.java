

public class Conta {

    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total; //static é atributo da classe
    
    public Conta(int agencia, int numero) {
    	Conta.total++;
    	//System.out.println("O número total de contas é " + Conta.total);
    	System.out.println("Estou criando um objeto ein!");
    	this.agencia = agencia;
    	this.numero = numero;
    	
    }

    public void deposita(double valor) {
        this.saldo = this.saldo + valor;
    }

    public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public boolean saca(double valor) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }
        return false;
    }

	public double getSaldo() {
		return saldo;
	}

	public static int getTotal() {
		return Conta.total;
	}
	
}