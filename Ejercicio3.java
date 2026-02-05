//Ejercicio 3 
public class A {

     private static int k = 0;

     private int i;

     public A(int j){

         i = j;

     }

     public void m1(int i) {

         A aux = new A(0);

         aux.m2(i);

         k = k+i+1;

     }

     public void m2(int i) {

         this.i += i;

         i = i*2;

         k = k+i;

     }

 }
//Se ejecutan las siguientes instrucciones 
/* A a = new A(2);

 a.m1(5);

 a.m1(1);

 a.m2(2);

 

Indique el valor que de la variable de clase "k".*/ 
//Yo puse que vale 9 
