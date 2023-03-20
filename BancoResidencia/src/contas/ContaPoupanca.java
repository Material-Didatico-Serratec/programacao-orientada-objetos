package contas;

public class ContaPoupanca extends Conta{
	
	private double rendimento;

	public ContaPoupanca() {
		
	}
	
	public ContaPoupanca(String nome) {
		this.setTitular(nome);
	}
	
	@Override
	public void depositar(double valor) {
		System.out.println("Depositei na Conta Poupanca");
	}
	
	@Override
	public void sacar(double valor) {
		System.out.println("Saquei da Conta Poupanca");
	}

	public double getRendimento() {
		return rendimento;
	}

	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}

	@Override
	public void transferir(double valor, Conta conta) {
		try {
			this.sacar(valor);
			conta.depositar(valor);
			System.out.println("Transferi da Conta Poupanca para conta destino");	
		}
		catch (Exception e) {
			System.out.println("Houve um erro na transferencia. " + e.getCause());
		}
		
		
	}

}
