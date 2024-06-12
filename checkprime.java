import java.util.Scanner;
public class checkprime {
    public static void main(String a[]){
      Scanner sn=new Scanner(System.in);
      System.out.print("Enter a Number:");
      int p=sn.nextInt();
      int c=0;
      if(p>0){
        for(int i=1;i<=p;i++){
            if(p%i==0){
                   c++;
               }
        }
         if(c==2){
               System.out.println("Given Number Is Prime!!!");
           }
           else{
               System.out.println("Given Number Is Not Prime!!!");
           }
      }
      else if(p<0){
        for (int i=-1;i>=p;i--){
            if(p%i==0){
                c++;
            }
        }
        if(c==2){
            System.out.println("Given Number Is Prime!!!");
        }
        else{
            System.out.println("Given Number Is Not Prime!!!");
        }
      }
      else{
        System.out.println("You Entered Zero!!!");
      }
      sn.close();
    }
}