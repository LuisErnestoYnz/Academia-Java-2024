package com.curse.v0;

// Clase abstracta Control de Interfaz de Usuario
public abstract class UIControl {
	
	// Atributo booleano para representar el estado de habilitación
	private boolean habilitado;
	// Atributos para representar las coordenadas de posicion de los elementos de UI
	private int ejex;
	private int ejey;
	
	// Constructor que habilita el atributo habilitado y recibe las coordenadas 
	// de posición del elemento de Interfaz Gráfica
	UIControl(boolean habilitado, int ejex, int ejey) {
		this.habilitado = habilitado;
		this.ejex = ejex;
		this.ejey = ejey;
	}

	// Método que implementarán las clases Button, CheckBox, Table, TexBox
    public abstract void dibujar();

    // Indicará qué elemento de Interfaz de Usuario se habilitará para dibujarlo
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + 
				"[habilitado = " + habilitado + "], " + 
				"coordenadas de posición: [x=" + ejex + ", y=" + ejey + "]";
	}

	// Getters para encapsular los atributos ejex y ejey
	// Los setters no se pusieron porque se usa el constructor para inicializar ejex y ejey
	public int getEjex() {
		return ejex;
	}

	public int getEjey() {
		return ejey;
	}
	
}
