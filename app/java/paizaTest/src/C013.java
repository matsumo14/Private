import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class C013 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// 自分の得意な言語で
        // Let's チャレンジ！！
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line1 = br.readLine();
        String n = line1;

        String line2 = br.readLine();
        int m = Integer.parseInt(line2);


        String roomNum = "";
        ArrayList<String> result = new ArrayList();

        for(int i = 0;i<m;i++){
           roomNum = br.readLine();
           if(roomNum.contains(n)){ }
        		else{
             	   result.add(roomNum);
        		}
        	}

        if(result.size()==0){
        	System.out.println("none");
        }
        else{
        	Iterator<String> it = result.iterator();
        	while(it.hasNext()){
        		System.out.println(it.next());
        	}
        }
	}
}





