package calculadoraMock;

import calculadoraMocks.CalcService;
import calculadoraMocks.Calculadora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.Mockito;

public class CalculadoraTestMockWork {

    /*
     * PASO 2
     * instaciar el objeto falso que se desea mockear
     *
     * */

    CalcService serviceMock = Mockito.mock(CalcService.class);

    @BeforeEach
    public void setup(){
        Mockito.when(serviceMock.multi(1, 1)).thenReturn(1);
        Mockito.when(serviceMock.multi(1, 2)).thenReturn(2);
        Mockito.when(serviceMock.multi(2, 3)).thenReturn(6);
        Mockito.when(serviceMock.multi(6, 4)).thenReturn(24);
        Mockito.when(serviceMock.multi(24, 5)).thenReturn(120);
    }




    @ParameterizedTest
    @CsvSource(
            {
                    "3,6",
                    "4,24",
                    "0,1"
            }
    )
    public void verifyFactorial(int num, int expected) {

        Calculadora calculadora = new Calculadora();
        calculadora.setService(serviceMock);

        int actual = calculadora.getFactorial(num);
        Assertions.assertEquals(expected, actual, "ERROR el metodo factorial no esta funcionando");



    }
}
