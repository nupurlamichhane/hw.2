import java.util.Scanner;
import java.util.Random;
public class two {
    public static void main(String[] args) {

        String username = "nupur";
        String password = "lamichhane";

        Scanner input = new Scanner(System.in);

        System.out.println("Enter username");
        String name = input.nextLine();
        System.out.println("Enter password");
        String pass = input.nextLine();
        if (name.equals(username) && pass.equals(password)) {
            System.out.println("Login Successful");

            System.out.println("1) calculator \n2) Guessing game \n3) SI Calculator \n4) Check if given char is vowel or consonant");
            System.out.println("Choose a option");
            int opt = input.nextInt();

                if(opt == 1) {
                    System.out.println("Enter first no:");
                    int a = input.nextInt();
                    System.out.println("Enter Second no:");
                    int b = input.nextInt();
                    System.out.println("Enter an operator (+,-,*,/)");
                    char oper = input.next().charAt(0);
                    int result;
                    switch (oper) {
                        case '+':
                            result = a + b;
                            System.out.println(a + " + " + b + " = " + result);
                            break;
                        case '-':
                            result = a - b;
                            System.out.println(a + " - " + b + " = " + result);
                            break;
                        case '*':
                            result = a * b;
                            System.out.println(a + " * " + b + " = " + result);
                            break;
                        case '/':
                            result = a / b;
                            System.out.println(a + " / " + b + " = " + result);
                            break;
                        default:
                            System.out.println("Operator not found");
                    }
                } else if (opt == 2) {
                    Random z = new Random();
                    int number = z.nextInt(10);
                    System.out.println("Enter a no from 0 to 10");
                    int a = input.nextInt();
                    if (a == number) {
                        System.out.println("You won");
                    } else {
                        System.out.println("Try again");
                    }
                } else if (opt == 3) {
                    System.out.println("Enter Principle");
                    int a = input.nextInt();
                    System.out.println("Enter Rate");
                    double b = input.nextDouble();
                    System.out.println("Enter Time");
                    int c = input.nextInt();
                    double SI = (a * b * c) / 100;
                    System.out.println("Simple Interest = " + SI);

                } else if (opt == 4) {
                    System.out.println("Enter a char in lowercase");
                    char a = input.next().charAt(0);
                    if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
                        System.out.println(a + " is vowel");
                    } else {
                        System.out.println(a + " is consonant");
                    }
                }
                else {
                    System.out.println("404 not found");
                }
            }
        else {
            System.out.println("Login Failed");
        }
    }
}
