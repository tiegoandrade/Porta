package portaInterface;

// Implementa a interface Cloneable que permite criar um novo objeto com base no objeto original.
public class Porta implements Cloneable {
	
	//Atributos que armazenam altura, largura e se a porta est� aberta ou n�o, respectivamente.
	
	private double altura;
	private double largura;
	private boolean aberta;
	
	// Construtor que recebe a altura e a largura de uma porta quando esse objeto for criado.
	public Porta (double altura, double largura){
		this.altura = altura;
		this.largura = largura;
	}
	
	// M�todo que abre a porta.
	public void abrir(){
		aberta = true;
	}
	
	// M�todo que fecha a porta.
	public void fechar(){
		aberta = false;	
	}
	
	// M�todo get que permite acessar o atributo altura de um objeto "porta".
	public double getAltura() {
		return altura;
	}
	
	// M�todo get que permite acessar o atributo largura de um objeto "porta".
	public double getLargura() {
		return largura;
	}
	
	// M�todo get que permite acessar o atributo aberta de um objeto "porta".
	public boolean isAberta() {
		return aberta;
	}
	
	// M�todo da classe Object que � sobrescrito para criar uma c�pia de um objeto original (porta).
	public Object clone() throws CloneNotSupportedException{
		Porta p = new Porta(this.altura, this.largura);
		p.aberta = this.aberta;
		
		return p;
	}
}
