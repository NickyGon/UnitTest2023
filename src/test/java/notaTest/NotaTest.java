package notaTest;

import notaAprobatoria.Nota;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class NotaTest {
    Nota nota=new Nota();

    @ParameterizedTest
    @CsvSource(
            {
                    "-1, La nota no es correcta ingrese nuevamente el valor",
                    "0, Esfuerzate mas tu nota es: 0",
                    "1, Esfuerzate mas tu nota es: 1",
                    "29, Esfuerzate mas tu nota es: 29",
                    "30, Esfuerzate mas tu nota es: 30",
                    "31, Esfuerzate mas tu nota es: 31",
                    "69, Esfuerzate mas tu nota es: 69",
                    "70, Esfuerzate mas tu nota es: 70",
                    "71, Bien tu nota es: 71",
                    "72, Bien tu nota es: 72",
                    "74, Bien tu nota es: 74",
                    "75, Bien tu nota es: 75",
                    "76, Bien tu nota es: 76",
                    "79, Bien tu nota es: 79",
                    "80, Bien tu nota es: 80",
                    "81, Muy bien tu nota es: 81",
                    "84, Muy bien tu nota es: 84",
                    "85, Muy bien tu nota es: 85",
                    "86, Muy bien tu nota es: 86",
                    "89, Muy bien tu nota es: 89",
                    "90, Muy bien tu nota es: 90",
                    "91, Excelente tu nota es: 91",
                    "95, Excelente tu nota es: 95",
                    "96, Excelente tu nota es: 96",
                    "97, Excelente tu nota es: 97",
                    "99, Excelente tu nota es: 99",
                    "100, Excelente tu nota es: 100",
                    "101, La nota no es correcta ingrese nuevamente el valor"
            }
    )
    public void verifyNota(int numberA, String expectedResult){
        String actualResult=nota.getMessage(numberA);
        Assertions.assertEquals(actualResult,expectedResult,"Error, no es la misma mensajería");

    }
}
