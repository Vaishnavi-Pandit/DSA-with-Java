import java.util.Scanner;

public class Print_matrix {
    public static void main(String[] args) {
        Scanner sc= new Scanner( System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int mat[][]=new int[n][m];
        int i,j;
        
        for (i=0;i<n;i++){
            for (j=0;j<m;j++){
                mat[i][j]=sc.nextInt();
            }}
                for (i=0;i<n;i++){
            for (j=0;j<m;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
}}
