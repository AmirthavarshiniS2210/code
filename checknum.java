import java.util.Scanner;
public class checknum{
    public static void main(String[]args){
        Scanner check=new Scanner(System.in);
        int a=check.nextInt();
        if(a>0){
            System.out.println("postive");
        }
        else if(a<0){
            System.out.println("negative");
        }
        else{
            System.out.println("neutral");
        }
        }
    }
