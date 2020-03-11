
public class Exemplo4 {
	/* 4) Elaborar um algoritmo para ler o código de um produto e informar a sua origem:
			a) Código do produto entre 1 e 20: Europa
			b) Código do produto entre 21 e 40: Ásia
			c) Código do produto entre 41 e 60: América
			d) Código do produto entre 61 e 80: África
			e) Código do produto maior que 80: Paraguai*/

	public static void main(String[] args) {
		int codigo; 
		
		codigo = Console.readInt("Bom dia, digite o Código do produto: ");
		
		if (codigo > 0 && codigo < 21 ) 
		{
			System.out.println("Produto COD("+codigo+") é de origem Europa");
		}
		else if (codigo > 20 && codigo < 41) 
		{
			System.out.println("Produto COD("+codigo+") é de origem Ásia");
		}
		else if (codigo > 40 && codigo < 61) 
		{
			System.out.println("Produto COD("+codigo+") é de origem América");
		}
		else if (codigo > 60 && codigo < 81) 
		{
			System.out.println("Produto COD("+codigo+") é de origem África");
		}
		else {
			/*Código do produto maior que 80: Paraguai*/
			System.out.println("Produto COD("+codigo+") é de origem Paraguai");
		}
	}
}
