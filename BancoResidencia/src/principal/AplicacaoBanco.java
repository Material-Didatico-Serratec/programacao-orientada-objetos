package principal;

import contas.Conta;
import contas.ContaCorrente;
import contas.ContaPoupanca;

public class AplicacaoBanco {

	public static void main(String[] args) {
		System.out.println("Banco Resid�ncia");
		
//		Conta conta = new Conta();
//		conta.agencia = 1;
//		conta.setTitular("Maria Teresa");
//		System.out.println("Parab�ns " + conta.getTitular() + " sua conta foi aberta.");
//		System.out.println("Sua Agencia �: " + conta.agencia);
//		
//		Conta conta2 = new Conta("Marcelo Collares");
//		System.out.println("Parab�ns " + conta2.getTitular() + " sua conta foi aberta.");
//		System.out.println("Sua Agencia �: " + conta.agencia);
		
//		ContaPoupanca poupanca = new ContaPoupanca("Marcelo Collares");
//		poupanca.setRendimento(10);
//		System.out.println("Parab�ns " + poupanca.getTitular() + " sua conta foi aberta.");
//		System.out.println("Seu rendimento � de: " + poupanca.getRendimento() + " por cento.");
//		poupanca.depositar(100.0);
//		System.out.println("Seu saldo � de: " + poupanca.getSaldo());
//		poupanca.sacar(20.0);
//		System.out.println("Seu saldo � de: " + poupanca.getSaldo());
		
		Conta contaP, contaC = null;
		
		contaP = new ContaPoupanca();
//		contaP.sacar(10.0);

//		contaC = new ContaCorrente();
//		contaC.sacar(10.0);
		
		contaP.transferir(10.0, contaC);
	}

}
