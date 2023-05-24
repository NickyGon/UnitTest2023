package inversorTest;

import invertor.Invertir;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class InversorTest {

    Invertir invertir= new Invertir();


    @ParameterizedTest
    @CsvSource(
            {
                    "-756,-657",
                    "-755,-557",
                    "-754,-457",
                    "-501,-105",
                    "-500,-005",
                    "-499,-994",
                    "-101,-101",
                    "-100,-001",
                    "-99,-99",
                    "-98,-89",
                    "-11,-11",
                    "-10,-01",
                    "-9,-9",
                    "-1,-1",
                    "0,0",
                    "1,1",
                    "9,9",
                    "10,01",
                    "11,11",
                    "98,89",
                    "99,99",
                    "100,001",
                    "101,101",
                    "499,994",
                    "500,005",
                    "501,105",
                    "754,457",
                    "755,557",
                    "756,657",
                    "1000,0001"
            }
    )
    public void verifyInversor(int number, int expectedResult){
        String actualResult=invertir.invertir(number);
        Assertions.assertEquals(Integer.parseInt(actualResult),expectedResult,"Error, los resultados no son lo mismo");
    }
}
