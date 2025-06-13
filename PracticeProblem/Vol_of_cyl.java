import java.util.*;
class Vol_of_cyl{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
double radius = sc.nextDouble();
double height = sc.nextDouble();
double volume = Math.PI*(radius*radius)*height;
sc.close();
System.out.print(volume);
}
}