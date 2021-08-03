/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchcaseoperaciones;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author Oswald
 */
public class SwitchCaseOperaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Numeros nums = new Numeros();

        nums.setNumeroUno(leerEntero("Ingrese el primer numero"));
        nums.setNumeroDos(leerEntero("Ingrese el segundo numero"));

        System.out.println("Debe escoger uno de los siguientes numeros para realizar operaciones");
        System.out.println("1: sumar");
        System.out.println("2: restar");
        System.out.println("3: multiplicar");
        System.out.println("4: dividir");

        int operaciones = leerEntero("Ingrese el numero correspondiente para realizar la operacion (sumar, restar, multiplicar o dividir)");

        switch (operaciones) {
            case 1:
                int resultado = 0;
                resultado = nums.getNumeroUno() + nums.getNumeroDos();
                System.out.println("El resultado de la suma es: " + resultado);
                break;
            case 2:
                resultado = nums.getNumeroUno() - nums.getNumeroDos();
                System.out.println("El resultado de la resta es: " + resultado);
                break;
            case 3:
                resultado = nums.getNumeroUno() * nums.getNumeroDos();
                System.out.println("El resultado de la multiplicacion es: " + resultado);
            case 4:
                resultado = nums.getNumeroUno() / nums.getNumeroDos();
                System.out.println("El resultado de la division es: " + resultado);
            default:
                System.out.println("Tipo de operacion no esta dentro de las opciones.");
                break;
        }

    }

    private static String leerAlfanumerico(String msj) {
        Scanner entrada = new Scanner(System.in);
        System.out.println(msj);
        String ingreso = entrada.nextLine();
        return ingreso;
    }

    private static int leerEntero(String msj) {
        Scanner entrada = new Scanner(System.in);
        System.out.println(msj);
        int ingreso = entrada.nextInt();
        return ingreso;
    }

    private static double leerDecimal(String msj) {
        Scanner entrada = new Scanner(System.in);
        System.out.println(msj);
        double ingreso = entrada.nextDouble();
        return ingreso;
    }

}
