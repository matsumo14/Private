import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class C018 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// 自分の得意な言語で
        // Let's チャレンジ！！
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line1 = br.readLine();
        int n = Integer.parseInt(line1);

        HashMap<String,Integer> recipe = new HashMap<String,Integer>();

        for(int i=0;i<n;i++){
        	String line2 = br.readLine();
        	String tmp[] = line2.split(" ",0);
        	String rkey = tmp[0];
        	int rvalue = Integer.parseInt(tmp[1]);

        	recipe.put(rkey, rvalue);
        }

        String line3= br.readLine();
        int m = Integer.parseInt(line3);

        HashMap<String,Integer> have = new HashMap<String,Integer>();

        for(int j=0;j<m;j++){
        	String line4 = br.readLine();
        	String tmp[] = line4.split(" ",0);
        	String hkey = tmp[0];
        	int hvalue = Integer.parseInt(tmp[1]);

        	have.put(hkey, hvalue);
        }

        Iterator<String> it =recipe.keySet().iterator();
        ArrayList<Integer> result = new ArrayList<Integer>();

        while(it.hasNext()){
        	String name = it.next();
        	//System.out.println(name);
        	try{
        	result.add(have.get(name)/recipe.get(name));
        	}catch(NullPointerException e){
        		result.add(0);
        	}
        }

        Collections.sort(result);

        System.out.println(result.get(0));


	}
}





