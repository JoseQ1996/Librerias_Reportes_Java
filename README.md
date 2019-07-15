# PRÁCTICA DE LABORATORIO 

**NOMBRE:** José Quinde

**CARRERA:** Computación	

**ASIGNATURA:** Programación Aplicada

**NRO. PRÁCTICA:**	11	*

**TÍTULO PRÁCTICA:** Librerías Java

## OBJETIVO ALCANZADO:
El objetivo que se alcanzo fue el poder implementar librerías creadas por el usuario en otro proyecto.

Se aprendió a utilizar el JFreeChart para poder obtener graficas estadísticas.

Se implementó el iReport para poder exportar pdf de nuestra base de Datos.


##ACTIVIDADES DESARROLLADAS

**1.Crear un repositorio en GitHub**

**Perfil:** JoseQ1996

**URL del proyecto:** https://github.com/JoseQ1996/Librerias_Reportes_Java.git

-Se procedió a crear un repositorio con el nombre de Librerías Reportes Java
 
![image](https://user-images.githubusercontent.com/49071271/61191064-8aafcf80-a66b-11e9-83d6-8358a1bd1ce2.png)

**2. Sincronizar el repositorio creado con un proyecto en NetBeans. Realizar un commit y push por cada requerimiento de los puntos a continuación descritos (incluir un mensaje que identifique claramente los commits realizados a GitHub).**

-Se realizaron 10 commits en el proyecto

-Aquí se puede revisar los commits realizados y que hizo cada uno en específico.
 
![image](https://user-images.githubusercontent.com/49071271/61191069-900d1a00-a66b-11e9-9367-4c723e336ca6.png)

**3. Crear clase en el paquete**

- Se proceido a crear 3 paquetes uno para las imágenes,reportes y otro para la ventana principal.

![image](https://user-images.githubusercontent.com/49071271/61191087-b6cb5080-a66b-11e9-9e39-3904aee60d35.png) 
 
También se implementó las librerías que se muestran.

La librería anagrams.jar es una librería creada a partir de otro proyecto de conexión de base de Datos

**4. Interfaz Grafica**

El programa cuenta con una Ventana Principal en donde se controla el programa.

![image](https://user-images.githubusercontent.com/49071271/61191103-ed08d000-a66b-11e9-81b3-8b008885f8ab.png)


A continuación, se mostrará lo que realiza cada parte del programa

Como se puede observar el programa cuenta con 3 paneles que realizan diferentes graficas. 

El panel1 es el único que a través de un comboBox se puede interactuar.

Se mostrará la clase principal y las comparaciones y cálculos que se realizaron para después mandar al método de graficas cada parámetro obtenido.
 
![image](https://user-images.githubusercontent.com/49071271/61191107-f134ed80-a66b-11e9-95da-5eeb3906dd78.png)
![image](https://user-images.githubusercontent.com/49071271/61191109-f5610b00-a66b-11e9-9ac4-c0b6cc6cf44a.png)
![image](https://user-images.githubusercontent.com/49071271/61191110-f7c36500-a66b-11e9-8616-6de9c85120ab.png)
![image](https://user-images.githubusercontent.com/49071271/61191114-fc881900-a66b-11e9-8e59-585ed37fe308.png)
 
Ahora se procederá a mostrar cada método de gráfica y su resultado.

Las Gráficas de Pasteles son 3 que se grafican en el panel1 y se puede variar dependiendo la opción seleccionada en el comboBox.
 
![image](https://user-images.githubusercontent.com/49071271/61191127-1cb7d800-a66c-11e9-8c6c-bf2ecba2f0bb.png)
![image](https://user-images.githubusercontent.com/49071271/61191128-204b5f00-a66c-11e9-92d2-6d356689ed16.png)
![image](https://user-images.githubusercontent.com/49071271/61191131-25a8a980-a66c-11e9-9b04-6ade613b4861.png)
![image](https://user-images.githubusercontent.com/49071271/61191133-280b0380-a66c-11e9-969b-757320c01169.png)
![image](https://user-images.githubusercontent.com/49071271/61191135-2c372100-a66c-11e9-8771-6b24cd3c764f.png)
![image](https://user-images.githubusercontent.com/49071271/61191136-2fcaa800-a66c-11e9-9ba9-f732fee75755.png) 
 
La siguiente grafica se hizo a través de barras.
 
![image](https://user-images.githubusercontent.com/49071271/61191138-36591f80-a66c-11e9-8258-88153ba9c133.png)
![image](https://user-images.githubusercontent.com/49071271/61191142-3a853d00-a66c-11e9-9f4b-57e240f8b436.png) 

Y finalmente la gráfica final se hizo con líneas 
 
![image](https://user-images.githubusercontent.com/49071271/61191144-3f49f100-a66c-11e9-8687-db06b1e64825.png)
![image](https://user-images.githubusercontent.com/49071271/61191146-43760e80-a66c-11e9-8b86-5ea672009bc5.png)
 
El evento que está en el combo Box lo único que hace es mostrar la gráfica dependiendo la opción seleccionada, se obtiene el valor del comboBox y se lo compara dependiendo eso se obtiene la gráfica.

![image](https://user-images.githubusercontent.com/49071271/61191149-4a048600-a66c-11e9-8dc4-f42441443901.png)
 
El valor obtenido en el comboBox se lo manda al método seleccionar Grafico
 
![image](https://user-images.githubusercontent.com/49071271/61191161-66082780-a66c-11e9-8c4b-d29a9440b99a.png)

Para poder obtener los reportes de la base de datos, cabe recalcar que se ingresaron 100 registros de personas y hay dos personas que poseen registros de direcciones vinculadas a ellos.

El primer reporte genera una lista de todas las personas existentes en la base de Datos a través del siguiente método.

![image](https://user-images.githubusercontent.com/49071271/61191164-75877080-a66c-11e9-8de7-d424e1458eb5.png)

Lo único que se hace en el botón es mandar a llamar el método generarPDF

Para el reporte de Direcciones es un poco más complejo ya que se envían parámetros directo a la sentencia SQL para poder tener solo las direcciones de la persona seleccionada a través de la cedula.

![image](https://user-images.githubusercontent.com/49071271/61191167-78826100-a66c-11e9-913f-eab96f89f490.png)

El botón de generar direcciones nos manda un inputMessage para poder ingresar el valor de la cedula y dependiendo eso nos obtiene un reporte de las direcciones vinculadas a esa persona.

![image](https://user-images.githubusercontent.com/49071271/61191168-80420580-a66c-11e9-87ca-44a3f83372cd.png)

## RESULTADO(S) OBTENIDO(S):
Se mostrará la ventana principal en funcionamiento con los gráficos y los reportes generados.
 
![image](https://user-images.githubusercontent.com/49071271/61191169-846e2300-a66c-11e9-9935-bfa782f2a6d6.png)

Reporte de todas las personas.

![image](https://user-images.githubusercontent.com/49071271/61191170-8932d700-a66c-11e9-885a-32075fdf0d83.png)

Para la dirección se ingresa una cedula


![image](https://user-images.githubusercontent.com/49071271/61191183-b7b0b200-a66c-11e9-9b8a-d3c48c1476d1.png)

Y luego nos imprime el reporte de Direcciones.

![image](https://user-images.githubusercontent.com/49071271/61191184-c0a18380-a66c-11e9-85e6-3e70669fb5f2.png)

## CONCLUSIONES:
Se aprendió a desarrollar nuestras propias librerías a partir de un proyecto, también se aprendió a realizar graficas estadísticas de una base de datos.

También se puede decir que el realizar reportes es de mucha utilidad ya que así podemos obtener registros de tablas de una base de datos.

## RECOMENDACIONES:
Implementar librerías, base de datos, graficas de estadísticas y generación de reportes

**Nombre de estudiante:** José Quinde-Franklin Orellana


**Firma de estudiante:**

![image](https://user-images.githubusercontent.com/49071271/61191186-c4cda100-a66c-11e9-937a-3bcf39889a49.png)

