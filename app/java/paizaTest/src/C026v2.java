import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class C026v2 {

	/**
	 * @param args
	 */
	carrot getInnerClass(){
		carrot c = new carrot();
		return c;
	}

	public static void main(String[] args) throws Exception {
		// 自分の得意な言語で
        // Let's チャレンジ！！
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line1 = br.readLine();
        String str1[] = line1.split(" " ,0);

        int n = Integer.parseInt(str1[0]);
        int s = Integer.parseInt(str1[1]);
        int p = Integer.parseInt(str1[2]);

        ArrayList<carrot> clist = new ArrayList<carrot>();

        int max=0;
        int result = 0;

        for(int i=0;i<n;i++){
        	String line = br.readLine();
            String str[] = line.split(" " ,0);
            C026v2 outerclass = new C026v2();
            carrot c = outerclass.getInnerClass();
            c.set(i+1,Integer.parseInt(str[0]), Integer.parseInt(str[1]));

            if(s-p<=Integer.parseInt(str[1])){
            	if(Integer.parseInt(str[1])<=s+p){
            		c.setFlg();
            	}
            }
            clist.add(c);
        }

        Iterator<carrot> it = clist.iterator();
        while(it.hasNext()){
        	carrot c = it.next();
        	if(c.getFlg().equals("true")){
        		if(c.getM()>max){
        			max = c.getM();
        			result= c.getNo();
        		}
        	}

        }

        if(result!=0){
        	System.out.println(result);
        }else{
        	System.out.println("not found");
        }

	}



public  class carrot{
	private int no;
	private int m ;
	private int s;
	private String flg="false";

  void set(int no,int m,int s){
	  this.no = no;
	  this.m=m;
	  this.s= s;
  }

	void setFlg(){
		this.flg="true";
	}

	int getNo(){
		return no;
	}

	 int getM(){
		return m;
	}

	String getFlg(){
		return flg;
	}
}


}


















