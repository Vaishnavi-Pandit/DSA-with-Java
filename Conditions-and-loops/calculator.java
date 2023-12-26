import java.util.Scanner;
public class calculator {
/**javac calcualtor
 * @param args
 */
public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    boolean bo=true;
    int c=0;
      While(bo== true);
      {
          char ch=sc.next().trim().charAt(0);
          if(ch=='+'||ch=='-'||ch=='*'||ch=='/'||ch=='%'){
              int a = sc.nextInt();
              int b = sc.nextInt();
              
              if(ch=='+'){
                   c=a+b;
              }
              if(ch=='-'){
                   c=a-b;
              }
              if(ch=='*'){
                   c=a*b;
              }
              if(ch=='/'){
                   c=a/b;
              }
              if(ch=='%'){
                   c=a%b;
              }
              System.out.println(c);}
              else if(ch=='x' || ch=='X')
        {
            break;
        }      
        else{
            System.out.println("invalid input");
        
          }
      }
}
    
}
