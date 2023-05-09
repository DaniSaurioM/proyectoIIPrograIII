# **Proyecto II by Gustavo Monzon**

## **Descripccion del proyecto:**


El proyecto consiste en una matriz que almacena información sobre vehículos, donde cada celda de la matriz representa un vehículo. Cada vehículo tiene información como su placa, color, línea, modelo y propietario.

Para implementar esta matriz, hemos utilizado una estructura de datos conocida como matriz dispersa o matriz esparcida, que permite almacenar grandes cantidades de información con un alto grado de eficiencia. La matriz dispersa se diferencia de una matriz regular en que solo almacena celdas que contienen información, lo que significa que muchas celdas pueden estar vacías.


## **Manual de Usuario**

Bienvenido al sistema de gestión de vehículos implementado mediante una matriz dispersa. Este manual tiene como objetivo proporcionar una guía para que el usuario pueda utilizar todas las funcionalidades del sistema de manera correcta

### Introducción
El sistema de gestión de vehículos tiene como objetivo permitir al usuario insertar, buscar, eliminar e imprimir información sobre vehículos en una matriz dispersa.

requiere un ordenador con un sistema operativo Windows o Linux. Además, es necesario tener instalado Java en el ordenador.


### Menú de opciones
El menú de opciones del sistema de gestión de vehículos consta de las siguientes opciones:

**Insertar:** Permite al usuario insertar un nuevo vehículo en la matriz dispersa. El usuario deberá ingresar la fila, columna, placa, color, línea, modelo y propietario del vehículo.

**Buscar:** Permite al usuario buscar un vehículo en la matriz dispersa. El usuario deberá ingresar la fila y columna donde se encuentra el vehículo que desea buscar.

**Eliminar:** Permite al usuario eliminar un vehículo de la matriz dispersa. El usuario deberá ingresar la fila y columna donde se encuentra el vehículo que desea eliminar.

**Imprimir:** Permite al usuario imprimir todos los vehículos que se encuentran en la matriz dispersa.


### Uso del sistema
A continuación, se describen los pasos a seguir para utilizar cada una de las opciones del sistema.

**Insertar un nuevo vehículo**
Para insertar un nuevo vehículo en la matriz dispersa, el usuario deberá seleccionar la opción "Insertar" del menú principal. A continuación, se le pedirá que ingrese la fila, columna, placa, color, línea, modelo y propietario del vehículo. El sistema validará los datos ingresados y, si son correctos, insertará el vehículo en la matriz dispersa.

(![Insertar nodo](https://user-images.githubusercontent.com/109646287/236976446-08843cc7-272d-49cc-b99b-c54321bc5d32.png)

### **Buscar un vehículo**
Para buscar un vehículo en la matriz dispersa, el usuario deberá seleccionar la opción "Buscar" del menú principal. A continuación, se le pedirá que ingrese la fila y columna donde se encuentra el vehículo que desea buscar. El sistema buscará el vehículo en la matriz dispersa y mostrará la información correspondiente en la consola.

![image](https://user-images.githubusercontent.com/109646287/236976737-806f6cea-d50f-477a-83fc-d3813172badc.png)![image](https://user-images.githubusercontent.com/109646287/236976758-f3ed7f34-590b-4a08-ba85-7b590bfca587.png)

### **Imprimir los vehículos**
Para imprimir todos los vehículos que se encuentran en la matriz dispersa, el usuario deberá seleccionar la opcion "Imprimir Matriz". A continuacion, se hara impresion de la matriz en la consola.

![image](https://user-images.githubusercontent.com/109646287/236977034-b8cf63e7-86cf-4d4e-a665-9ff8173be3b5.png)

### **Eliminar un vehículo**
Para eliminar un vehículo de la matriz dispersa, el usuario deberá seleccionar la opción "Eliminar" del menú principal. A continuación, se le pedirá que ingrese la fila y columna donde se encuentra el vehículo que desea eliminar. El sistema buscará el vehículo en la matriz dispersa y lo eliminará si lo encuentra.

![image](https://user-images.githubusercontent.com/109646287/236977195-3b10ec2d-5493-42fb-8cd0-e2ecc7ee02c3.png)

## **Manual Técnico**

### **Estructura de clases:**
El proyecto consta de dos clases principales: Matriz y NodoMatriz. La clase Matriz se encarga de manejar la estructura de la matriz y los métodos para insertar, buscar, eliminar e imprimir nodos. La clase NodoMatriz define la estructura de cada nodo en la matriz.

### **Estructura de la matriz:**
La matriz se implementa utilizando una estructura de nodos doblemente enlazados. Cada nodo contiene información sobre la fila y columna en la que se encuentra, así como los datos del vehículo (placa, color, línea, modelo y propietario).

### **Insertar nodo:**
Para insertar un nodo en la matriz, se busca la posición en la que se desea insertar (fila y columna). Si ya existe un nodo en esa posición, se actualizan los datos del vehículo. Si no existe un nodo, se crea uno nuevo y se enlaza con los nodos adyacentes.

### **Buscar nodo:**
Para buscar un nodo en la matriz, se ingresa la fila y columna correspondiente al nodo que se desea buscar. El sistema recorre la matriz hasta encontrar el nodo y muestra los datos del vehículo correspondientes. Si el nodo no existe, se informa al usuario.

Eliminar nodo:
Para eliminar un nodo en la matriz, se busca la posición en la que se encuentra el nodo que se desea eliminar (fila y columna). Si el nodo existe, se eliminan las referencias a los nodos adyacentes y se destruye el objeto. Si el nodo no existe, se informa al usuario.

### **Imprimir matriz:**
Para imprimir la matriz, se recorre la estructura de nodos y se muestran los datos del vehículo correspondientes a cada nodo. La matriz se imprime ordenada por fila y columna.





