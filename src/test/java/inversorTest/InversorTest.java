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

                    "-1000,-0001",
                    "-757,-757",
                    "-756,-657",
                    "-755,-557",
                    "-754,-457",
                    "-501,-105",
                    "-500,-005",
                    "-499,-994",
                    "-151,-151",
                    "-150,-051",
                    "-149,-941",
                    "-101,-101",
                    "-100,-001",
                    "-99,-99",
                    "-98,-89",
                    "-51,-15",
                    "-50,-05",
                    "-49,-94",
                    "-11,-11",
                    "-10,-01",
                    "-9,-9",
                    "-1,-1",
                    "0,0",
                    "1,1",
                    "9,9",
                    "10,01",
                    "11,11",
                    "49,94",
                    "50,05",
                    "51,15",
                    "98,89",
                    "99,99",
                    "100,001",
                    "101,101",
                    "149,941",
                    "150,051",
                    "151,151",
                    "499,994",
                    "500,005",
                    "501,105",
                    "754,457",
                    "755,557",
                    "756,657",
                    "757,757",
                    "1000,0001"
            }
    )
    public void verifyInversor(int number, int expectedResult){
        String actualResult=invertir.invertir(number);
        Assertions.assertEquals(Integer.parseInt(actualResult),expectedResult,"Error, los resultados no son lo mismo");
    }
}
