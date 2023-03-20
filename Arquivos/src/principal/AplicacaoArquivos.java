package principal;

import java.io.IOException;

import io.LeituraEscrita;

public class AplicacaoArquivos {

	public static void main(String[] args) throws IOException {
		
		//LeituraEscrita.escritor(".\\teste");
		LeituraEscrita.leitor(".\\teste\\Nomes.txt");
		
	}

}
