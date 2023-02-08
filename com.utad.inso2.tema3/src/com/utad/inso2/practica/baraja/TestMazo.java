package com.utad.inso2.practica.baraja;

public class TestMazo {
	public static void main(String[] args) {
		Mazo mazo = new Mazo();
		System.out.println("Estado del mazo o baraja, mostrarMazo();");
		mazo.mostrarMazo();
		System.out.println("*Procedemos a barajar barajar(); **");
		mazo.barajar();
		System.out.println("Estado después de barajar, mostrarMazo() el resultado es aleatorio;");
		mazo.mostrarMazo();
		System.out.println("Numero de cartas disponibles: "+mazo.cartasDisponibles());
		System.out.println("Damos 5 cartas a un jugador");
		mazo.darCartas(5);
		mazo.cartasMonton();
		System.out.println("Estado del mazo o baraja después de haber repartido 5 cartas");
		mazo.mostrarMazo();
		System.out.println("Sacamos una carta de la baraja para un jugador");
		mazo.darCartas(1);
		mazo.cartasMonton();
		System.out.println("Estado de las cartas repartidas, cartasMonton()");
		mazo.cartasMonton();
		System.out.println("Un reparto con trampas ha sido producido por esta invocación");
		System.out.println("mazo.darCartas(mazo.cartasDisponibles());");
		mazo.darCartas(mazo.cartasDisponibles());
		mazo.cartasMonton();
		System.out.println("Estado del mazo o baraja, mostrarMazo();");
		mazo.mostrarMazo();
	}
}