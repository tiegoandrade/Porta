package portaInterface;

public class Aplicacao {

	public static void main(String[] args) throws Exception {
		/* Cria um objeto porta, passando como 
		 * par�metro sua altura e sua largura.
		 */
		Porta p1 = new Porta(2.1, 0.9);
		
		/* chamada do m�todo abrir, no qual abre uma porta.*/
		p1.abrir();
		
		/* Sa�da com as informa��es de altura, 
		 * largura e se a porta est� aberta.
		 */
		System.out.println("p1 -> Altura = " + p1.getAltura());
		System.out.println("p1 -> Largura = " + p1.getLargura());
		System.out.println("p1 -> Aberta? = " + p1.isAberta());
		
		/* C�pia do objeto acima, com os mesmos valores para os atributos.
		 * Realiza um cast expl�cito para o tipo "Porta".
		 */
		Porta p2 = (Porta) p1.clone();
		System.out.println("\np2 -> Altura = " + p2.getAltura());
		System.out.println("p2 -> Largura = " + p2.getLargura());
		System.out.println("p2 -> Aberta? = " + p2.isAberta());
	}

}
