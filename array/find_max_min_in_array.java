/*Finding maximum and minimum no in an array */
import java.util.Scanner;
public class find_max_min_in_array {
public static int maxmin(int array[]){
    int max=1, min=array[0];
    for(int i=0;i<array.length;i++){
if (array[i]>max) {
    max=array[i];
    
}
if(array[i]<min){
    min= array[i];
}
    }
System.out.print(max+" "+min);
return 0;
}
    /**
     * @param args
     */
    public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n= sc.nextInt();
int array[]=new int[n];
for(int i=0;i<n; i++){
    array[i]=sc.nextInt();
}
maxmin(array);
    }
}
