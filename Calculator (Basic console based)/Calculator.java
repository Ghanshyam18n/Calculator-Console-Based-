package Assingment;
import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        String yn;
        do {
            Scanner sc = new Scanner(System.in);
            int num1, num2;
            System.out.println("Enter First Number");
            num1 = sc.nextInt();
            System.out.println("Enter Second Number");
            num2 = sc.nextInt();
            System.out.println("Enter Your Choice ( + , - , * , / ");
            String sym = sc.next();
            int res;

            switch(sym) {
                case "+": res = num1+num2;
                    System.out.println(" Addition of "+num1+" + "+num2+" = "+res);
                    break;
                case "-": res = num1 - num2;
                    System.out.println(" Substraction of "+num1+" - "+num2+" = "+res);
                    break;
                case "*": res = num1*num2;
                    System.out.println(" Multiplication of "+num1+" * "+num2+" = "+res);
                    break;
                case "/": res = num1/num2;
                    System.out.println(" Division of "+num1+" / "+num2+" = "+res);
                    break;
                default :
                    System.out.println("Invalid selection");

            }
            System.out.println("Do you want to continue ( Yes / No )");
            yn = sc.next();
        } while(yn.equals("yes") || yn.equals("YES") || yn.equals("Yes") || yn.equals("YEs") );
    }
}
