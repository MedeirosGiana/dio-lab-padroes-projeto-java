package one.digitalinnovation.gof.strategy;

public class Robo {
	
	//Strategy de comportamento do robo
	private Comportamento comportamento;
	//para mudar de comportamento 

	public void setComportamento(Comportamento comportamento) {
		this.comportamento = comportamento;
	}
    //faz com que o robo se mova da maneira mais interessante
	public void mover() {
		comportamento.mover();
	}
}

