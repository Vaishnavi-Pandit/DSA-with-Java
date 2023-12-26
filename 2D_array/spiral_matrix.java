 /* Spiral Matrix Code */

import java.util.Scanner;
public class spiral_matrix {
    /**
     * @param args
     */
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
        int rs=0;
        int re=n-1;
        int cs=0;
        int ce=m-1;
        int k=0;
        while(cs<=ce&&rs<=re){
            for(j=k; j<=ce; j++){
                System.out.print(mat[rs][j]+" ");}
                rs++;
           for(i=k+1; i<=re; i++){
                System.out.print(mat[i][ce]+" ");}
                ce--;
           for(j=ce; j>=k; j--){
                System.out.print(mat[re][j]+" ");}
                re--;
           for(i=re; i>k; i--){
                System.out.print(mat[i][cs]+" ");}
                cs++;
                k++;
            }
        }
        
        
}
