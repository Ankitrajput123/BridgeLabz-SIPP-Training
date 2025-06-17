import java.util.*;
public class cal_mean{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
double[] height = new double[11];
double totalheight=0.0;
for(int i=0; i<height.length;i++){
height[i]=sc.nextDouble();
totalheight += height[i];
}
double meanheight = totalheight/height.length;
System.out.print(meanheight);
}
}