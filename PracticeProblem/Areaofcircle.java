import java.util.*;
public class Areaofcircle{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
double radius = sc.nextDouble();
double area = Math.PI*(radius*radius);
sc.close();
System.out.println(area);
}
}