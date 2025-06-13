import java.util.*;
public class cal_SI{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int principal = sc.nextInt();
int rate = sc.nextInt();
int time = sc.nextInt();
int simple_interest = (principal * rate * time)/100;
sc.close();
System.out.print(simple_interest);
}
}

