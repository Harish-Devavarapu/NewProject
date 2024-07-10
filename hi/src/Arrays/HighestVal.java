package Arrays;

public class HighestVal {

	public static void main(String[] args) {
		int arr[]= {1,9,3,7,5},temp=0,count=0;
		for (int i=0;i<arr.length;i++) {
			for (int j=i+1;j<arr.length;j++) {
				if (arr[i]>arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
				}
			}
		}
 for (int k:arr) {
	 System.out.print(k+" ");
 }
	}

}
