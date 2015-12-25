import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class C017 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// 自分の得意な言語で
        // Let's チャレンジ！！
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line1 = br.readLine();
        String str1[] = line1.split(" ",0);
        int p1 = Integer.parseInt(str1[0]);
        int p2 = Integer.parseInt(str1[1]);

        String line2 = br.readLine();
        int n = Integer.parseInt(line2);


        ArrayList<String> result = new ArrayList<String>();
        for(int i = 0;i<n;i++){
        	String line = br.readLine();
        	String str[] = line.split(" ",0);
        	int c1 = Integer.parseInt(str[0]);
        	int c2 = Integer.parseInt(str[1]);

        	if(p1>c1){
        		result.add(i, "High");
        	}else if(p1<c1){
        		result.add(i,"Low");
        	}else{
        		if(p2<c2){
        			result.add(i, "High");
        		}else if(p2>c2){
        			result.add(i,"Low");
        		}else{}
        	}
        }

        Iterator<String> it = result.iterator();
        while(it.hasNext()){
        	System.out.println(it.next());
        }


	}
}





