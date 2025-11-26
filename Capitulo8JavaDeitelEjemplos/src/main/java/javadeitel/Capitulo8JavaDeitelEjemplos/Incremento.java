package javadeitel.Capitulo8JavaDeitelEjemplos;

 // Fig. 8.15: Incremento.java
 // variable de instancia final en una clase.

 public class Incremento
 {
 private int total = 0; // el total de todos los incrementos
 private final int INCREMENTO; // variable constante (sin inicializar)

 // el constructor inicializa la variable de instancia final INCREMENTO
 public Incremento( int valorIncremento )
 {
 INCREMENTO = valorIncremento; // inicializa la variable constante (una vez)
 } // fin del constructor de Incremento

 // suma INCREMENTO al total
 public void sumarIncrementoATotal()
 {
 total += INCREMENTO;
 } // fin del método sumarIncrementoATotal

 // devuelve representación String de los datos de un objeto Incremento
  public String toString()
  {
  return String.format( "total = %d", total );
  } // fin del método toString
  } // fin de la clase Incremento