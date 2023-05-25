package calculadoraMocks;

public class Calculadora {
    private CalcService service;

    /*
    1er paso para hacer mocks
    instanciar desde afuera el service
    y definirlo en la clase
    *- constructor parametrizado(service)
    or
    *- metodo setService(service)
     */

    public Calculadora(){
        service=new CalcService();
    }

    //Desarrollador A

    public void setService(CalcService service){
        this.service=service;
    }
    public int getFactorial(int x){
        int fact=1;
        for (int i=1; i<=x; i++){
            fact=service.multi(fact,i);
        }
        return fact;
    }
}
