package contas;

public class ContaCorrente extends Conta implements DemaisOperacoes{
	
	private double tarifa;
	
	@Override
	public void depositar(double valor) {
		System.out.println("Depositei na Conta Corrente");
	}
	
	@Override
	public void sacar(double valor) {
		System.out.println("Saquei da Conta Corrente");
	}

	public double getTarifa() {
		return tarifa;
	}

	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}

	@Override
	public void transferir(double valor, Conta conta) {
		System.out.println("Transferi da Conta Corrente para conta destino");
	}
	
}
