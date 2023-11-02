package questões;
	
	/*Dada a classe Quest3 (apresentada na imagem abaixo) implemente o 
	 * método factorial para calcular e retornar o fatorial de um número
	 * informado 
	 */
	
	public class Exercicio3 {

		public static void main(String[] args) {
			int number = 5; //5! 5* (4*3*2*1) = 120
			System.out.print("The Factorial of " + number + " is: ");
			System.out.print(factorial(number));

		}

		public static int factorial(int value) {
			//5 * 4!(4 * 3!(3 * 2!(2 * 1!(1 * 0!(1)))) 
			if(value == 0) {
				return 1;
			}else {
				return value * factorial(value -1);
			}
		}
		
//		public static int factorial(int value) {
//			int factorial = value;
//			
//			while(value > 1) {
//				factorial = factorial * (value - 1);
//				value--;
//			}
//			
//			return factorial;
//		}


}
