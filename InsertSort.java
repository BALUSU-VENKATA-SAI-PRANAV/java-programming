import java.util.Scanner;
class InsertSort{
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=in.nextInt();
		int[] arr=new int[n];
		int i=0;
		System.out.println("enter the elements of array");
		for( i=0; i<n; i++) {
			arr[i]=in.nextInt();
		}
		inserSort(arr);
		for(i=0 ; i < n ; i++)
			System.out.println(arr[i]);
		if(n<=0) {
			System.out.println(" array index should be greater than 0.");
			return;
		}
	}
	public static void inserSort(int[] arr) {
		int n=arr.length;
		for(int i=1 ; i < n ; i++) {
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key)
			{
				arr[j+1]=arr[j];
				j--;
				arr[j+1]=key;
			}
		}
	}
}
