package br.com.bernardolobato.lambda;

import br.com.bernardolobato.functionalInterfaces.OperatorDouble;

public class Calculadora {

    private int test;

    public int getTest() {
        return test;
    }

    public void setTest(int test) {
        this.test = test;
    }

    public static Double calcular(Double op1, Double op2, OperatorDouble operador) {
        return operador.apply(op1, op2);
    }


}
