package com.br.escadinha;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int continuar = 0;
		while (continuar == 0) {
			
		System.out.println("qual o tamanho da escada?");
		int tamanhoDaEscada = entrada.nextInt();
		
		StringBuilder escadinha = new StringBuilder();
		
		System.out.println("qual o caracter?");
		String caracter = entrada.next();
		
		for (int controle = 0; controle < tamanhoDaEscada; controle++) {
			escadinha.insert(controle , caracter);
			System.out.println(escadinha);
		}
		
		System.out.println("0 para continuar. 1 para sair");
		continuar = entrada.nextInt();
	}
		}
}
