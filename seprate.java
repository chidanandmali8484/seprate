import java.util.Scanner;
public seprate
{
  public static void main(String[]args)
  {
    int n,i,rem;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    n=sc.nextInt();
    i=n;
    while(i!=0) 
    {
      rem=i%10;
      System.out.println(rem+" ");
      i=i/10;
     }
     
  }
  
}
