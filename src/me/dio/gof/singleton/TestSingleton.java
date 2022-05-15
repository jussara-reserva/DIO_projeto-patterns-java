package me.dio.gof.singleton;

public class TestSingleton {

	public static void main(String[] args) {
		
		// LAZY
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy); // me.dio.gof.SingletonLazy@41a4555e
		
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy); // me.dio.gof.SingletonLazy@41a4555e -> Mesmo endereço de nemória = mesmo objeto
		
		// EAGER
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager); // me.dio.gof.SingletonEager@7d6f77cc
		
		eager = SingletonEager.getInstancia();
		System.out.println(eager); // me.dio.gof.SingletonEager@7d6f77cc -> Mesmo endereço de nemória = mesmo objeto
		
		// LAZY HOLDER
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder); // me.dio.gof.SingletonLazyHolder@6f75e721
		
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder); // me.dio.gof.SingletonLazyHolder@6f75e721 -> Mesmo endereço de nemória = mesmo objeto
		
	}
	
}
