package one.digitalinnovation.gof.singleton;


/**
 * Singleton "Lazy Holder"
 * 
 * @author giana
 */

//tem a função de encapsular a instancia em uma classe static interna

public class SingletonLazyHolder {
	
	public static class InstanceHolder {
		public	static SingletonLazyHolder instancia = new SingletonLazyHolder();
	}    
	
	private SingletonLazyHolder() {
		super();
	}
	public static SingletonLazyHolder getInstancia() {
		return InstanceHolder.instancia;
	}

}
