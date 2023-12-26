/*rename char e in string to i */
import java.util.Scanner;
public class rename_char_in_string {

    /**
     * @param args
     */
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String str= sc.nextLine();
    String q="";
    for(int i=0; i<str.length();i++){
        if(str.charAt(i)=='e'){
           q=q+"i";
        }
        else{
            q=q+str.charAt(i);
        }
    }
    System.out.println(q);
}
}