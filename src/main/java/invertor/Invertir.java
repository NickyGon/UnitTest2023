package invertor;

public class Invertir {
    public String invertir(int number){
        String inp=Integer.toString(number);
        String invert="";
        String num="";
        if (!Character.isDigit(inp.charAt(0))){
            invert+=inp.charAt(0);
            num=inp.substring(1);
        } else {
            num=inp;
        }
        for (int i = num.length() - 1; i >= 0; i--){
            invert+=num.charAt(i);
        }
        System.out.println(invert);
        return invert;
    }
}
