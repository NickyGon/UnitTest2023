package prestamotest;

import Ejemplo2.Prestamo;
import Ejemplo2.ServiceHistorialCrediticio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.Mockito;

public class PrestamoTesting {
    ServiceHistorialCrediticio serviceMock = Mockito.mock(ServiceHistorialCrediticio.class);


    @BeforeEach
    public void setup(){
        Mockito.when(serviceMock.getCategoriaCI(454566)).thenReturn("A");
        Mockito.when(serviceMock.getCategoriaCI(999999)).thenReturn("B");
        Mockito.when(serviceMock.getCategoriaCI(77777)).thenReturn("C");
    }

    @ParameterizedTest
    @CsvSource(
            {
                    "454566,maximo a prestar 200000",
                    "999999,maximo a prestar 100000",
                    "77777,no se puede prestar ningun monto ALERTA!"
            }
    )
    public void verifyFactorial(int num, String expected) {

        Prestamo prestamo= new Prestamo(serviceMock);

        String actual = prestamo.getMaximoPrestamo(num);
        Assertions.assertEquals(expected, actual, "ERROR el metodo  no esta funcionando");

    }

}
