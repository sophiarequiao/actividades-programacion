import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        saludar();

        saludarNombre("Sophia");
        saludarNombre("Jose");

        sumar(2,5);

        celsiusAFahrenheit(31.0);
    }

    public static void saludar(){
        System.out.println("Hola mundo");
    }

    public static void saludarNombre(String nombre){
        System.out.println("Hola " + nombre);
    }

    public static int sumar(int a, int b){
        return a + b;
    }

    public static double celsiusAFahrenheit(double temperatura){
        return temperatura * 1.8 + 32;
    }

    public static double areaCirculo(double radio){
        return radio * Math.pow(Math.PI, 2);
    }

    public static double media(double a, double b, double c){
        return (a + b + c)/3;
    }

    public static String concatenar(String a, String b, String c){
        return a + b + c;
    }

    public static String nombreCompleto(String nombre, String primerApellido, String ultimoApellido){
        return nombre + " " + primerApellido + " " + ultimoApellido;
    }

    public  static int edadActual(int anyoNacimiento){
        return 2026 - anyoNacimiento;
    }

    public  static void presentacion(String nombre, String primerApellido, String ultimoApellido, int anyoNacimiento){
        System.out.println("Hola, soy " + nombre + " " + primerApellido + " " + ultimoApellido +
                " y tengo " + (2026 - anyoNacimiento) + " años");
    }

    public  static int  binarioADecimal(String binario){
        return Integer.parseInt(binario, 2);
    }

    public  static int  octalADecimal(String octal){
        return Integer.parseInt(octal, 8);
    }

    public  static int hexadecimalADecimal(String hexadecimal){
        return Integer.parseInt(hexadecimal, 16);
    }

    public static void decimalABinOctHex(int  decimal){
        String binario = Integer.toBinaryString(decimal);
        String octal = Integer.toOctalString(decimal);
        String hexadecimal = Integer.toHexString(decimal);

        System.out.println("Decimal: " + decimal +
                "\n Binario: " + binario +
                "\n Octal: " + octal +
                "\n Hexadecimal:  " + hexadecimal);
    }



}