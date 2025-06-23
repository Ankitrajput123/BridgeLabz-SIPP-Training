import java.util.*;
public class RandomExample {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);	
    int num=sc.nextInt();
        double randomValue = Math.random();         
 
        int randomInt = (int)(Math.random() * 100);  
        System.out.println("Random integer between 0 and 99: " + randomInt);
if(randomValue==num){
System.out.println("correct");
}
else if(randomValue<num){
System.out.println("low");
}
else{
System.out.println("high");
}
    }
}
