
/**
 *Problem 01
 * Find the number of 5s between 0 and n
 */
public class Problem01 {
    
    int getNumberOfDigitsInRange(int n, int digit){
        int count =0;
        for(int i=2; i<=n ; i++){
            count+=numberOfDigits(i, digit);
        }
        return count;
    }
    
    
    int numberOfDigits(int x, int digit){
        int count=0;
        while(x>0){
            if( x%10 == digit) count++;
            x=x/10;
        }
        return count;
    }
    
    public static void main(String[] args) {
        Problem01 p= new Problem01();
        System.out.println("The number of 5s are "+
                p.getNumberOfDigitsInRange(60,5) );
    }   
}
