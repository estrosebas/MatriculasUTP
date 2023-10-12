# Sistema de Matriculación de Estudiantes

Este proyecto proporciona un sistema para gestionar la matriculación de estudiantes. Ha sido desarrollado en Java y utiliza una base de datos para almacenar y recuperar información.

## Estructura del Proyecto

- `Matriculas.java`: Este es el punto de entrada principal del programa. 
- `MenuPrincipal.java`: Proporciona la interfaz principal del programa.
- `Alumnos.java`: JFrame que gestiona la información de los alumnos.

### Paquete `libreria`

- `Alumno.java`: Define la estructura y métodos relacionados con un alumno.
- `AlumnoDAO.java`: Clase para interactuar con la base de datos específicamente para operaciones relacionadas con alumnos.
- `conexiones.java`: Encargado de las conexiones a la base de datos.
- `Habilidad.java`: Define las habilidades que puede tener un alumno.
- `Matricula.java`: Representa la matrícula de un estudiante.
- `Representante.java`: Información sobre el representante de un estudiante.
- `Salud.java`: Información relacionada con la salud de un estudiante.

## Cómo usar

1. Asegúrate de tener configurada la base de datos y las credenciales correctas en `conexiones.java`.
2. Ejecuta `Matriculas.java` para iniciar el programa.
3. Utiliza el menú principal para navegar a través de las diferentes funcionalidades.

## Contribuciones

Si deseas contribuir al proyecto, por favor haz un fork y envía un pull request.

## Licencia

Por favor, consulta el archivo de licencia adjunto para más detalles.

---

Espero que este proyecto sea de utilidad. Si tienes preguntas o comentarios, no dudes en abrir un issue.
