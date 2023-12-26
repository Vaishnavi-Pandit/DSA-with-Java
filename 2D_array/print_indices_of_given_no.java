/* find and print the indices of given no in java */
import java.util.Scanner;
public class print_indices_of_given_no {
    public static int find( int n, int array[][]){
for(int i=0;i<array.length;i++){
    for(int j=0; j<array[0].length;j++){
        if(array[i][j]==n){
            System.out.println(i+" "+j);
        }
    }
}
return 0;
    }

    /**
     * @param args
     */
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int a= sc.nextInt();
        int b= sc.nextInt();
        int mat[][]=new int[a][b];
        for(int i=0; i<a; i++){
            for(int j=0; j<b; j++){
                mat[i][j]=sc.nextInt();

            }
        }
        find(n,mat);
    }
}
