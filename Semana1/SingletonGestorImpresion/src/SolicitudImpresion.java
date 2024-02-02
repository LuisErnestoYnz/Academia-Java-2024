
public class SolicitudImpresion {
	// Solicitud de la impresión
    private static SolicitudImpresion impresion;
    static int contador;

    // Constructor privado solo disponible para esta clase
    private SolicitudImpresion() {
    	// Para verificar el numero de solicitudes de impresion
    	contador++;
    }

    // Método público para obtener la instancia única de la clase
    public static SolicitudImpresion obtenerInstancia() {
        // Si la variable de referencia de la solicitud de impresion no apunta a ningún objeto
        if (impresion == null) {
        	// Se invoca al constructor privado y se crea la solicitud de impresión
            impresion = new SolicitudImpresion();
            // Devolvemos la solicitud de impresión
            return impresion;
        } else {
        	// Devolvemos la solicitud de impresión
            return impresion;
        }
    }

    // Método usado para imprimir un documento
    public void imprimirDocumento(String documento) {
        System.out.println("Imprimiendo documento: " + documento);
    }
}
