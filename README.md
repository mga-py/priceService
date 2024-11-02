# Getting Started

### Releases
Dejo un complilado de la aplicacion junto con su test en la carpeta releases para poder ejecutarlo nativamente en windows.

### Si desea ejecutarlo en otro sistema operativo:

Puede lanzar los comandos mas abajo descritos para ejecutar la app como contenedor o si quiere generar la imagen nativa para otro sistema operativo.

### Documentacion de referencia
Version de Java: 23
Version de Spring Boot: 3.3.5

Leer HELP.md para mas informacion.

### Descripcion del proyecto
Esta es una aplicación de Spring Boot que se conecta a una base de datos H2 y expone un servicio REST 
para obtener precios de productos entre unas fechas determinadas.

## GraalVM Native Support

Este proyecto se ha configurado para permitirle generar un contenedor liviano o un ejecutable nativo.
También es posible ejecutar las pruebas en una imagen nativa.

### Lightweight Container with Cloud Native Buildpacks

Docker debe estar instalado y configurado en su máquina antes de crear la imagen.
Para crear la imagen, ejecute el siguiente comando:

```
$ ./mvnw spring-boot:build-image -Pnative -Dnet.bytebuddy.experimental=true
```

Luego, puedes ejecutar la aplicación como cualquier otro contenedor:

```
$ docker run --rm -p 8091:8091 zara/price-service:latest
```

### Executable with Native Build Tools

Utilice esta opción si desea explorar más opciones, como ejecutar sus pruebas en una imagen nativa.
El compilador `native-image` de GraalVM debe estar instalado y configurado en su máquina.

NOTE: GraalVM 22.3+ is required.

Para crear el ejecutable, ejecute el siguiente comando:

```
$ ./mvnw native:compile -Pnative -Dnet.bytebuddy.experimental=true
```

Luego, puedes ejecutar la aplicación de la siguiente manera:

```
$ target/priceService
```

También puede ejecutar su conjunto de pruebas existente en una imagen nativa.
Esta es una forma eficiente de validar la compatibilidad de la aplicación.

Para ejecutar las pruebas existentes en una imagen nativa, ejecuta el siguiente comando:

```
$ ./mvnw test -PnativeTest -Dnet.bytebuddy.experimental=true
```

