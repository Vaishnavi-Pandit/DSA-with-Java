
/*Check weather array is in ascending order or not */
import java.util.Scanner;
public class Weather_array_is_in_ascending_order_or_not {
    /**
     * @param array
     * @return
     */
    public static int ascen (int array[]){
        boolean flag=true;
        for(int i=0;i<array.length-1;i++){
            if(array[i]>array[i+1]){
                flag=false;
            }
            }
            if(flag ==false){
                System.out.print("not in ascending order");

            }
            else{
                System.out.print(" in ascending order"); 
            }
        return 0;
    }
/**
 * @param args
 */
public static void main (String args [])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int array[]=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        ascen(array);

    }

}
