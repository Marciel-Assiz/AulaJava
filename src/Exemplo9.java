public class Exemplo9 {
	/*Construir um algoritmo que calcule a média aritmética de vários valores inteiros positivos digitados pelo usuário.
	 *  O final da leitura acontecerá quando for lido um valor negativo.*/

	public static void main(String[] args) {
		int num, cont=0, soma=0; double media=0;
		
		do {
			num = Console.readInt("Digite um número ");
			
			if (num >= 0) {
				soma += num;
				cont++;
				
				media = soma / cont;
			}			
		} while (num >= 0);
		System.out.println("A média é "+ media);
	}
}
