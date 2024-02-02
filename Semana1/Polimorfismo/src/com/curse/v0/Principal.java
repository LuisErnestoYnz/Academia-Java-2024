package com.curse.v0;
import java.util.*;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Interfaz Grafica");
		
		List<UIControl> listaUIControls = new ArrayList<>();
		
		// Los objetos de Interfaz de Usuario se agregan al ArrayList
		listaUIControls.add(new TextBox(true, 15, 30));
		listaUIControls.add(new CheckBox(true, 15, 15));
		listaUIControls.add(new Button(true, 5, 0));
		listaUIControls.add(new Table(true, 30, 30));
        
		// Se llama al método estático, pasando como parámetro la lista de elementos de interfaz de Usuario
		dibujarUI(listaUIControls);
	}
	
	// Polimorfismo
	private static void dibujarUI(List<UIControl> listCon) {
		// Para cada objeto del Arraylist, se "Dibuja" un elemento de interfaz de usuario
		for(UIControl control : listCon) {
			System.out.println(control);
			control.dibujar();
		}
    }

}
