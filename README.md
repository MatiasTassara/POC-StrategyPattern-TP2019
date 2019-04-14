# TP1-LaboratorioV-2019

PARTE TEORICA.

1)Que es maven?
  Maven es una herramienta open source de gestión de proyectos que se basa en la “convención sobre configuración”.
  Es decir, asume un comportamiento por defecto que permite empezar a trabajar sin necesidad de configuración.
  Se utiliza en la gestión y construcción de software. Posee la capacidad de realizar ciertas tareas claramente definidas, 
  como la compilación del código y su empaquetado. Es decir, con Maven vamos a poder compilar, empaquetar, generar documentación,
  pasar los test, preparar las builds entre otras cosas.
  Tiene una configuración de construcción basado en un formato XML.
  Tambien se encarga de la gestion de librerias automaticamente. Es decir, hace posible la creación de software con dependencias 
  incluidas dentro de la estructura del JAR. 
  Sin embargo, la característica más importante de Maven es su capacidad de trabajar en red. Cuando definimos las dependencias de
  Maven, este sistema se encargará de ubicar las librerías que deseamos utilizar en Maven Central,
  el cual es un repositorio que contiene cientos de librerías constantemente actualizadas por sus creadores.
  Cuando necesitemos importar una libreria, Maven la buscara en nuestro repositorio local, si no la encuentra la descargara de Maven 
  Central, y ya la tendremos disponible de ahora en para ese proyecto y demas proyectos futuros en nuestro repositorio local.
  Tambien tiene en cuenta las dependencias transitivas. Es decir, si A depende de B y B depende de C, es que A depende de C.
  Esto quiere decir que cuando empaquetemos A, Maven se encargará de añadir tanto B como C en el paquete.
  Es necesario definir todas las dependencias del proyecto (librerías externas utilizadas) en un fichero propio de todo proyecto Maven,
  el POM (Project Object Model).
  Maven permite incluso buscar versiones más recientes o más antiguas de un código dado y agregarlas a nuestro proyecto.
  Todo se hará de forma automática sin que el usuario tenga que hacer nada más que definir las dependencias.
  
2) POM, que significa y para que nos sirve?
  POM significa project object model. Es un archivo XML, que es la “unidad” principal de un proyecto Maven.
  Dicho de otra forma, es una representacion en formato XML de un proyecto Maven guardado en un archivo llamado pom.xml .
  Contiene información a cerca del proyecto, nombre (groupId, artifactId, version), licencias, la URL donde esta el proyecto,
  modalidad de empaquetado (jar, war, ear, etc), fuentes, test, dependencias (junit, spring…), plugins (Java compiler, para 
  configurar la versión del JDK, por ejemplo), version y todo lo necesario para que a la hora de generar el archivo ejecutable
  de nuestra aplicación este contenga todo lo que necesita para su ejecución en su interior.
  Es un centro unico para todo lo que al proyecto refiere.
  Tambien jugando con los pom.xml de los proyectos, podemos hacer herencia y composición de proyectos. La composición no es más 
  que una dependencia normal de las de Maven, de un proyecto con otro. La herencia es un proyecto que tiene subproyectos debajo.
  Los supproyectos heredan las "cosas" del padre, como plugins para informes, etc.
  
  
3)  Diferencias entre el archetype y el artifact.
  En esencia, un archetype es un patrón o modelo sobre el que se pueden desarrollar todas aquellas tareas que son de un mismo tipo.
  Conceptualmente un arquetipo es básicamente una plantilla. Es decir, un patrón o modelo original desde el que se generarán otros
  elementos del mismo tipo. En desarrollo nos apoyamos en los arquetipos para reutilizar código y arquitecturas.
  Puede decirse que son plantillas, parametrizadas o configuradas para utilizar determinadas tecnologías que los desarrolladores 
  utilizan como base para escribir y organizar el código de la aplicación.
  Que todos los proyectos que involucren ciertas tecnologías partan de una base (arquetipo, plantilla o esqueleto configurado) común,
  tiene ventajas evidentes:
    - Homogeneidad entre distintos desarrollos que utilizan las mismas tecnologías.
    - Reutilización y construcción de unos arquetipos como suma de otros.
    - Estandarización de los proyectos dentro de una organización. La homogeneidad en la estructura del proyecto facilita las tareas de desarrollar, desplegar y mantener el proyecto generado.
    - Reducción del tiempo necesario para la construcción de los diversos servicios.
  
  El artifact es el output del build, o sea lo que el build crea. En terminos simples, si se crea un jar, es el jar.
  Si se crea un war, es el war.
  Tambien los artifacts son inputs del build. Muchas veces los modulos dependen de otros, entonces si el modulo
  A depende del modulo B, el modulo A necesita los artifacts del modulo B.
  Los artifacts no tiene que ser siempre cosas usadas para correr o crear modulos, tambien pueden incluir fuentes y javadocs.
  
  Un build del archetype es un build que genera un proyecto basado en un template. Es creado para hacer los builds mas faciles.
  Por ejemplo muchos proyectos tienen esto en comun:
                                                     src
                                                     main
                                                     java
                                                     resources
                                                     test
                                                     java
                                                     resources
                                                     pom.xml
Un archetype simple creara un proyecto vacio que se ve comop lo que esta arriba. El pom.xml va a estar listo para crear un jar.

4)Explique los siguientes goals de Maven: Clean, Package, Install y Compile.
  

5)Explique los siguientes scopes: compile, provide, runtime, test y system.

  


