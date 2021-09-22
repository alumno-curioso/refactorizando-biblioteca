# refactorizando-biblioteca
## Descripcion
el fin de este repositorio es basicamente ir narrando como se refactoriza un codigo que a mi entender es monolitico a un codigo con un diseño de arquitectura **MVC**

si indagas un poco en la arquitectura que puede tener este proyecto veras que los que esta subido ene l repositorio es un proyecto de java, dentro de la carpeta **src**
encontras lo siguiente

- app:
  - este paquete solo contendra la clase que lanzara la app
- controller:
  - clases que puedan ser controladores
- view:
  - las vistas que extraigamos de la refactorizacion
- model:
  - los modelos que necesitemos implementar para la app
- server:
  - en este paquete colocare todo lo relacionado con la bases de datos
- todojunto:
  - original:
    - el proyecto original sin modificar
  - conexion
    - conexion con la base de datos y datos relacionados
  - controladores:
    - las partes que supongo estan destinadas a tal fin del proyecto original
  - modelos:
    - las partes que supongo estan destinadas a tal fin del proyecto original
  - vistas:
    - las partes que supongo estan destinadas a tal fin del proyecto original
    
## mi idea de trabajo
1. Es diseccionar primero todo lo que pueda el trabajo original he ir separandolo en pequeñas partes mas entendibles para mi, cuando digo diseccionar me refiero a cortar las partes de codigo del proyecto original y colocarla en su respectivo paquete
2. una vez terminado el **punto 1** comenzare a refactorizar el codigo ayudandome de la informacion generada en el anterior punto.
3. ir realizando pequeñas pruebas durante el proceso de refactorizacion.
4. Narrar atraves de los commits generados todo el proceso.

# ATENCION
todo lo realizado en este repositorio esta realizado por un alumno-curioso y seguramente tutelado por un profesor igual de curioso.

## puedes usar este repositorio como te plazca pero recuerda que es para fines formativos

# LIST OF TODOS

- [ ] Crear arquitectura del proyecto
- [ ] disccionar por completo el codigo original
- [ ] crear vistas
- [ ] crear conexion
- [ ] crear controladores
- [ ] crear modelos
- [ ] pasarlo bien
  
