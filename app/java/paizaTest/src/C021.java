import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class C021 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// 自分の得意な言語で
        // Let's チャレンジ！！
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line1 = br.readLine();
        String str1[] = line1.split(" ",0);

        int xc = Integer.parseInt(str1[0]);
        int yc = Integer.parseInt(str1[1]);
        int r1 = Integer.parseInt(str1[2]);
        int r2 = Integer.parseInt(str1[3]);

        String line2 = br.readLine();
        int n = Integer.parseInt(line2);

        ArrayList<String> result = new ArrayList<String>();

        for(int i=0;i<n;i++){
        	String line = br.readLine();
            String str[] = line.split(" ",0);

            int x = Integer.parseInt(str[0]);
            int y = Integer.parseInt(str[1]);

            int tmp = (x - xc)*(x - xc)+(y - yc)*(y - yc);

            if(r1*r1<=tmp){
            	if(r2*r2>=tmp){
            		result.add("yes");
            	}
            	else{
            		result.add("no");
            	}
            }
            else{
            	result.add("no");
            }
        }

            Iterator<String> it = result.iterator();

            while(it.hasNext()){
            	System.out.println(it.next());
            }


	}


}






