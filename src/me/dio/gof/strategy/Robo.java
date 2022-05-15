package me.dio.gof.strategy;

// Context
public class Robo {
	
	private Comportamento comportamento;

	public void setComportamento(Comportamento comportamento) {
		this.comportamento = comportamento;
	}
	
	void mover() {
		comportamento.mover();
	}
}
