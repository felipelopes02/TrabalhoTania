/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fibonacci;

/**
 *
 * @author felipelop
 */
public class Fibonacci {

         public static int calculoRec(int n) {
        if (n <= 1) {
            return n;
        } else
            return calculoRec(n - 1) + calculoRec(n - 2);
    }

    public static int calculoIter(int n) {
        int segundoNum = 1;
        int primeiroNum = 1;


        if (n <= 1) {
            return n;
        }

        for (int i = 2; i < n; i++) {
            int tempNum = segundoNum;
            segundoNum += primeiroNum;
            primeiroNum = tempNum;
        }
        return segundoNum;

    }

    public static void main(String[] args) {

        long TempoINI = System.nanoTime();
        long TempoFIN = System.nanoTime();
        double total = 0;

        System.out.println("Recursivo : ");

        for(int i = 0; i < 45; i++) {
            TempoINI = System.nanoTime();

            int result = Fibonacci.calculoRec(i);
            TempoFIN = System.nanoTime();
 
            total = total + (TempoFIN - TempoINI);
            System.out.println(result + " durou " + (TempoFIN - TempoINI )  + " nanosegundos");


        }
        System.out.println("******************************************");
        System.out.println( "O tempo total foi : " +  total  * 1000000000 + " segundos");
        System.out.println("******************************************");

        System.out.println();
        System.out.println("iterativo: ");

        double total1 = 0;

        for(int i = 0; i < 45; i++) {
            TempoINI = System.nanoTime();
            int result = Fibonacci.calculoIter(i);
            TempoFIN = System.nanoTime(); 
            total1 = total1 + (TempoFIN - TempoINI);
            System.out.println(result + " durou " + (TempoFIN - TempoINI) + " nanosegundos");

        }
        System.out.println("******************************************");
        System.out.println("O tempo total foi : " + total1 * 1000000000 + " segundos");
        System.out.println("******************************************");
    }

}
    
    

