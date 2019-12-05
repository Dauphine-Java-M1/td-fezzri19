package fr.dauphine.ja.fezzouariad.td00;

import java.util.ArrayList;
import java.util.Random;

/**
 * Hello world!
 *
 */
public class PrimeCollection 
{
	// Rajout commentaire pour test commit
	
	private ArrayList<Integer> numbers;
	private Random random = new Random();
	public PrimeCollection() 
	{
		this.numbers = new ArrayList<>();
	}
	
	public void initRandon(int n,int m)
	{
		for(int i = 0 ; i<=n; i++) {
			int rajout = random.nextInt(m);
			numbers.add(rajout);
		}
	}
	/**
	 *  Modification de la methode isPrime() pour pouvoir y accéder.
	 * @param p
	 * @return
	 */
	public boolean isPrime(int p) 
	{
		if(p<1) return false;
		for(int i =2; i<Math.sqrt(p); i++) {
			if(p%i == 0) return false;
		}
		return true;
	}
	
	public void printPrimes() 
	{
		for(Integer e : this.numbers) {
			if(isPrime(e)) {
				System.out.println(e);
			}
		}
	}
	
    public static void main( String[] args )
    {
       PrimeCollection primeCollection = new PrimeCollection();
       primeCollection.initRandon(100, 2000);
       primeCollection.printPrimes();
    }
}