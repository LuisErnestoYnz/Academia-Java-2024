package main;

import java.util.Objects;

public class UsuarioDTO {
	public final Long id;
	public final String nombre;
	
	// Constructor
	public UsuarioDTO(Long id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}
	
	// getters
	public Long getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null || getClass() != o.getClass()) return false;
		UsuarioDTO that = (UsuarioDTO)o;
		return Objects.equals(id, that.id) && Objects.equals(nombre, that.nombre);
	}
	
}
