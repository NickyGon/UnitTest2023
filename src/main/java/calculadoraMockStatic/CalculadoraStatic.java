package calculadoraMockStatic;

import calculadoraMocks.Calculadora;

public class CalculadoraStatic {
    public CalculadoraStatic(){}

    public int getFactorial(int x){
        int fact=1;
        for (int i=1; i<=x; i++){
            fact=CalcServiceStatic.mult(fact,i);
        }
        return fact;
    }
}
