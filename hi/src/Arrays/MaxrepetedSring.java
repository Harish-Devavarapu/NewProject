package Arrays;

public class MaxrepetedSring {

	public static void main(String[] args) {
		String word="harish";
		int len=word.length();
        int mx=-1;
        char result=0;
        int count[]=new int[256];
        for(int i=0;i<len;i++) {
        	count[word.charAt(i)]++;
        	
        }
        for(int i=0;i<len;i++) {
        	if (mx<count[word.charAt(i)]) {
        		mx=count[word.charAt(i)];
        		result=word.charAt(i);
        	}
        }
        System.out.println(result);
	}

}
