
public class Exemplo3 {
	/* Desenvolver um algoritmo para ler o valor inteiro da idade de uma pessoa e imprimir uma das mensagens: 
	 * se idade <= 13: Criança, se idade >= 13 e < 20: Adolescente, se idade >= 20 e <= 60: Adulto e se idade >= 60: Idoso.*/

	public static void main(String[] args) {
		int idade; 
		
		idade = Console.readInt("Bom dia, digite sua idade: ");
		
		if (idade < 14 ) 
		{
			System.out.println("Legal! Você ainda é criança");
		}
		else if (idade > 13 && idade < 20) 
		{
			System.out.println("Vixe.. Você é aborrecente!");
		}
		else if (idade > 19 && idade < 61) 
		{
			System.out.println("Bem vindo(a) a vida Adulta");
		}
		else {
			System.out.println("Tarde.. o senhor é Idoso né?");
		}
	}
}
