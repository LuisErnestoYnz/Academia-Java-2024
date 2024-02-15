package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import main.UsuarioDTO;
import main.UsuarioServicio;

class UsuarioServicioTest {
	
	private UsuarioServicio usuarioServicio;
	
	// "Antes de c/u". El método setUp() que se ejecuta antes de crear el test para crear un nuevo usuario Servicio
	@BeforeEach
	public void setUp() {
		usuarioServicio = new UsuarioServicio();
		// Se crean algunos datos de prueba previos antes de efectuar los test
		usuarioServicio.crearUsuario(0L, "Usuario principal");
		usuarioServicio.crearUsuario(2L, "Usuario segundo");
	}
	
	// Para describir el nombre de nuestro test de forma mas clara
	@DisplayName("Dado un usuario que queremos crear, esperamos que cuando llamamos a 'crearUsuario', " +
	             "el usuario este creado.")
	@Test
	public void test1() {
		// Usuario esperado
		UsuarioDTO esperado = new UsuarioDTO(1L, "Prueba");
		
		// Testear método crearUsuario y obtener su resultado
		final UsuarioDTO resultado = usuarioServicio.crearUsuario(1L, "Prueba");
		
		// Verifica que ambos elementos sean iguales. Fallará si no lo es	
		Assertions.assertEquals(esperado.id, resultado.id);
		Assertions.assertEquals(esperado.nombre, resultado.nombre);
		Assertions.assertEquals(esperado, resultado);
	}
	
	// Para describir el nombre de nuestro test de forma mas clara
	@DisplayName("Dado un usuario que queremos crear, esperamos que cuando llamamos a 'crearUsuario', " +
		             "el usuario este creado.")
	@Test
	public void test2() {
		// Usuario esperado
		UsuarioDTO esperado = new UsuarioDTO(1L, "Nombre");
		
		// Testear metodo crearUsuario y obtener su resultado
		final UsuarioDTO resultado = usuarioServicio.crearUsuario(1L, "Prueba");

		// Verifica que ambos elementos sean iguales. Fallará si no lo es	
		Assertions.assertEquals(esperado.id, resultado.id);
		Assertions.assertNotEquals(esperado.nombre, resultado.nombre, "Los nombres no son diferentes");
		Assertions.assertNotEquals(esperado, resultado);
	}
	
		@Test
		public void test3() {	
			// Testear método crearUsuario y obtener su resultado
			final UsuarioDTO resultado = usuarioServicio.obtenerUsuario(1L);
			
			// Verifica que ambos elementos sean iguales. Fallará si no lo es	
			Assertions.assertEquals(null, resultado);
		}
		
		@Test
		public void test4() {
			// Usuario esperado
			UsuarioDTO esperado = new UsuarioDTO(1L, "Nombre");
			
			// Crear usuario 
			usuarioServicio.crearUsuario(1L, "Nombre");
			
			// Testear metodo crearUsuario y obtener su resultado
			final UsuarioDTO resultado = usuarioServicio.obtenerUsuario(1L);
			
			// Verifica que ambos elementos sean iguales. Fallará si no lo es	
			Assertions.assertEquals(esperado, resultado);
		}

}
