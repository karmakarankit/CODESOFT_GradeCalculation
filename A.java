import java.util.*;
class A
{
 public static void main(String arr[])
 {
  Scanner ob = new Scanner(System.in);
  System.out.println("Enter the obtained marks of subject English");
  int a = ob.nextInt();
  System.out.println("Enter the obtained marks of subject Science");
  int b = ob.nextInt();
  System.out.println("Enter the obtained marks of subject Bengali");
  int c = ob.nextInt();
  System.out.println("Enter the obtained marks of subject History");
  int d = ob.nextInt();
  System.out.println("Enter the obtained marks of subject Geography");
  int e = ob.nextInt();
  double Total = (a+b+c+d+e);
  System.out.println("The Total marks is :"+ Total);
  double Percentage = (Total/500)*100;
  System.out.println("The Total Percentage is:" + Percentage8);
  if (Percentage>=90)
  {
   System.out.println("A+"); 
  }
  else if(Percentage>=80 && Percentage<90)
  {
   System.out.println("A"); 
  }
  else if(Percentage>=70 && Percentage<79)
  {
    System.out.println("B+");  
  }
  else if(Percentage>=60 && Percentage<70)
  {
    System.out.println("B");  
  }
  else if(Percentage>=40 && Percentage<60)
  {
    System.out.println("C+");  
  }
  else if(Percentage>=34 && Percentage<40)
  {
    System.out.println("C");  
  }
  else
  {
    System.out.println("Fail");
  }
  }

 }
