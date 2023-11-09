package application;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import entities.Gato;

public class Program {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("----------------------------------------------");
		TimeUnit.SECONDS.sleep(2);
		System.out.println("Bem vindo ao universo dos gatos! /ᐠ - ˕ -マ");
		TimeUnit.SECONDS.sleep(2);
		System.out.println("Aqui você vai criar seu gatinho no universo dos gatos!");
		TimeUnit.SECONDS.sleep(2);
		System.out.println("Para começar digite o nome do seu gato:");
		Gato gato = new Gato();
		gato.setNome(sc.next());
		TimeUnit.SECONDS.sleep(2);
		System.out.println("O nome do seu gato é " + gato.getNome()+ "?");
		TimeUnit.SECONDS.sleep(2);
		System.out.println("-----------------------------------------------");
		TimeUnit.SECONDS.sleep(2);
		System.out.println(" ₍^._.^₎ S");
		TimeUnit.SECONDS.sleep(2);
		System.out.println("Meowwwwwwwww!!");
		TimeUnit.SECONDS.sleep(2);
		System.out.println("Digite: 1-sim 2-não");
		int confirm = sc.nextInt();
		
		if(confirm==1) {
			TimeUnit.SECONDS.sleep(2);
			System.out.println("Muito bem " + gato.getNome() + " vamos continuar te conhecendo melhor!" );
		}else if(confirm ==2){
			TimeUnit.SECONDS.sleep(2);
			System.out.println("Insira seu nome correto dessa vez:");
			gato.setNome(sc.next());
		}else {
			TimeUnit.SECONDS.sleep(2);
			System.out.println("Digite um valor válido!! ฅ^._.^ฅ");
		}
		TimeUnit.SECONDS.sleep(2);
		System.out.println("Qual a cor que você deseja ter " + gato.getNome()+ "?" );
		TimeUnit.SECONDS.sleep(2);
		System.out.println("1-Laranjinha 2-Listradinho 3-Pretinho 4-Branquinho");
		
		confirm = sc.nextInt();
		
		if(confirm ==1) {
			gato.setCor("Laranjinha");
			TimeUnit.SECONDS.sleep(2);
			System.out.println("Muito bem " + gato.getNome() + " você é: " + gato.getCor());
			TimeUnit.SECONDS.sleep(2);
			System.out.println("≽ܫ≼");
		}else if(confirm ==2) {
			gato.setCor("Listradinho");
			TimeUnit.SECONDS.sleep(2);
			System.out.println("Muito bem " + gato.getNome() + " você é: " + gato.getCor());
			TimeUnit.SECONDS.sleep(2);
			System.out.println("≽ܫ≼");
		}else if(confirm ==3) {
			gato.setCor("Pretinho");
			TimeUnit.SECONDS.sleep(2);
			System.out.println("Muito bem " + gato.getNome() + " você é: " + gato.getCor());
			TimeUnit.SECONDS.sleep(2);
			System.out.println("≽ܫ≼");
		}else if(confirm ==4) {
			gato.setCor("Branquinho");
			TimeUnit.SECONDS.sleep(2);
			System.out.println("Muito bem " + gato.getNome() + " você é: " + gato.getCor());
			TimeUnit.SECONDS.sleep(2);
			System.out.println("≽ܫ≼");
		}
		
		
		
		
		
	sc.close();
	}

}
