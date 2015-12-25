	import java.io.BufferedReader;
	import java.io.InputStreamReader;


public class C005 {

	    public static void main(String[] args) throws Exception {
	        // 自分の得意な言語で
	        // Let's チャレンジ！！
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String line = br.readLine();
	        int num = Integer.parseInt(line);
	        String ip[] = new String[num];
	        String chkflg[] =new String[num];

	        for(int i=0;i<num;i++){
	           ip[i] = br.readLine();
	           String str[] = ip[i].split("\\.",-1);
	           chkflg[i] = "True";
	           if(str.length!=4){
	        	   chkflg[i] = "False";
	           }

	           for(int j=0;j<str.length-1;j++){
	               if(str[j].equals("")){
	                chkflg[i] = "False";
	               }else{
	            	   try{
	            	   int chknum = Integer.parseInt(str[j]);
	            	   		if(0>chknum||chknum>255){
	            	   			chkflg[i] = "False";
	            	   		}
	            	   }
	            	   catch(NumberFormatException e){
	            		   chkflg[i] = "False";
	            	   }

	               }
	           }
	        }
	        int k =0;
	        while(k<num){
	        	System.out.println(chkflg[k]);
	        	k++;
	        }

	    }
}
