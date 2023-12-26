import java.util.Scanner;
public class taking_string_input_in_array {
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        String array[]=new String [n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextLine();
        }
 for(int i=0;i<n;i++){
           System.out.print( array[i]+" ")
;        }
    }
}
