# Automatización con Maven y Selenium en Java
Este proyecto de automatización de pruebas utiliza Maven y Selenium WebDriver en Java para realizar pruebas automatizadas en un navegador web.
- [Selenium](https://www.selenium.dev/blog/)

## Configuración del entorno
Asegúrate de tener instalado lo siguiente:
- [Java](https://www.java.com/es/download/)
- [Maven](https://maven.apache.org/download.cgi)

## Clonar el repositorio
```bash
cd Ruta_Descarga_Repositorio
git clone https://github.com/AlbionDraig/TestAutomationMaven.git
```

## Descargar dependencias de Maven
```bash
mvn clean install
```
Esto descargará todas las dependencias necesarias, incluido WebDriverManager para gestionar los controladores del navegador.
```bash
mvn test
```
Esto ejecutará las pruebas automatizadas utilizando JUnit y generará informes si es necesario.
```bash
mvn clean install test
```

## Configuración del navegador
Puedes configurar el navegador y otras opciones en el archivo
`src/test/resources/config.ini`.

## Estructura del proyecto
- `src/test/java`: Clases de prueba de Selenium.
- `src/test/resources`: Recursos como archivos de configuración.

## Añadir nuevas pruebas
1. Crea nuevas clases de prueba en `src/test/java`.
2. Utiliza la anotación `@Test` de JUnit para marcar tus métodos de prueba.
3. Puedes organizar tus pruebas en paquetes según sea necesario.

¡Diviértete automatizando!
