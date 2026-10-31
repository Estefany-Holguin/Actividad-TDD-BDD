package com.example;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class ExportacionSteps {

    private ValidadorExportacion validador;
    private boolean resultado;

    @Dado("que hay datos cargados en el sistema")
    public void queHayDatosCargadosEnElSistema() {
        validador = new ValidadorExportacion();
    }

    @Cuando("intento exportar un archivo con extensión {string}")
    public void intentoExportarUnArchivoConExtension(String extension) {
        resultado = validador.validarExportacion(extension);
    }

    @Entonces("debería recibir un mensaje de error indicando que el tipo de archivo no está permitido")
    public void deberiaRecibirUnMensajeDeErrorIndicandoQueElTipoDeArchivoNoEstaPermitido() {
        assertFalse(resultado, "La exportación debería haber fallado para un formato no permitido");
    }
}