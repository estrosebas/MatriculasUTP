# Sistema de Matrículas

Este proyecto implementa un sistema simple de matriculación de estudiantes, aprovechando Java y la base de datos MySQL.

## Características

- Gestión de alumnos (añadir, editar, eliminar, listar).
- Conexión a base de datos MySQL.
- Modelo DAO para interacción con la base de datos.

## Estructura del Proyecto

El proyecto está estructurado en varios paquetes y clases:

- `com.develop.matriculas.Matriculas`: Clase principal del proyecto, encargada de la interacción con el usuario.
- `libreria`: Paquete que contiene todas las clases de soporte, incluyendo:
  - `Alumno`: Modelo de datos para los alumnos.
  - `AlumnoDAO`: Clase DAO para gestionar la persistencia de los alumnos.
  - `conexiones`: Clase para gestionar la conexión a la base de datos.
  - ... (y otras clases relacionadas con habilidades, matriculación, representantes, salud).

## Requisitos

- Java JDK 20 (según tu archivo POM)
- MySQL (y el conector JDBC correspondiente, versión 8.0.26 según tu POM)

## Instrucciones de Uso

1. Clonar este repositorio.
2. Asegurarse de tener MySQL ejecutándose y configurar las credenciales según lo definido en la clase `conexiones`.
3. Ejecutar la clase `Matriculas` para iniciar el programa.

## Contribuciones

Si deseas contribuir al proyecto, ¡por favor, haz un fork y envía una pull request!
