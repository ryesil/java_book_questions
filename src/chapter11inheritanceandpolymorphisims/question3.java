package chapter11inheritanceandpolymorphisims;

import java.util.ArrayList;
import java.util.List;

public class question3 {
public static void main(String[] args) {

System.out.println(identicalFilter(new String[]{"aaaaaa", "bc", "d", "eeee", "xyz"}));
	
	
}

public static String[] identicalFilter(String[] arr) {
List<String> list=new ArrayList<>();
	
	for(int i=0;i<arr.length;i++){
		boolean isSameAs=true;
		for(int j=0;j<arr[i].length();j++){
			if(arr[i].charAt(0)!=arr[i].charAt(j)){
				isSameAs=false;
				break;
			}
		}
		if(isSameAs){
			list.add(arr[i]);
		}
		
	}
	String arr2[]=new String[list.size()];
	
	
	for(int i=0;i<list.size();i++) {
		arr2[i]=list.get(i);
	}
	
	
	return arr2;
	
	
	}



public static int findZip(String str) {
	int index=str.indexOf("zip");
	if(str.substring(index).contains("zip")){
		return str.substring(index+1).indexOf("zip");
	} else{
	
	return -1;
	}

}


}
