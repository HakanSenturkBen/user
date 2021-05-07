package core.utilities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Araclar {
	
	public List<String> sorgu(String...args){

		Scanner in=new Scanner(System.in);
		List<String> params=new ArrayList<String>();
		String katar;
		for (String x : args) {
				System.out.println(x +"= ");
				katar=in.nextLine();
				params.add(katar);
				
		}
		return params;
	}

}
