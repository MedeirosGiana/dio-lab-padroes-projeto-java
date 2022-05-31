package one.digitalinnovation.gof.singleton;

/**
 * Singleton "apressado"
 * @author giana
 */

//no momento que a classe for acionada oSingletonEager já atribui 
//a instancia e já está proto para ser retornado.

public class SingletonEager {
	
private	static SingletonEager instancia =  new SingletonEager();
	
	private SingletonEager() {
		super();
	}
	
	public static SingletonEager getInstancia() {
		return instancia;
	}

}
