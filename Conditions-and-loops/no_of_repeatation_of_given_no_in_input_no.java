import java.util.Scanner;
public class no_of_repeatation_of_given_no_in_input_no {
public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
      System.out.println("enter no");
    long no=sc.nextLong();
     System.out.println("enter integer");
    int n=sc.nextInt();
    int count=0;
    int rem;
     while(no>0)
    {
        rem=(int)no%10;
       if(rem==n) {
        count++;

        }
        no=no/10;
    } 
   
    System.out.println(count);
}
    
}
