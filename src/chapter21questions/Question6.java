package chapter21questions;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class Question6 {
	
public static void main(String[] args) {
	String subjects[]={"math","sci","geo","phy","sos","che","eng"};
String day1[][]= {{"math","sci","geo","phy","sos","che","eng"},
				  {"sci","geo","phy","sos","che","eng"},
				  {"math","sci","geo","sos","che","eng"},
				  {"math","sci","geo","phy","che","eng"}};
String day2[][]= {{"math","sci","geo","phy","sos","che","eng"},
		 		  {"math","geo","phy","sos","che","eng"},
		 		  {"sci","geo","phy","sos","che","eng"},
		 		  {"math","sci","geo","phy","sos","che"}};
String day3[][]= {{"math","sci","geo","phy","sos","che","eng"},
		  		  {"math","sci","geo","phy","che","eng"},
		  		  {"math","sci","geo","phy","sos","che"},
		  		  {"math","sci","geo","phy","sos","che","eng"}};
String day4[][]= {{"math","sci","geo","phy","sos","che","eng"},
				  {"math","sci","geo","sos","che","eng"},
				  {"math","sci","geo","phy","sos","che","eng"},
				  {"sci","geo","phy","sos","che"}};
String day5[][]= {{"sci","geo","phy","sos","che","eng"},
		  		  {"math","sci","geo","phy","sos","che","eng"},
		  		  {"geo","phy","che","eng"},
		  		  {"math","sci","phy","sos","che","eng"}};
String week[][][] = {day2,day3,day4,day5};
System.out.println(Arrays.deepToString(week));
String students[]= {"Ali","Veli","Ramazan","Zuleyha"};

Map<String,Map<String, Integer>> math=new LinkedHashMap<>();


//for(int i=0;i<week.length;i++) {
//	for(int j=0;j<week[i].length;j++) {
//		for(int k=0;k<week[i][j].length;i++) {
//			
//		}
//	}
//}


//Names			math		science				geograpy		
//ramazan		2				12					11


}
	
	
	
	
	
	
}
