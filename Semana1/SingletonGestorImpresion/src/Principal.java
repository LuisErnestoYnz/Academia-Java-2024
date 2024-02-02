
public class Principal {

	public static void main(String[] args) {
		// Un usuario quiere imprimir un documento
        SolicitudImpresion gestor1 = SolicitudImpresion.obtenerInstancia();
        // Un usuario imprime un documento
        gestor1.imprimirDocumento("Contrato.pdf");

        // Otro usuario también quiere imprimir un documento
        SolicitudImpresion gestor2 = SolicitudImpresion.obtenerInstancia();
        gestor2.imprimirDocumento("Informe.txt");
        
        // Otro usuario también quiere imprimir un documento
        SolicitudImpresion gestor3 = SolicitudImpresion.obtenerInstancia();
        gestor3.imprimirDocumento("Carta.doc");
        
        //  Se verifica que se haya creado un solo objeto
        System.out.println(gestor1 == gestor3); //true
        // Contador se mantendrá en 1 porque se busca que no se haya creado mas de un objeto
        System.out.println(SolicitudImpresion.contador); //1
	}

}
