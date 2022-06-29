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
       <tr><th colspan="2">INFORMACIÓN BÁSICA</th></tr>
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
-   El Patrón Builder
-   Estructura del patrón de diseño Builder.
-   Diagrama de secuencia del patrón Builder.
-   El Escenario.
-   La implementación.
-   La Ejecución.

## CONTENIDO DE LA GUÍA

### MARCO CONCEPTUAL

-   Patrón Builder
    -   Este patrón de diseño creacional nos permite construir objetos complejos paso a paso.
    - Separa la construcción de una fábrica compleja de su representación para que el mismo proceso de construcción pueda crear diferentes representaciones.

-   Estructura del patrón de diseño Builder
    ![alt text](https://github.com/SharmelynVioleta/Patron_Builder/blob/master/imagenes/patron_builder_estructura.JPG)
    - Fig. 1. Estructura del patrón de diseño Builder.

-   Diagrama de secuencia del patrón Builder.
    ![PATRON-BUILDER-SECUENCIA](imagenes/patron_builder_secuencia.jpg)
    - Fig. 2.  Diagrama de secuencia del patrón de diseño Builder.

-   El Escenario
    ![PATRON-BUILDER-ESCENARIO](imagenes/patron_builder_escenario.jpg)
    - Fig. 3. Flujo de ejecución sin utilizar el patrón de diseño Builder.


    ![PATRON-BUILDER-ESCENARIO](imagenes/patron_builder_escenario2.jpg)
    - Fig. 4. Flujo de ejecución utilizando el patrón de diseño Builder.

-   La implementación
    ![PATRON-BUILDER-IMPLEMENTACION](imagenes/patron_builder_implementacion.jpg)
    - Fig. 5. Diagrama de clases del proyecto Builder.

-   La Ejecución
    ![PATRON-BUILDER-EJECUCION](imagenes/patron_builder_ejecucion.jpg)

    - Fig. 5. Resultado de la ejecución de la clase BuilderMain

    
## EJERCICIO RESUELTO

...



## FRAMEWORK

- referencia donde el patrón se da 
- Entorno de programacion realista 


## EJERCICIOS PROPUESTOS

-   Se han creado estructuras complejas con objetos más pequeños.
    -   Agregue un nuevo atributo a la clase AbstractProduct para definir la tasa de impuesto que tendrá el producto, el impuesto deberá ser calculado y mostrado a nivel de paquete.
    -   Agregues otro atributo a la clase AbstractProduct para definir la cantidad, esta cantidad deberá ser calculada a la hora de mostrar el precio del paquete.
    -   Agregue productos para crear un paquete, podríamos agregar un producto de descuento con precio negativo.
-   Elabore los ejemplos y analice los resultados.


## REFERENCIAS
-   Oscar J Blancarte Iturralde. Introducción a los patrones de diseño_ Un enfoque práctico (Spanish Edition. CreateSpace Independent Publishing Platform (2016)

#

[license]: https://img.shields.io/github/license/rescobedoulasalle/git_github?label=rescobedoulasalle
[license-file]: https://github.com/rescobedoulasalle/git_github/blob/main/LICENSE

[downloads]: https://img.shields.io/github/downloads/rescobedoulasalle/git_github/total?label=Downloads
[releases]: https://github.com/rescobedoulasalle/git_github/releases/

[last-commit]: https://img.shields.io/github/last-commit/rescobedoulasalle/git_github?label=Last%20Commit

[Debian]: https:/
/img.shields.io/badge/Debian-D70A53?style=for-the-badge&logo=debian&logoColor=white
[debian-site]: https://www.debian.org/index.es.html

[Git]: https://img.shields.io/badge/git-%23F05033.svg?style=for-the-badge&logo=git&logoColor=white
[git-site]: https://git-scm.com/

[GitHub]: https://img.shields.io/badge/github-%23121011.svg?style=for-the-badge&logo=github&logoColor=white
[github-site]: https://github.com/

[Vim]: https://img.shields.io/badge/VIM-%2311AB00.svg?style=for-the-badge&logo=vim&logoColor=white
[vim-site]: https://www.vim.org/

[Java]: https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white
[java-site]: https://docs.oracle.com/javase/tutorial/


[![Debian][Debian]][debian-site]
[![Git][Git]][git-site]
[![GitHub][GitHub]][github-site]
[![Vim][Vim]][vim-site]
[![Java][Java]][java-site]

[![License][license]][license-file]
[![Downloads][downloads]][releases]
[![Last Commit][last-commit]][releases]

https://es.wikipedia.org/wiki/Builder_(patr%C3%B3n_de_dise%C3%B1o)