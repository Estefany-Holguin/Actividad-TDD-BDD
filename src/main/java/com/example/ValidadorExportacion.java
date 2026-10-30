package com.example;

public class ValidadorExportacion {

    public boolean validarExportacion(String exportacion) {
        if (exportacion == null) {
            return false;
        }
        return exportacion.startsWith("EXPORTACION");
    }
}