import java.util.*;
class Palli
{  
 public static void main(String args[])
{  
Scanner sc = new Scanner(System.in);
int st,end,n1=0,n2=0,i;
System.out.println("ENTER ST VALUE:");
st=sc.nextInt();
System.out.println("ENTER end VALUE:");
end=sc.nextInt();
for(i=st;i<=end;i++)
{
	n1=i;
	n2=0;
	
	
	while(n1!=0){
		
	int r=n1%10;
		n1/=10;
		n2=n2*10+r;
	}
	
	else if(i==n2 ){
		System.out.print(i+" ");
	}
}
}
}





