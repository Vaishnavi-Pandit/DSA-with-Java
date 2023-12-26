import java.util.Scanner;

public class   Search_element_index_in_array {
    public static int search (int n, int array[]){
        for(int i=0;i<array.length;i++){
if(array[i]==n){
    System.out.println(i);
}
        }
        return 0;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int array[]=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        int a=sc.nextInt();
        search(a,array);
    }
}
