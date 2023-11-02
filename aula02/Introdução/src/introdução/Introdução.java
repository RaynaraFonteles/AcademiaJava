package introdução;

public class Introdução {
	
	public static void main(String[] args) {
		
		// Identificadores (letra, _, $)
		// Palavras Reservadas (int, double, char)
	
	
		String nome = "Raynara";
		int numeroInteiro = 1;
		double numeroDecimal = 99.99;
		float valorPi = 3.14f;
		char unicaLetra = 'R';
		boolean valorVerdadeiro = true; // ou false
		
		
		// Declaração 
		String nome1;
		
		// Inicialização
		String nome2 = "Raynara";
		
		// Atribuição
		nome = "Raynara";
		System.out.println("nome: " + nome);
		
		// Reatribuição
		nome = "Raynara";
		System.out.println("nome: " + nome);
		
		
		// Operadores
		int n1 = 1; // Inteiro
		int n2 = 2;
		
		System.out.println(n1 + 2);// Soma
		System.out.println(n1 - 2);// Subtração
		System.out.println(n1 * 2);// Multiplicação
		System.out.println(n1 / 2);// Divisão
		System.out.println(n1 % 2);// Resto da Divisão
		
		
		// Operadores Relacionais 
		int a = 1; // Inteiro
		int b = 2;
		
		System.out.println(a == b); // Igual - false
		System.out.println(a != b); // Diferente - true
		System.out.println(a <= b); // A menor ou igual a B - true
		System.out.println(a >= b); // A menor ou igual ao B - false
		
		
		//Operadores Lógicos
		boolean x = true;
		boolean y = false;
		
		System.out.println(x && y); // E - False
		System.out.println(x || y); // OU - True
		System.out.println(!x); // Negação - false
		
		
		int numeroX = 10;
		
		// Incremento
		numeroX++; // 11
		numeroX = numeroX + 1; // 12
		
		// Decremento
		numeroX--; //11
		numeroX = numeroX - 1; // 10
		
		
		// Operadores de Atribuição
		numeroX += 5; // 15 // numeroX = numeroX + 5
		numeroX -= 10; // 5 // numeroX = numeroX - 10
		numeroX *= 2; // 10 // numeroX = numeroX * 2
		numeroX /= 2; // 5 // numeroX = numeroX / 2
		
		// Vetores
		
		// Criando uma variável chamada number 5 posições
		int [] number = new int[5]; // 0,1,2,3,4
		int [] inicializaVetor = {1,2,3,4,5};
		
		// Acessar
		int primeiroNumero = inicializaVetor[0]; //1
		// inicializaVetor[0]; 1
		// inicializaVetor[1]; 2
		// inicializaVetor[2]; 3
		// inicializaVetor[3]; 4
		// inicializaVetor[4]; 5
		
		// Modificar
		inicializaVetor[3] = 10; // {1,2,3,10,5};
		
		// Matriz
		int [][] matriz = new int [3][3];
		// [ , , ]
		// [ , , ]
		// [ , , ]
		int [][] inicializaMatriz = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		// Acessar 
		int value = inicializaMatriz[1][2]; // 6
		inicializaMatriz[0][0] = 10; // {10,2,3}, {4,5,6}, {7,8,9}
		
		int[] inicializaVetorFor = {10,20,30,40,50};
		for(int i=0; i < inicializaVetorFor.length; i++) {
			// i = 0 vetor = 5 
			System.out.println(inicializaVetorFor[i]); // 1,2,3,4,5
			// i = 5
		}
		
		int i = 0;
		while(i < inicializaVetorFor.length) {
			System.out.println(inicializaVetorFor[i]);
			i++;
		}
		
		
		// Condicionais
		// IF - Else
		
		int idade = 17;
		if(idade >= 18) {
			System.out.println("Você é um adulto!");
		}else {
			System.out.println("Você não é um adulto!");
		}
		
		
		// Switch-Case
		char nota = 'R';
		
		
		switch (nota) {
		case 'A':
			System.out.println("Você passou com a nota máxima!");
			break;
		case 'B':
			System.out.println("Você passou!");
			break;
		default:
			System.out.println("Você reprovou!");
		}
		
		
		int resultado = soma (7,8);
		System.out.println(resultado);
		
		System.out.println(soma(5, 3));
		System.out.println(soma(15, 23));
		System.out.println(soma(35, 34));
	}
	
	public static int soma(int num1, int num2) {
		return num1 + num2;
	}
}
