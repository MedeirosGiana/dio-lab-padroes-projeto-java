package one.digitalinnovation.gof.singleton;

/**
 * Singleton "apressado"
 * @author giana
 */

//no momento que a classe for acionada oSingletonEager j� atribui 
//a instancia e j� est� proto para ser retornado.

public class SingletonEager {
	
private	static SingletonEager instancia =  new SingletonEager();
	
	private SingletonEager() {
		super();
	}
	
	public static SingletonEager getInstancia() {
		return instancia;
	}

}
