
public class JunitTesting {
    public int cube(int x){
    	return x*x*x;
    }
    
    public int countX(String input){
    	int count = 0;
    	for(int i= 0;i < input.length(); i++){
    		if(input.charAt(i) == 'x' || input.charAt(i) == 'X'){
    			count ++;
    		}
    	}
    	return count;
    }
}
