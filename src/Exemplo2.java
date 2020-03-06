
public class Exemplo2 {
	/* Os funcionários de uma empresa receberam um aumento de salário: técnicos (código = 1) 50%; gerentes (código = 2) 30%;
	 *  demais funcionários (código = 3) 20%. Escrever um algoritmo para ler o código do cargo de um funcionário e o valor
	 *   do seu salário atual, calcular e imprimir o novo salário após o aumento.*/

	public static void main(String[] args) {
		int codigo; double salario;
		
		codigo = Console.readInt("Bom dia, digite seu código de colaborador(1-2-3): ");
		salario = Console.readInt("Bom dia, digite seu ultimo salario: ");
		
		switch (codigo) 
		{
		   case 1:
			   salario = salario + salario * 0.5;	
		         System.out.println ("O valor do seu salario é R$"+ salario);
		           break;
		   case 2:
			   	System.out.println ("O valor do seu salario é R$"+ salario+salario*0.3);
		           break;
		  default:
			  	System.out.println ("O valor do seu salario é R$"+ salario+salario*0.2);
		}
	}

}
