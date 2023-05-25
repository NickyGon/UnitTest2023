package Ejercicio2Static;

import Ejemplo2.ServiceHistorialCrediticio;

import java.util.HashMap;
import java.util.Map;

public class PrestamoStatic {
    public PrestamoStatic(){}

    public String getMaximoPrestamo(int ci){
        Map<String,String> maximo= new HashMap<>();
        maximo.put("A","maximo a prestar 200000");
        maximo.put("B","maximo a prestar 100000");
        maximo.put("C","no se puede prestar ningun monto ALERTA!");
        String category= ServiceHistorialCrediticioStatic.getCategoriaCI(ci);
        return maximo.get(category);
    }
}
