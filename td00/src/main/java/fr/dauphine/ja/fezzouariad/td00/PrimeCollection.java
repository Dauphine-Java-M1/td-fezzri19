package fr.dauphine.ja.fezzouariad.td00;

import java.util.ArrayList;
import java.util.Random;

/**
 * Hello world!
 *
 */
public class PrimeCollection 
{
	private ArrayList<Integer> numbers;
	private Random random = new Random();
    public PrimeCollection(ArrayList<Integer> n) {
		this.numbers=n;
	}
    public void initrandom(int n,int m) {
    	for (int i = 0; i < n; i++) {
			int init=random.nextInt(m);
			numbers.add(init);
		}
    }
    public boolean isPrime(int p) {
    	if (p<=1)  return false;
    	for (int i = 2; i < Math.sqrt(p); i++) {
			if(p%i==0) return false;
		}
    	return true;
    	
		
    }
    public void printPrimes() {
    	for(int e : numbers) {
    		if(isPrime(e)) {
    			System.out.println(e);
    		}
    	}
    }
    	
    
	public static void main( String[] args )
    {
        ArrayList<Integer> n = new ArrayList<>();
        PrimeCollection p=new PrimeCollection(n);
        p.initrandom(100, 2000);
        System.out.println(n);
        p.printPrimes();
        
        
        
        
        
    }
}
