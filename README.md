<div align="center">
<table>
    <theader>
        <tr>
            <th><img src="https://github.com/rescobedoulasalle/git_github/blob/main/ulasalle.png?raw=true" alt="EPIS" style="width:50%; height:auto"/></th>
            <th>
                <span style="font-weight:bold;">UNIVERSIDAD LA SALLE</span><br />
                <span style="font-weight:bold;">CARRERA PROFESIONAL DE INGENIERÍA DE SOFTWARE</span>
            </th>            
        </tr>
    </theader>
    
</table>
</div>
 
<table>
   <theader>
       <tr><th colspan="2">EXAMEN FINAL</th></tr>
    </theader>
<tbody>  

<tr><td>TÍTULO DE LA PRÁCTICA:</td><td>Patrón Builder</td></tr>
<tr><td colspan="2">RECURSOS:
    <ul>
    <li>Oscar J Blancarte Iturralde. Introducción a los patrones de diseño. Un enfoque práctico (Spanish Edition. CreateSpace Independent Publishing Platform (2016)</li>
    </ul>
</td>
</<tr>
<tr><td colspan="2">ALUMNA:
    <ul>
        <li>Sharmelyn Violeta Bautista Luque - sbautistal@ulasalle.edu.pe</li>
    </ul>
</td>
</<tr>


<tr>
<tr><td colspan="2">DOCENTE:
    <ul>
        <li>Richart Smith Escobedo Quispe  - r.escobedo@ulasalle.edu.pe</li>
    </ul>
</td>
</<tr>
</tdbody>
</table>

# Patrón Builder
 
[![Git][Git]][git-site]
[![GitHub][GitHub]][github-site]
[![Java][Java]][java-site]

#

## OBJETIVOS Y TEMAS

### OBJETIVOS
- Aprender el patrón Builder.

### TEMAS
1.  El Patrón Builder
2.  Estructura del patrón de diseño Builder.
3.  Diagrama de secuencia del patrón Builder.
4.  Escenario.
5.  Implementación.
6.  Ejecución.

## CONTENIDO DE LA GUÍA

### MARCO CONCEPTUAL

1. PATRÓN BUILDER:
    El patrón builder, es un patrón de diseño creacional que construye objetos complejos de una manera muy sencilla. Si una clase necesita construir algo complejo como una secuencialidad, usamos este patrón, debido a que, una clase especial se dedica a construir el objeto. Gracias a los frameworks, este patrón tiene más auge. 

2. ESTRUCTURA DEL PATRÓN DE DISEÑO BUILDER  

    ![alt text](https://github.com/SharmelynVioleta/Patron_Builder/blob/master/imagenes/patron_builder_estructura.JPG)
     Fig. 1. Estructura del patrón de diseño Builder [1].

    - La estructura del patrón de diseño Builder se compone de una variedad de componentes, los cuales son: IBuilder, ObjectBuilder, TarjetObjet y  OtherObjets; como se muestra en el diagrama UML en la Fig. 1.
        - IBuilder: Se especifica una interfaz(opcional), que tendrán los Builders. Esta interfaz define el método build.
       
        - ObjectBuilder: Se hará uso de esta clase para crear los TarjetObjet. Esta clase implementa el método build de la interfaz IBuilder. Todos los métodos, se retornarán a sí mismos. La clase ObjectBuilder es una clase interna de TargetObject. La ventaja de que sea interna, es que, aunque los atributos sean privados se tiene acceso a ellos de forma directa.  

        - TarjetObjet: Es el objeto que se crea gracias a la clase ObjectBuilder. Puede ser simple o compleja. 

        - OtherObjets: Son los posibles objetos que pueden crearse cuando el ObjectBuilder construye el TarjetObjet.


3. DIAGRAMA DE SECUENCIA DEL PATRÓN BUILDER
    - A continuación se muestra el diagrama de secuencia del patrón Builder. Ver Fig. 2.  

    ![PATRON-BUILDER-SECUENCIA](https://github.com/SharmelynVioleta/Patron_Builder/blob/master/imagenes/patron_builder_secuencia.JPG)
    Fig. 2.  Diagrama de secuencia del patrón de diseño Builder [1]. 
   
   - El cliente crea una nueva instancia del ObjectBuilder.
   - El cliente ejecuta el paso 1 de la creación en el ObjectBuilder.
        o ObjectBuilder crea al TargetObject.
   - El cliente ejecuta el paso 2 de la creación en el ObjectBuilder.
        o ObjectBuilder crea un OtherObjectA.
   - El cliente ejecuta el paso 3 de la creación en el ObjectBuilder.
        o ObjectBuilder crear el OtherObjectB.
   - El cliente solicita al ObjectBuilder la creación del TargetObject. Este retorna el TargetObject con los objetos creados.

    Podemos usar este patrón  cuando creemos objetos complejos, de esta manera evitamos codigo repetido. 

    Podemos mostrar al usuario un objeto simple en vez de mostrar la complejidad en la creación de objetos.
 
4.  ESCENARIO

    Se tomará como ejemplo a un Empleado. Como atributos puede tener: nombre, edad, género, telefono, direccion y contactos. Para ello crearemos un Builder, este nos permitirá crear la clase Empleado de mánera ágil y limpia.  La ventaja de crear un Builder, es que,  nos permite dejar de lado la lógica de programación, el orden de los atributos y la asociación entre objetos. En la Fig. 3, se muestra el flujo de ejecución entre el cliente y el empleado, sin hacer uso del patrón de diseño Builder. El cliente crea cada objeto en un determinado orden, no obstante, no vemos la relación entre objetos. Con ayuda del patrón Builder podemos dar solución a este problema.  

 
    <p align="center"> 
        <img src="https://github.com/SharmelynVioleta/Patron_Builder/blob/master/imagenes/patron_builder_escenario.JPG" />   
    
        <div> 
                Fig. 3. Flujo de ejecución sin utilizar el patrón de diseño Builder  [1].
        </div>
    </p>



    En la Fig. 4, se creó el objeto Builder, el cual está entre el cliente y el empleado. De tal manera que el Cliente, se comunica únicamente con el Builder, y este puede crear al Empleado. Es así que el cliente, desconoce la estructura del Empleado, el orden y la relación entre ellos.  

    ![PATRON-BUILDER-ESCENARIO2](https://github.com/SharmelynVioleta/Patron_Builder/blob/master/imagenes/patron_builder_escenario2.JPG)
    
    
    Fig. 4. Flujo de ejecución utilizando el patrón de diseño Builder  [1].

5. IMPLEMENTACIÓN
    Realizaremos la implementación del Patrón de diseño Builder en el lenguaje de Programación Java. Se creó tres paquetes, tal como se muestra en la Fig. 5, en el paquete builderOBjetos se encuentran los objetos creados por el Builder, en el paquete builderPrincipal se encuentra laclase principal y la interfaz. Ambos paquetes implementan el ejercicio complejo. El paquete ejemploSencillo, implementa dos clases que nos explicarán de manera muy sencilla el uso del patrón de diseño Builder.
    <p align="center"> 
    <img src="https://github.com/SharmelynVioleta/Patron_Builder/blob/master/imagenes/0patron_builder_implementacion.JPG" />   
    


    <div> 
            Fig. 5. Creación de paquetes en Java [1].
    </div>
    </p>

    Para explicar el ejemplo sencillo, se realizó un diagrama de clases. Ver Fig. 6. Se observan dos clases: la clase Usuario y la clase UsuarioBuilder. La Clase Usuario almacena los atributos privados y los getters de los atributos.   La Clase UsuarioBuilder


    ![PATRON-BUILDER-1](https://github.com/SharmelynVioleta/Patron_Builder/blob/master/imagenes/0patron_builder_ejercicio1.JPG)
    Fig. 6. Creación de la Clase Usuario [1].


    ![PATRON-BUILDER-1](https://github.com/SharmelynVioleta/Patron_Builder/blob/master/imagenes/2patron_builder_ejercicio1.JPG)
    Fig. 7. Creación de los getters de los atributos de la clase Usuario [1].

    ![PATRON-BUILDER-IMPLEMENTACION](https://github.com/SharmelynVioleta/Patron_Builder/blob/master/imagenes/patron_builder_implementacion.JPG)
    - Fig. 5. Diagrama de clases del proyecto Builder [1].

6. EJECUCIÓN
    ![PATRON-BUILDER-EJECUCION](https://github.com/SharmelynVioleta/Patron_Builder/blob/master/imagenes/patron_builder_ejecucion.jpg)

    - Fig. 5. Resultado de la ejecución de la clase BuilderMain [1].

    
7. EJERCICIO RESUELTO

...



8. FRAMEWORK

- referencia donde el patrón se da 
- Entorno de programacion realista 

9. CONCLUSIONES
    ventajas 
 

## REFERENCIAS
- [1]  Oscar J Blancarte Iturralde. Introducción a los patrones de diseño_ Un enfoque práctico (Spanish Edition. CreateSpace Independent Publishing Platform (2016)
- [2] Builder  patrón de diseño. (28 de agosto de 2021). En Wikipedia.  (https://es.wikipedia.org/w/index.php?title=Builder_(patr%C3%B3n_de_dise%C3%B1o)&oldid=137958744).
 

- [3] Builder  patrón de diseño. En refactoring.guru (https://refactoring.guru/es/design-patterns/builder).
 