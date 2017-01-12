import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class C019 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// 自分の得意な言語で
        // Let's チャレンジ！！
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line1 = br.readLine();
        int q= Integer.parseInt(line1);

        ArrayList<Integer> n =new  ArrayList<Integer>();
        ArrayList<String> result = new ArrayList<String>();

        for(int i=0;i<q;i++){
        	String line = br.readLine();
        	n.add(Integer.parseInt(line));

        	//System.out.println("n:"+n.get(i));

        	int s =0;
        	for(int j=1;j<=n.get(i);j++){
        			if(n.get(i)%j==0&j!=1){
        				s = s+n.get(i)/j;
        			}else{}
        		}
        	//System.out.println("s:"+s);

        	if(s==n.get(i)){
        		result.add("perfect");
        	}
        	else if(Math.abs(s-n.get(i))==1){
        		result.add("nearly");
        	}
        	else{
        		result.add("neither");
        	}

        }

        Iterator<String> it = result.iterator();

        while(it.hasNext()){
        	System.out.println(it.next());
        }

	}
}





