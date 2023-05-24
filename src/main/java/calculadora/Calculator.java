package calculadora;

public class Calculator {
    public Calculator(){}


    public int suma(int a, int b) {
        return a+b;
        //return a*b;
    }
    public int resta(int a, int b) {return a-b;}
    public int mult(int a, int b) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        return a*b;
    }
    public int div(int a, int b) throws Exception {
        if (b==0){
            throw new Exception("verifique el segundo valor, ya que la division entre 0 no esta permitida");
        }
        return a/b;
    }

    public static void main(String []args){
        ///////////////////
        // Mala práctica //
        ///////////////////

        /*Calculator calculator= new Calculator();
        int actual= calculator.suma(2,2);
        int expected= 4;

        if (actual==expected){
            System.out.println("Passed");
        } else{
            System.out.println("Failed");
        }*/


    }
}
