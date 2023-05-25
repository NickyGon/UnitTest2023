package calculadoraTest3;

import calculadoraMocks.Calculadora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {


    /*
    * ERROR problema a solucionar con mocks
     */


    @Test
    public void verifyFactorial(){
        Calculadora calculadora= new Calculadora();
        int actualResult=calculadora.getFactorial(3);
        int expectedResult=6;
        Assertions.assertEquals(expectedResult,actualResult,"ERROR! EL factorial no esta funcionando");
    }
}
