package javadeitel.Capitulo8JavaDeitelEjemplos;

 // Fig. 8.16: PruebaIncremento.java
 // variable final inicializada con el argumento de un constructor.

 public class TestIncremento
 {
 public static void main( String args[] )
 {
 Incremento valor = new Incremento( 5 );

 System.out.printf( "Antes de incrementar: %s\n\n", valor );

 for ( int i = 1; i <= 3; i++ )
 {
 valor.sumarIncrementoATotal();
 System.out.printf( "Después de incrementar %d: %s\n", i, valor );
 } // fin de for
 } // fin de main
 } // fin de la clase PruebaIncremento