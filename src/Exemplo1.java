
public class Exemplo1 {
	/* Ler dois números inteiros e informar se o primeiro valor lido é maior, menor ou igual ao segundo.*/

	public static void main(String[] args) {
		int num1, num2;
		
		num1 = Console.readInt("Digite o 1º número: ");
		num2 = Console.readInt("Digite o 2º número: ");
		
		if (num1 == num2) 
		{
			System.out.println("O primeiro número digitado é IGUAL ao segundo!");
		}
		else if (num1 > num2) 
		{
			System.out.println("O primeiro número digitado é MAIOR que o segundo");
		}
		else
		{
			System.out.println("\nO primeiro número digitado é MENOR que o segundo");
		}
		
	}

}
