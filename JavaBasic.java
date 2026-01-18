/*
 * Program Name : JavaBasic.java
 
 * Description  :
 * A menu-driven Java application that contains a collection of basic programming problems for learning and revision purposes.
 * New programs can be added regularly as practice.
 
 * Purpose      :
 * - Practice core Java concepts
 * - Quickly recall common logical problems
 
 * Concepts Used:
 * - Loops
 * - Conditional statements
 * - Methods
 * - Switch-case
 * - Scanner (user input)
 
 * Author       : Pragadeeshwari R R
 * Created On   : 18-01-2026
 */


import java.util.Scanner;
public class JavaBasic{
    // static scanner no need to create multiple times
    static Scanner s=new Scanner(System.in);
    public static void main(String[]args){
        // Menu will be displayed until user chooses to exit
        while(true){
            System.out.println("\nWelcome to Java Basic Programs !");
            System.out.println("\nChoose a Program to Perform :");
            System.out.println("\n1.Factorial Program \n2.Fibonacci Series \n3.Palindrome number \n4.Prime number check \n5.Amstrong number \n6.Reverse a number \n7.Odd or Even \n8.Sum of Digits \n9.GCD of 2 numbers \n10.Multiplication Table \n11.Largest of Three Numbers \n12.Count Vowels and Consonents \n13.Exit");
            System.out.println("\nEnter your choice:");
            int num =s.nextInt();
            switch(num){
                case 1:
                    factorial();
                    break;
                case 2:
                    fibonacci();
                    break;
                case 3:
                    palindrome();
                    break;
                case 4:
                    primeCheck();
                    break;
                case 5:
                    armstrong();
                    break;
                case 6:
                    reverseNumber();
                    break;
                case 7:
                    oddEven();
                    break;
                case 8:
                    sumOfDigits();
                    break;
                case 9:
                    gcd();
                    break;
                case 10:
                    multiplicationTable();
                    break;
                case 11:
                    largestOfThree();
                    break;
                case 12:
                    countVowCons();
                    break;
                case 13:
                    System.out.println("Exiting the program. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice! Please select a valid option.");
                    break;
            }
        }
    }
    // Factorial Program
    public static void factorial(){
        int userinput;
        System.out.println("Enter number to find factotial :");
        userinput=s.nextInt();
        int fact=1;
        for(int i=1;i<=userinput;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of NUmber is" + fact);
    }
    // Fibonacci Series
    public static void fibonacci(){
        int fact1=0,fact2=1;
        System.out.println("Enter number of terms");
        int userinput=s.nextInt();
        if (userinput<0){
            System.out.println("Please enter a positive number");
            return;
        }
        System.out.println("Fibonacci Series:");
        System.out.println(""+fact1);
        System.out.println(""+fact2);
        for (int i=2;i<userinput;i++){
            int fact3=fact1+fact2;
            System.out.println(""+fact3);
            fact1=fact2;
            fact2=fact3;
        }
    }
    // Palindrome number
    public static void palindrome(){
        System.out.println("Enter a number to check palindrome:");
        int userinput=s.nextInt();
        int ori=userinput;
        int rev=0;
        while (userinput>0){
            int rem = userinput%10;
            rev=rev*10+rem;
            userinput=userinput/10;
        }
        if (rev==ori){
            System.out.println(ori+" is a Palindrome number");
        }
        else{
            System.out.println(ori+" is not a Palindrome number");
        }
    }
    // Prime number check
    public static void primeCheck(){
        System.out.println("Enter number to check prime:");
        int userinput=s.nextInt();
        if (userinput<=1){
            System.out.println(""+userinput+" is not a Prime number");
        }
        else{
            for(int i=2;i<=Math.sqrt(userinput);i++){
                if (userinput%i==0){
                    System.out.println(""+userinput+" is not a Prime number");
                    return;
                }
            }
            System.out.println(""+userinput+" is a Prime number");
        }
    }
    // Armstrong number
    public static void armstrong(){
        System.out.println("Enter number to check armstrong:");
        int userinput=s.nextInt();
        int ori=userinput;
        int length=0;
        int b=userinput;
        while(b>0){
            length+=1;
            b=b/10;
        }
        b=userinput;
        int rev=0;
        while(b>0){
            int rem=b%10;
            rev+= Math.pow(rem, length);
            b=b/10;
        }
        if(rev==ori){
            System.out.println(ori+" is an Armstrong number");
        }
        else{
            System.out.println(ori+" is not an Armstrong number");
        }
    }
    // Reverse a number
    public static void reverseNumber(){
        System.out.println("Enter a number to reverse :");
        int userinput=s.nextInt();
        int rev=0;
        while (userinput>0){
            int rem=userinput%10;
            rev=rev*10+rem;
            userinput=userinput/10;
        }
        System.out.println("Reverse of the number is "+rev);
    }
    // Odd or Even
    public static void oddEven(){
        System.out.println("Enter number to check odd or even:");
        int userinput=s.nextInt();
        if(userinput<0){
            System.out.println("Please enter a positive number");
        }
        else if(userinput%2==0){
            System.out.println(userinput+" is an Even number");
        }
        else{
            System.out.println(userinput+" is an Odd number");
        }
    }
    // Sum of Digits
    public static void sumOfDigits(){
        System.out.println("Enter number to find its sum of digits:");
        int userinput=s.nextInt();
        int sum=0;
        while(userinput>0){
            int rem=userinput%10;
            sum=sum+rem;
            userinput=userinput/10;
        }
        System.out.println("Sum of digits is "+sum);
    }
    // GCD of 2 numbers
    public static void gcd(){
        System.out.println("Enter 2 numbers to get GCD:");
        System.out.println("Enter first number:");
        int a=s.nextInt();
        System.out.println("Enter second number:");
        int b=s.nextInt();
        while(b!=0){
            int tem=b;
            b=a%b;
            a=tem;
        }
        System.out.println("GCD is "+a);
    }
    // Multiplication Table
    public static void multiplicationTable(){
        System.out.println("Enter Which multiplivation table you want:");
        int userinput=s.nextInt();
        System.out.println("Upto which number: Ex :10");
        int end=s.nextInt();
        for (int i=1;i<=end;i++){
            System.out.println(userinput+" * "+i+" = "+(userinput*i));
        }
    }
    // Largest of Three Numbers
    public static void largestOfThree(){
        System.out.println("Enter Three numbers :");
        System.out.println("Enter first number:");
        int a=s.nextInt();
        System.out.println("Enter second number:");
        int b=s.nextInt();
        System.out.println("Enter third number:");
        int c=s.nextInt();
        int lar=0;
        if (a>b){
            if (a>c){
                lar=a;
            }
            else{
                lar=c;
            }
        }
        else{
            if (b>c){
                lar=b;
            }
            else{
                lar=c;
            }
        }
        System.out.println("Largest number is "+lar);
    }
    // Count Vowels and Consonents
    public static void countVowCons(){
        System.out.println("Enter a String :");
        String string=s.next();
        int vow=0,cons=0;
        for (int i=0;i<string.length();i++){
            char ch=string.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                vow++;
            }
            else{
                cons++;
            }
        }
        System.out.println("In your String :"+string);
        System.out.println("Vowels = "+vow+"\nConsonents = "+cons);
    }
}