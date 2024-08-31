import java.util.Scanner;
class pal
{
 public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the number");
  int a=sc.nextInt();
  int b=a;
   int s=0;
   while(a>0)
   {
   int remainder=a%10;
  int quo=a/10;
  a=quo;
s=s*10+remainder;
}
 if(b==s)
{
System.out.println("is palindrome");
}
else
{
 System.out.println("not palindrome");
}
}}