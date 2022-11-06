package Hausaufgaben;

public class blizhek10 {
    public static void main(String[] args){
        double valueOne=6.35;
        double valueTwo=13.85;
        int intValue=10;
        double resultOne=Math.abs(intValue-valueOne);
        double resultTwo=Math.abs(intValue-valueTwo);
        if (resultOne==resultTwo){
            System.out.println("Числа "+valueOne +" и "+valueTwo + " равноудалены от "+intValue);
        }
        if(resultOne>resultTwo){
            System.out.println("Число "+valueTwo+" ближе к "+intValue);
        }
        if (resultOne<resultTwo) {
            System.out.println("Число "+valueOne+" ближе к "+intValue);
        }
    }

}

