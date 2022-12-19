package ra.academy;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //write your code here
        Scanner sc = new Scanner(System.in);
        double weight, height,bmi; // khai báo các beeens cân nặng chiều cao và chỉ số bmi có kiểu double
        System.out.println("Enter your weight (kilogram)");
        weight = sc.nextDouble();
        System.out.println("Enter your height (meter)");
        height = sc.nextDouble();
        bmi = weight/Math.pow(height,2);//Math.pow(height,2) trả về luỹ thừa bậc 2 của chiều cao
        String result;
        System.out.printf("%-20s %s\n","BMI","Interpretation");
        if (bmi<18)
            result="Underweight";
        else if (bmi<25.0)
            result = "Normal";
        else if (bmi <30.0 )
            result = "Overweight";
        else
            result = "Obese";
        System.out.printf("%-20.2f %s",bmi,result);
    }
}
