package one.digitalinnovation.gof.singleton;

/**
 * Singleton "pregui�oso"
 * @author giana
 */

//O Singleton tem uma instancia dele mesmo, quando for nullo instancia,
//quando n�o for nulo, retorna ele mesmo

public class SingletonLazy {
	
	private	static SingletonLazy instancia;
	
	private SingletonLazy() {
		super();
	}
	public static SingletonLazy getInstancia() {
		if (instancia == null) {
			instancia = new SingletonLazy();
		}
		return instancia;
	}
	
	
}
