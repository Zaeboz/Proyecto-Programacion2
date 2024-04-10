# Proyecto Final Prgroamación 2

Este proyecto es una aplicación JavaFX que gestiona una facultad. La facultad tiene listas de estudiantes, profesores, carreras y materias.

## Estructura del proyecto

El proyecto se divide en varios paquetes y clases:

- `proyectoFinal`: Este es el paquete principal que contiene la clase `Faculty`.
- `proyectoFinal.model`: Este paquete contiene las clases de modelo como `Student`, `Teacher`, `Career` y `Subject`.
- `proyectoFinal.controller`: Este paquete contiene las clases controladoras como `StudentController`, `SubjectController` y `TeacherController`.
- `proyectoFinal.view`: Este paquete contiene las vistas de la aplicación.

## Clase principal: Faculty

La clase `Faculty` es la clase principal de la aplicación. Extiende de `Application` de JavaFX y contiene varias listas para almacenar los estudiantes, profesores, carreras y materias.

### Métodos importantes

- `addStudent(String documentCardStudent, String nameStudent, String birthDateStudent)`: Este método se utiliza para añadir un nuevo estudiante a la lista de estudiantes.
- `addTeacher(String documentCard, String teacherName, String profession, int academicLevel, ArrayList<Subject> subjectlist2)`: Este método se utiliza para añadir un nuevo profesor a la lista de profesores.
- `addSubject(String subjectCode, String subjecName, int numberCredits, int subjectType, int semester)`: Este método se utiliza para añadir una nueva materia a la lista de materias.
- `addCareer(Career career)`: Este método se utiliza para añadir una nueva carrera a la lista de carreras.
- `careerSerch(String careerName)`: Este método se utiliza para buscar una carrera por su nombre.
- `searchStudent(String documentCard)`: Este método se utiliza para buscar un estudiante por su documento de identidad.

## Cómo ejecutar el proyecto

Para ejecutar el proyecto, se puede utilizar cualquier IDE que soporte Java y JavaFX. Se puede iniciar la aplicación ejecutando el método `main` en la clase `Faculty`.

## Licencia

Este proyecto está licenciado bajo los términos de la licencia MIT.