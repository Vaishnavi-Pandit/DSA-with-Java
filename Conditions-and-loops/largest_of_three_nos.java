import java.util.Scanner;
public class largest_of_three_nos{
    /**
     * @param args
     */
    public static void main(String args[]){
      try (Scanner s = new Scanner(System.in)) {
        int n=s.nextInt();
        int m=s.nextInt();
        int p=s.nextInt();
        int max=n;
        if(max<m){
            max=m;
        }
       if(max<p){
            max=p;
        }
            System.out.println(max);
    }
}
}
