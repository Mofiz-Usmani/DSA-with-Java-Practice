import java.util.*;

public class JAVABASICS {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter Your name : ");
        // String c = sc.nextLine();

        // System.out.println("Enter your Age : ");
        // int age = sc.nextInt();

        // System.out.println("Enter you CGPA : ");
        // float cgpa = sc.nextFloat();


        // System.out.println(c + " is " + age + " years " + "old" + " having "+ cgpa + " CGPA");

        // Int to long Possible
        // int a = 25;
        // long b = a;

        // Long to Int NOt Possible
        // long a = 25;
        // int b = a;

        
        // INt to float 
        // float number = sc.nextFloat();
        // System.out.println(number);



        // Type Casting
        // float a = 25.23f;
        // int b = (int)a;
        // System.out.println(b);



        // Type Promotion
        // int a = 10;
        // float b = 20.87f;
        // long c = 34;
        // double d = 30;
        // double ans = a + b + c + d;
        // System.out.println(ans);



        // Error arithmetic operations on byte, short, or char - 
        // are automatically promoted to int before calculation.
        // byte b = 5;
        // b = b * 2;   // Error
        // b = (byte)(b * 2);  // Right
        // System.out.println(b);




        // Write a Java program that takes three integers as input-
        // and prints the largest number using only if–else statements (no built-in Math.max).
        // System.out.println("Enter a : ");
        // int a = sc.nextInt();
        // System.out.println("Enter b : ");
        // int b = sc.nextInt();
        // System.out.println("Enter c : ");
        // int c = sc.nextInt();


        // if( a>b && a>c) {
        //     System.out.println("a is greater" + " a : "+a);
        // }
        // else if(b>a && b>c){
        //     System.out.println("b is greater" + " b : "+b);
        // }
        // else {
        //     System.out.println("c is greater" + " c : "+c);
        // }



        // Write a Java program that takes three integers as input and finds
        // the largest number using only the ternary operator (no if–else, no Math.max).
        // System.out.println("Enter a : ");
        // int a = sc.nextInt();
        // System.out.println("Enter b : ");
        // int b = sc.nextInt();
        // System.out.println("Enter c : ");
        // int c = sc.nextInt();
        // int largest = (a > b) 
        //         ? (a > c ? a : c) 
        //         : (b > c ? b : c);
        // System.out.println("Largest number is " + largest);




        // Switch Statement
        // System.out.println("Enter a : ");
        // int a = sc.nextInt();
        // System.out.println("Enter b : ");
        // int b = sc.nextInt();
        // System.out.println("Enter b : ");
        // String op = sc.next();
        

        // switch (op) {
        //     case "+":
        //         System.out.println("a + b = "+ (a+b));
        //         break;
        //     case "-": 
        //         System.out.println("a - b = "+ (a-b));
        //         break;
        //     case "*": 
        //         System.out.println("a * b = "+ (a*b));
        //         break;
        //     case "/": 
        //         System.out.println("a / b = "+ (a/b));
        //         break;
        //     default:
        //         break;
        // }



        // While Loop
        // int i = 0;
        // while(i<=10){
        //     System.out.print(i+" ");
        //     i++;
        // }



        // Reverse of a number
        // int n = 10899;

        // while(n > 0){
        //     int lastDigit = n%10;
        //     System.out.print(lastDigit);
        //     n = n/10;
        // }
        // System.out.println();



        // Do While Loop
        // int i = 1;
        // do {
        //     System.out.print(i + " ");
        //     i++;
        // } while (i <=10);




        // Table of Number
        // System.out.println("Enter a Number : ");
        // int num = sc.nextInt();

        // System.out.println();
        // System.out.println();
        // System.out.println("Table of "+ num + " : ");
        // System.out.println();


        // for(int i=1; i<=10; i++){
        //     System.out.println(num + " X " + i + " = " + num*i);
        // }




        // Pattern 1 
        // for(int i=0; i<=4; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // Pattern 2
        // for(int i=0; i<=4; i++){
        //     for(int j=4; j>=i; j--){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }




        // Pattern 3
        // for(int i=0; i<=4; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }




        // Pattern 4
        // char ch = 'A';
        // for(int i=0; i<=4; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(ch);
        //         ch++;
        //     }
        //     System.out.println();
        // }




        // Pattern 5
        for(int i=1; i<=4; i++){
            for(int j=1; j<=5; j++){
                if(i == 1 || i == 4 || j == 1 || j == 5){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}