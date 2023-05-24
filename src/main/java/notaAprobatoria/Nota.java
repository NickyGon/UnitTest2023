package notaAprobatoria;

public class Nota {
    public Nota(){}

    public String getMessage(int nota){
        String msg;
        if (nota >= 0 && nota <= 70)
            msg = "Esfuerzate mas tu nota es: " + nota;
        else if (nota >= 71 && nota <= 80)
            msg="Bien tu nota es: "+nota;
        else if  (nota >= 81 && nota <= 90)
            msg="Muy bien tu nota es: "+nota;
        else if (nota >= 91 && nota <= 100)
            msg="Excelente tu nota es: "+nota;
        else
            msg="La nota no es correcta ingrese nuevamente el valor";
        return msg;
    }
}
