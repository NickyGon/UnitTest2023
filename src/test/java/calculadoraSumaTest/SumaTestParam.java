package calculadoraSumaTest;

import calculadora.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class SumaTestParam {

    Calculator calculator=new Calculator();
    @ParameterizedTest
    @CsvSource(
            {
                    "1,1,2",
                    "2,2,4",
                    "1,2,3",
                    "2,1,3",
                    "0,2,2",
                    "0,1,1",
                    "-2,-2,-4",
                    "-1,-1,-2",
                    "-1,-2,-3",
                    "-2,-1,-3",
                    "0,-2,-2",
                    "0,-1,-1",
                    "0,0,0",
                    "-2,2,0",
                    "-1,1,0",
                    "-1,2,1",
                    "-2,1,-1"
            }
    )
    public void verifySuma(int numberA, int numberB, int expectedResult){
        int actualResult= calculator.suma(numberA,numberB);
        Assertions.assertEquals(expectedResult,actualResult,"ERROR! La suma es incorrecta");
    }
}
