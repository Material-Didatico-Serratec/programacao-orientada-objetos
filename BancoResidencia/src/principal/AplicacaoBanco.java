package principal;

import contas.Conta;
import contas.ContaCorrente;
import contas.ContaPoupanca;

public class AplicacaoBanco {

	public static void main(String[] args) {
		System.out.println("Banco Residência");
		
//		Conta conta = new Conta();
//		conta.agencia = 1;
//		conta.setTitular("Maria Teresa");
//		System.out.println("Parabéns " + conta.getTitular() + " sua conta foi aberta.");
//		System.out.println("Sua Agencia é: " + conta.agencia);
//		
//		Conta conta2 = new Conta("Marcelo Collares");
//		System.out.println("Parabéns " + conta2.getTitular() + " sua conta foi aberta.");
//		System.out.println("Sua Agencia é: " + conta.agencia);
		
//		ContaPoupanca poupanca = new ContaPoupanca("Marcelo Collares");
//		poupanca.setRendimento(10);
//		System.out.println("Parabéns " + poupanca.getTitular() + " sua conta foi aberta.");
//		System.out.println("Seu rendimento é de: " + poupanca.getRendimento() + " por cento.");
//		poupanca.depositar(100.0);
//		System.out.println("Seu saldo é de: " + poupanca.getSaldo());
//		poupanca.sacar(20.0);
//		System.out.println("Seu saldo é de: " + poupanca.getSaldo());
		
		Conta contaP, contaC = null;
		
		contaP = new ContaPoupanca();
//		contaP.sacar(10.0);

//		contaC = new ContaCorrente();
//		contaC.sacar(10.0);
		
		contaP.transferir(10.0, contaC);
	}

}
