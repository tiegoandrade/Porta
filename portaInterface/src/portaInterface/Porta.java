package portaInterface;

// Implementa a interface Cloneable que permite criar um novo objeto com base no objeto original.
public class Porta implements Cloneable {
	
	//Atributos que armazenam altura, largura e se a porta está aberta ou não, respectivamente.
	
	private double altura;
	private double largura;
	private boolean aberta;
	
	// Construtor que recebe a altura e a largura de uma porta quando esse objeto for criado.
	public Porta (double altura, double largura){
		this.altura = altura;
		this.largura = largura;
	}
	
	// Método que abre a porta.
	public void abrir(){
		aberta = true;
	}
	
	// Método que fecha a porta.
	public void fechar(){
		aberta = false;	
	}
	
	// Método get que permite acessar o atributo altura de um objeto "porta".
	public double getAltura() {
		return altura;
	}
	
	// Método get que permite acessar o atributo largura de um objeto "porta".
	public double getLargura() {
		return largura;
	}
	
	// Método get que permite acessar o atributo aberta de um objeto "porta".
	public boolean isAberta() {
		return aberta;
	}
	
	// Método da classe Object que é sobrescrito para criar uma cópia de um objeto original (porta).
	public Object clone() throws CloneNotSupportedException{
		Porta p = new Porta(this.altura, this.largura);
		p.aberta = this.aberta;
		
		return p;
	}
}
