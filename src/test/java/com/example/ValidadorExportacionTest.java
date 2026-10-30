package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidadorExportacionTest {
    @Test
    public void testValidarExportacion() {
        // Arrange
        ValidadorExportacion validador = new ValidadorExportacion();
        String exportacionValida = "EXPORTACION123";
        String exportacionInvalida = "INVALIDO";

        // Act
        boolean resultadoValido = validador.validarExportacion(exportacionValida);
        boolean resultadoInvalido = validador.validarExportacion(exportacionInvalida);

        // Assert
        assertTrue(resultadoValido, "La exportación válida debería ser aceptada.");
        assertFalse(resultadoInvalido, "La exportación inválida debería ser rechazada.");
    }
}
