import java.util.*;
class array{
	public static void main (String [] args){
		int arr1[]=new int[20],arr2[]=new int[10];
		int arr[]={1,2,3,4,5,6};
		int i,j=0,n;
		Scanner sc = new Scanner(System.in);
		System.out.print("THE ARRAY VALUE=");
		for(i=0;i<20;i++){
			arr1[i]=j;
			j++;
		}
		for(i=0;i<20;i++){
			System.out.println(arr1[i]);
		
		}	
System.out.println("enter valuve to print=");
n=sc.nextInt();
System.out.println("THE SELECTED VALUE="+arr[n]);
}
}	