import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

public class HashTypePerformance {
	
	
	public static void main(String[] args) {
		Random rand = new Random();
		   int numCalls = 100000;
		   int randomNum1;
		   int tmp;
		   long startTime, time;
		   double callSec;
		   HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		   HashSet<Integer> set = new HashSet<Integer>();
		   int[] array = new int[numCalls];
		   for (int i = 0; i < numCalls; i++) {			   
			   array[i] = i;
			   map.put(i, i);
			   set.add(i);
		   }
		   // test for array access
		   startTime = System.nanoTime();
		   System.out.println("test for array access: ");
		   for (int i = 0; i < numCalls; i++) {
			   randomNum1 = rand.nextInt(numCalls);
			   tmp = array[randomNum1];
		   }
		   time = System.nanoTime() - startTime;
		   callSec = numCalls  / (double) time;
		   System.out.println("time elapsed in during calls: " + time);
		   System.out.println("calls / sec: " + callSec* 1000000000);
		   System.out.println();

		   // test for HashMap.get
		   startTime = System.nanoTime();
		   System.out.println("test for HashMap.get: ");
		   for (int i = 0; i < numCalls; i++) {
			   randomNum1 = rand.nextInt(numCalls);
			   tmp = map.get(randomNum1);
		   }
		   time = System.nanoTime() - startTime;
		   callSec = numCalls  / (double) time;
		   System.out.println("time elapsed in during calls: " + time);
		   System.out.println("calls / sec: " + callSec* 1000000000);
		   System.out.println();
		   // test for HashMap.contains
		   startTime = System.nanoTime();
		   System.out.println("test for HashMap.contains: ");
		   for (int i = 0; i < numCalls; i++) {
			   randomNum1 = rand.nextInt(numCalls);
			   map.containsKey(randomNum1);
		   }
		   time = System.nanoTime() - startTime;
		   callSec = numCalls  / (double) time;
		   System.out.println("time elapsed in during calls: " + time);
		   System.out.println("calls / sec: " + callSec* 1000000000);
		   System.out.println();

		   // test for HashSet.contains
		   startTime = System.nanoTime();
		   System.out.println("test for HashSet.contains: ");
		   for (int i = 0; i < numCalls; i++) {
			   randomNum1 = rand.nextInt(numCalls);
			   set.contains(randomNum1);
		   }
		   time = System.nanoTime() - startTime;
		   callSec = numCalls  / (double) time;
		   System.out.println("time elapsed in during calls: " + time);
		   System.out.println("calls / sec: " + callSec* 1000000000);
		   System.out.println();
		
	}

}
