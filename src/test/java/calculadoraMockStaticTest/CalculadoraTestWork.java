package calculadoraMockStaticTest;

import calculadoraMockStatic.CalcServiceStatic;
import calculadoraMockStatic.CalculadoraStatic;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

public class CalculadoraTestWork {



    @ParameterizedTest
    @CsvSource(
            {
                    "3,6",
                    "4,24",
                    "0,1"
            }
    )
    public void verifyFactorial(int num,int expected){

        CalculadoraStatic calculadoraStatic= new CalculadoraStatic();
        int actualResult=calculadoraStatic.getFactorial(num);
        int expectedResult=expected;

        Assertions.assertEquals(actualResult,expectedResult,"ERROR el factorial no está funcionando para el valor: "+3);



    }

    @BeforeAll
    public static void setup(){
        // PASO 1 crear el objeto mockeado de la clase donde se encuentra el método a mockear
        MockedStatic<CalcServiceStatic> overrideCalcServiceStaticMock = Mockito.mockStatic(CalcServiceStatic.class);

        // PASO 2 adicionar comportamiento del metodo que se esta mockeando
        overrideCalcServiceStaticMock.when(()->CalcServiceStatic.mult(1,1)).thenReturn(1);
        overrideCalcServiceStaticMock.when(()->CalcServiceStatic.mult(1,2)).thenReturn(2);
        overrideCalcServiceStaticMock.when(()->CalcServiceStatic.mult(2,3)).thenReturn(6);
        overrideCalcServiceStaticMock.when(()->CalcServiceStatic.mult(6,4)).thenReturn(24);
    }
}
