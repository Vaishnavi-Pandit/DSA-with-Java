import java.util.Scanner;

public class reverse_the_no {
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
      System.out.println("enter no");
    long no=sc.nextLong();
     

    
     while(no>0)
    {
        System.out.print(no%10);
        no=no/10;
    } 
   
}
}
