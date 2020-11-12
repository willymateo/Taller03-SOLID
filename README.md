# Taller03-SOLID
Taller sobre el uso de los Principios de Diseño Aplicados al Desarrollo.
¿Como se violan los principios SOLID?<br>
1. Las clases Helado y Pastel se comportaban de manera distinta teniendo similitudes, cuando puede existir una clase Postre para que ambas puedan comportarse como su clase Padre. Esto viola el principio de sustitución de Liskov.<br>
2. En este literalse viola el principio Open/Closed, ya que si desea agregar aderezos a otro tipo de postre, se tendria que modificar el codigo de nuevo, es decir, crear metodos para ese nuevo tipo de postre.
3. En este literal se viola el SRP (Single Responsability Principle) ya que las clases Pastel y Helado no tienen la responsabilidad de calcular los precios, es por esto que se crea una clase ManejadorDePrecio que se encargue de estas responsabilidades y asi cumplir este principio.
4.Dependency Inversion Principle, al depender de abstracciones las clases aprovechan la interfaz de las abstracciones
