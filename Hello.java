import java.util.Scanner;

class Hello {
public static int Add(int a, int b,int c, int d)
{
int sum;
sum= a+b+c+d;
return sum;
}
public static void main(String[] args) {
try (Scanner sc = new Scanner(System.in)) {
    System.out.print("Enter first number- ");  
    int a= sc.nextInt();  
    System.out.print("Enter second number- ");  
    int b= sc.nextInt(); 
    System.out.print("Enter third number- ");  
    int c= sc.nextInt();  
    System.out.print("Enter fourth number- ");  
    int d= sc.nextInt(); 
    
    int result;
    result= Add(a,b,c,d);
    System.out.println("Addition of numbers is "+result);  
        //fun1();
}
}
    
}
