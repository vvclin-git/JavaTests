import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

public class HashTypePerformance {
	
	
	public static void main(String[] args) {
		Random rand = new Random();
		   int numCalls = 100000, numRuns = 5;
		   int randomNum1;
		   int tmp;
		   boolean tmpBol;
		   long startTime, time;
		   double callSec = 0;
		   HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		   HashSet<Integer> set = new HashSet<Integer>();
		   int[] array = new int[numCalls];
		   // fill stuff up
		   for (int i = 0; i < numCalls; i++) {			   
			   array[i] = i;
			   map.put(i, i);
			   set.add(i);
		   }
		   // test for array access
		   System.out.println("test for array access: ");
		   callSec = 0;
		   time = 0;
		   for (int j = 0; j < numRuns; j++) {
			   startTime = System.nanoTime();
			   for (int i = 0; i < numCalls; i++) {
				   randomNum1 = rand.nextInt(numCalls);
				   tmp = array[randomNum1];
			   }
			   time += System.nanoTime() - startTime;
			   callSec += numCalls  / (double) time;			   
		   }		   
		   System.out.println("average time elapsed during calls: " + time / numRuns);
		   System.out.println("average calls / sec: " + callSec * 1000000000 / numRuns);
		   System.out.println();

		   // test for HashMap.get
		   System.out.println("test for HashMap.get: ");
		   callSec = 0;
		   time = 0;
		   for (int j = 0; j < numRuns; j++) {
			   startTime = System.nanoTime();
			   for (int i = 0; i < numCalls; i++) {
				   randomNum1 = rand.nextInt(numCalls);
				   tmp = map.get(randomNum1);
			   }
			   time += System.nanoTime() - startTime;
			   callSec += numCalls  / (double) time;			   
		   }		   
		   System.out.println("average time elapsed during calls: " + time / numRuns);
		   System.out.println("average calls / sec: " + callSec * 1000000000 / numRuns);
		   System.out.println();
		   // test for HashMap.contains
		   System.out.println("test for HashMap.contains: ");
		   callSec = 0;
		   time = 0;
		   for (int j = 0; j < numRuns; j++) {
			   startTime = System.nanoTime();
			   for (int i = 0; i < numCalls; i++) {
				   randomNum1 = rand.nextInt(numCalls);
				   tmpBol = map.containsKey(randomNum1);
			   }
			   time += System.nanoTime() - startTime;
			   callSec += numCalls  / (double) time;			   
		   }		   
		   System.out.println("average time elapsed during calls: " + time / numRuns);
		   System.out.println("average calls / sec: " + callSec * 1000000000 / numRuns);
		   System.out.println();

		   // test for HashSet.contains
		   System.out.println("test for HashSet.contains: ");
		   callSec = 0;
		   time = 0;
		   for (int j = 0; j < numRuns; j++) {
			   startTime = System.nanoTime();
			   for (int i = 0; i < numCalls; i++) {
				   randomNum1 = rand.nextInt(numCalls);
				   tmpBol = set.contains(randomNum1);
			   }
			   time += System.nanoTime() - startTime;
			   callSec += numCalls  / (double) time;			   
		   }		   
		   System.out.println("average time elapsed during calls: " + time / numRuns);
		   System.out.println("average calls / sec: " + callSec * 1000000000 / numRuns);
		   System.out.println();
		
	}

}
