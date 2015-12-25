import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class C014 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// 自分の得意な言語で
        // Let's チャレンジ！！
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line1 = br.readLine();
        String str1[] = line1.split(" ",0);
        int n = Integer.parseInt(str1[0]);
        int r = Integer.parseInt(str1[1]);

        ArrayList<Integer> result = new ArrayList<Integer>();

        for(int i = 1;i<=n;i++){
        	String line = br.readLine();
        	String str[] = line.split(" ",0);
        	int h = Integer.parseInt(str[0]);
        	int w = Integer.parseInt(str[1]);
        	int d = Integer.parseInt(str[2]);

        	if(2*r<=h&&2*r<=w&&2*r<=d){
        		result.add(i);
        	}
        }

        Iterator<Integer> it = result.iterator();
        while(it.hasNext()){
        	System.out.println(it.next());
        }


	}
}





