import java.util.*;
public class sum_till{
public static void main(String []args){
double total = 0.0;
double number;
Scanner sc = new Scanner(System.in);

System.out.println("Enters number to sum");

while(true){
System.out.println("enter number");
number = sc.nextDouble();
if(number==0){
break;
}
total += number;
}
System.out.print("sum" + total);
}
}
