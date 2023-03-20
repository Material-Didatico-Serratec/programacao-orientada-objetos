package contas;

public abstract class Conta implements DemaisOperacoes{
	
	public static int agencia;
	
	private String titular;
	private int numero;
	private double saldo;
	
	public abstract void depositar(double valor);
	
	public abstract void sacar(double valor);

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	

}
