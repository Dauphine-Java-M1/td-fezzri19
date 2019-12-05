package fr.dauphine.ja.fezzouariad.td00;

import junit.framework.Test;

import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class PrimeCollectionTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public PrimeCollectionTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( PrimeCollectionTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testPrimeCollection()
    {
        assertTrue( true );
    }
    
    /**
     * Modification de la methode isPrime() pour pouvoir y accéder.
     * Réutilisation d'une même variable dans 3 fonctions !! Existe meilleure méthode.
     */
    public void test0IsPrime() {
    	PrimeCollection primeCollection = new PrimeCollection();
        assertFalse( primeCollection.isPrime(0) );
    }
    public void testTwoIsPrime() {
    	PrimeCollection primeCollection = new PrimeCollection();
        assertTrue( primeCollection.isPrime(2) );
    }
    public void test9IsNotPrime() {
    	PrimeCollection primeCollection = new PrimeCollection();
        assertTrue( primeCollection.isPrime(9) );
    }
}
