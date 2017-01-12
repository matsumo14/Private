	import java.io.BufferedReader;
	import java.io.InputStreamReader;
	import java.util.ArrayList;


public class C008 {

	    public static void main(String[] args) throws Exception {
	    	 // 自分の得意な言語で
	        // Let's チャレンジ！！
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String line = br.readLine();

	        String tag[] = new String[2];

	        tag = line.split(" ",0);
	        String taga = tag[0];
	        String tagb = tag[1];

	        StringBuilder s =new StringBuilder();
	        s = s.append(br.readLine());
	        int strSize = s.length();

	        int pointera = 0;
	        int pointerb = 0;

	        String printstr = "";
	        StringBuilder tmp =new StringBuilder();

	        while(strSize!=0){
	        	if(s.indexOf(taga)!=-1){
	        		if(s.indexOf(tagb)!=-1 && s.indexOf(taga)<s.indexOf(tagb)){
	        			pointera = s.indexOf(taga);
	        			pointerb = s.indexOf(tagb);
	        			printstr = s.substring(pointera+taga.length(),pointerb);
	        			if(printstr.length()!=0){
	        				System.out.println(printstr);
	        				tmp.append(s.substring(pointerb+tagb.length()));
	        				s.setLength(0);
	        				s.append(tmp);
	        				tmp.setLength(0);
	        				strSize = s.length();
	        			}else{
	        				System.out.println("<blank>");
	        				break;
	        			}
	        		}else{break;}
	        	}else{break;}

	        }

	    }
}



