package chapter11inheritanceandpolymorphisims;

public class Question04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[][]= {{8,9},{4,3},{1,2},{7,3}};
spiral(arr);
	}
	public static String spiral(int[][] arr) {
		String str="";
		int numberOfCycles=2*arr.length-1;
		int row=0;
		int column=0;
		for(int z=0;z<=numberOfCycles;z++) {
		for(int i=0+z;i<arr[z].length-z;i++) {
			str+=arr[z][i];
			column=i;
		}
		for(int i=0+z;i<arr.length-z;i++) {
			str+=arr[i][column];
			row=i;
		}
		for(int i=arr[z].length-z-1;i>=0+z;i--) {
			str+=arr[row][i];
			column=i;
		}
		for(int i=arr.length-z-1;i>=0+z;i--) {
			str+=arr[i][column];
			row=i;
		}

	}
System.out.println(str);
return str;
		
	
//		}
//	for(int i=0;i<arr.length;i++) {
//		str+=arr[i][column]+" ";
//		row=i;
//	}
//	for(int i=arr[i].length;i>=0;i--) {
//		str+=arr[row][i];
//		column=i;
//	}
//		for(int i=0;i<arr.length-i;i++) {
//			row=i;
//			for(int j=0+i;j<arr[i].length;j++) {
//				str+=arr[i][j]+" ";
//				column=j;
//			}
//			for(int m=i+1;m<arr[i].length;m++) {
//				str+=arr[m][column];
//			}
//		}
		
		
	}
}

