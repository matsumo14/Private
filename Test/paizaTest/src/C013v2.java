import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class C013v2 {

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
        ArrayList<String> result = new ArrayList<String>();
        String flg ="";

        for(int i = 0;i<m;i++){
           roomNum = br.readLine();
           String roomCh[] = roomNum.split("",0);
           System.out.println("size"+":"+roomCh.length);
           for(int j = 0;j<roomCh.length;j++){
        	   System.out.println(i+","+j+":"+roomCh[j]);
        	   if(roomCh[j].equals(n)){
        		   flg = "false";
        		}
        		else{
        		}
        	}
           System.out.println("flg"+":"+flg);
           if(flg.equals("")){
			result.add(roomNum);
        }
           flg = "";
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

