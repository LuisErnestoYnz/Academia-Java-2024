package com.curse.v0;
//Clase que representa un elemento de UI Button
public class Button extends UIControl {
	
	// Constructor
	Button(boolean habilitado, int ejex, int ejey) {
		super(habilitado, ejex, ejey);
	}

	// Se sobreescribe el método dibujar y se obtienen las coordenadas x y y de las posiciones
	// de los elementos de Interfaz de Usuario
	@Override
    public void dibujar() {
        System.out.println("Dibujando un Button en posicion (" + getEjex() + "," + getEjey() + ")");
    }
}
