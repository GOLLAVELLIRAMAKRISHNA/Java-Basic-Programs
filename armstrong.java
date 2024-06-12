import java.util.Scanner;
public class armstrong{
    public static void main(String []a){
        Scanner re = new Scanner(System.in);
        System.out.print("Enter Any Number:");
        int n=re.nextInt();
        int temp=n;
        int sum=0;
        while(n>=1){
            int r=n%10;
            sum=(r*r*r)+sum;
            n=n/10;
            if(n==0){
              if (temp==sum){
                System.out.println("Given "+temp+" Is Armstrong");
              }
              else
              {
                System.out.println("Given "+temp+" Is not armstrong");
              }
              re.close();
            }
        }
        
    }
}