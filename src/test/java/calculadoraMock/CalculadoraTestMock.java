package calculadoraMock;

import calculadoraMocks.CalcService;
import calculadoraMocks.Calculadora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class CalculadoraTestMock {

    /*
     * PASO 2
     * instaciar el objeto falso que se desea mockear
     *
     * */
    CalcService serviceMock = Mockito.mock(CalcService.class);

    @Test
    public void verifyFactorial() {
        /* PASO 3
         * determinar el comportamiento del metodo que deseamos
         * reemplazar
         * para este ejemplo es el : multi
         *  */

        Mockito.when(serviceMock.multi(1, 1)).thenReturn(1);
        Mockito.when(serviceMock.multi(1, 2)).thenReturn(2);
        Mockito.when(serviceMock.multi(2, 3)).thenReturn(6);
        Mockito.when(serviceMock.multi(6, 4)).thenReturn(24);
        Mockito.when(serviceMock.multi(24, 5)).thenReturn(120);
        /** PASO 4
         * Utilizar el obejto FALSO -> MOCK
         * necesitamos tener el PASO 1
         */

        Calculadora calculadora = new Calculadora();
        calculadora.setService(serviceMock);

        int expected = 24;
        int actual = calculadora.getFactorial(4);
        Assertions.assertEquals(expected, actual, "ERROR el metodo factorial no esta funcionando");

        /*
         * PASO 5
         * Verificar que estamos usando nuestro objeto Falso
         * */

        Mockito.verify(serviceMock).multi(1, 1);
        Mockito.verify(serviceMock).multi(1, 2);
        Mockito.verify(serviceMock).multi(2, 3);
        Mockito.verify(serviceMock).multi(6, 4);
        // Mockito.verify(serviceMock).multi(24,5);

    }
}
