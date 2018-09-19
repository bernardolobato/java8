package br.com.bernardolobato;

import br.com.bernardolobato.lambda.Calculadora;

public class Main {

    public static void main(String[] args) {
        //somar
        Double result1 = Calculadora.calcular(30d, 70d, (a, b) -> a + b);
        System.out.println(result1); //100.0

        //subtrair
        Double result2 = Calculadora.calcular(30d, 70d, (a, b) -> a - b);
        System.out.println(result2); //100.0

        //multiplicar
        Double resul3 = Calculadora.calcular(30d, 70d, (a, b) -> a * b);
        System.out.println(resul3); //100.0

        //dividir
        Double result4 = Calculadora.calcular(30d, 70d, (a, b) -> a / b);
        System.out.println(result4); //100.0
    }
}
