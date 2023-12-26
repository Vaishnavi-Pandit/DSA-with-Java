/* Take input from user and print array */
import java.util.Scanner;
public class Printing_array {
    /**
     * @param args
     */
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int array[]=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
 for(int i=0;i<n;i++){
           System.out.print( array[i]+" ")
;        }
    }
}
