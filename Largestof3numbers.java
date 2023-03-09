import java.util.Scanner;  
public class Main  
{  
public static void main(String[] args)   
{  
double a, b, c, largest, temp;  
Scanner sc = new Scanner(System.in);  
System.out.println("Enter the first number:");  
a = sc.nextDouble();  
System.out.println("Enter the second number:");  
b = sc.nextDouble();  
System.out.println("Enter the third number:");  
c = sc.nextDouble();  
temp=a>b?a:b;  
largest=c>temp?c:temp;  
System.out.println("The largest number is: "+largest);  
}  
}
