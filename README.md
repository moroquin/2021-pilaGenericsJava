# Pila utilizando generics en java para el curso de _Estructura de datos_

## Ejecución

Se encuentra el archivo build.xml para que pueda compilarse el codigo con Ant.

### Opciones

Las opciones disponibles son

- **ant init**: No tiene dependencias. Crea la carpeta build
- **ant compile**: depende de init y crea la carpeta build y compila los paquetes
- **ant jar**: depende de compile y crea la carpeta dist y genera el jarFile
- **ant run**: depende de run y ejecuta el jarFile generado
- **ant javadoc**: No tiene dependencias. Crea la carpeta javadoc, y genera el javadoc del proyecto.
- **ant clean**: elimina las carpetas que se han creado
 - build
 - dist
 - javadoc

### Por defecto

Si ejecuta ant por defecto se ejecutará jar.
