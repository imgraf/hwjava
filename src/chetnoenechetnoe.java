package Hausaufgaben;

public class chetnoenechetnoe {
    public static void main(String[] args){

        int value=6;
        boolean status = evenNumber(value);
        //boolean status = evenNumberSwitchCase(status);
        if (status == true) {
            System.out.println("Число "+value+" - четное");
        }else {
            System.out.println("Число "+value+" - нечетное");
        }

    }
    public static boolean evenNumber(int value) {
        boolean status;
        if(value%2==0){
            status = true;
        }
        else {
            status = false;
        }
        return status;
    }

    public static boolean evenNumberSwitchCase(int value) {
        boolean status = false;
        switch (value%2) {
            case 0:
                status = true;
                break;
            case 1:
                status = false;
                break;
        }
        return status;
    }
}

