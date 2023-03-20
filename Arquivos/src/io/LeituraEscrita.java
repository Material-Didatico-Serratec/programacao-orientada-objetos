package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LeituraEscrita {

		public static void escritor(String path) throws IOException {
			
			//Solitar que usuário digite o nome do arquivo
			System.out.println("Escreva o nome do arquivo com extensão: ");
			Scanner in = new Scanner(System.in);
			String pathCompleto = path + "\\" + in.nextLine();
			
			//Capturar escrita no terminal que será usada para escrever no arquivo
			System.out.println("Escreva o conteudo do arquivo:");
			String linha = in.nextLine();
			
			//Escrever conteudo no arquivo e salva-lo no disco
			BufferedWriter bw = new BufferedWriter(new FileWriter(pathCompleto));
			bw.append(linha);
			bw.close();
			
			in.close();
			
			System.out.println("Arquivo gravado com sucesso.");
		}
		
		public static void leitor(String path) throws IOException {
			BufferedReader br = new BufferedReader(new FileReader(path));
			while(true) {
				String linha = br.readLine();
				if(linha != null) {
					System.out.println(linha);
				}
				else {
					break;
				}
			}
			br.close();
		}
}
