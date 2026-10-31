# language: es
Característica: Exportación de reportes

  Escenario: Intentar exportar con un formato no permitido
    Dado que hay datos cargados en el sistema
    Cuando intento exportar un archivo con extensión "INVALIDO"
    Entonces debería recibir un mensaje de error indicando que el tipo de archivo no está permitido