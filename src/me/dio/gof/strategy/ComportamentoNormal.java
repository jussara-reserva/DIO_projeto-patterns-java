package me.dio.gof.strategy;

// Strategy
public class ComportamentoNormal implements Comportamento {

	@Override
	public void mover() {
		System.out.println("Movendo-se normalmente...");		
	}
	
}
