package questões;

	/*Dada a classe Java Quest2 (apresentada na imagem abaixo) implemente o
	 * método main para realizar a chamada ao método getURL e exibir o retorno
	 */
	
	public class Exercicio2 {

		public static void main(String[] args) {
			String retornaURL = getURL();
			System.out.println(retornaURL);
			System.out.println(getURL());
		}
		
		public static String getURL() {
			return "http://www.atos.net";
		}
	}


