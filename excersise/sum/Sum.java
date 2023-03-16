import java.util.*; 
public class Sum {

    public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);     
System.out.print("Enter  number- ");
int s=0,i;  
int n= sc.nextInt(); 
for(i=0;i<=n;i++)
{
s=s+i;

}
System.out.println("THE SUM OF DIGIT=" +s);
}
}