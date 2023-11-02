package questões;

/* Dada a classe Java Quest1 (apresentada no codigo abaixo) continue 
 * a implementacao do metodo main para calcular e exibir a media dos 
 * valores contidos no vetor values
 */

public class Exercicio1 {

	public static void main(String[] args) {
		float values[] = {2,8,5,9,6};
		float somaValores = 0;
		float media;
		
		//Realizar a soma
		for(int i=0; i < values.length; i++) {
			somaValores += values[i]; //0,2,10,15,24,30
		}
		
		media = somaValores / values.length;
		System.out.println("Media: " + media);
	}

}
