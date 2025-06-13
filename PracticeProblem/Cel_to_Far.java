import java.util.*;
public class Cel_to_Far{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
double celcius = sc.nextDouble();
 double fahrenheit = (celcius * 9 / 5) + 32;
sc.close();
System.out.println(fahrenheit);
}
}
