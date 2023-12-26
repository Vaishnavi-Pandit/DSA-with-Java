
/*Calculating overall lenght of the strings in array */
import java.util.Scanner;
public class Calculating_lenght_of_String_in_array {
    /**
     * @param args
     */
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int l=0;
        String array[]= new String[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextLine();

        }
         for(int i=0;i<n;i++){
         l=l+array[i].length();

        }
        System.out.println(l);

    }
}
