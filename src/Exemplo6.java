import com.sun.org.apache.xpath.internal.operations.Mod;


public class Exemplo6 {
	/*  Escrever um algoritmo que leia 10 números e conte quantos números são pares e quanto são impares.*/

	public static void main(String[] args) {
		int par = 0, impar = 0, num;
		
		for (int i = 0; i < 10; i++) {
			num = Console.readInt("Informe um número inteiro");
			
			if (num % 2 == 0) 
			{
				par ++;   
			}
			else
			{
				impar ++; 
			}
		}
		System.out.println("Total de pares é "+ par);
		System.out.println("Total de ímpares é "+ impar);
	}

}
