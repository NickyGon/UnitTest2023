package prestamoTestStatic;

import Ejercicio2Static.PrestamoStatic;
import Ejercicio2Static.ServiceHistorialCrediticioStatic;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

public class PrestamoTestStatic {
    @BeforeAll
    public static void setup(){
        MockedStatic<ServiceHistorialCrediticioStatic> overrideServiceHistorialCrediticioStatic = Mockito.mockStatic(ServiceHistorialCrediticioStatic.class);
        overrideServiceHistorialCrediticioStatic.when(()->ServiceHistorialCrediticioStatic.getCategoriaCI(454566)).thenReturn("A");
        overrideServiceHistorialCrediticioStatic.when(()->ServiceHistorialCrediticioStatic.getCategoriaCI(999999)).thenReturn("B");
        overrideServiceHistorialCrediticioStatic.when(()->ServiceHistorialCrediticioStatic.getCategoriaCI(77777)).thenReturn("C");
    }

    @ParameterizedTest
    @CsvSource(
            {
                    "454566,maximo a prestar 200000",
                    "999999,maximo a prestar 100000",
                    "77777,no se puede prestar ningun monto ALERTA!"
            }
    )
    public void verifyPrestamo(int ci, String expected) {
        PrestamoStatic prestamoStatic = new PrestamoStatic();
        String actual = prestamoStatic.getMaximoPrestamo(ci);
        Assertions.assertEquals(expected, actual, "ERROR el metodo  no esta funcionando");

    }

}
