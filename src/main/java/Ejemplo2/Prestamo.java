package Ejemplo2;

import java.util.HashMap;
import java.util.Map;

public class Prestamo {
    ServiceHistorialCrediticio serviceHistorialCrediticio;
    public Prestamo(){
        serviceHistorialCrediticio = new ServiceHistorialCrediticio();
    }
    public Prestamo(ServiceHistorialCrediticio serviceHistorialCrediticio){
        this.serviceHistorialCrediticio=serviceHistorialCrediticio;
    }

    public String getMaximoPrestamo(int ci){
        Map<String,String> maximo= new HashMap<>();
        maximo.put("A","maximo a prestar 200000");
        maximo.put("B","maximo a prestar 100000");
        maximo.put("C","no se puede prestar ningun monto ALERTA!");
        String category= this.serviceHistorialCrediticio.getCategoriaCI(ci);
        return maximo.get(category);
    }
}
