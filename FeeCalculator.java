
public class FeeCalculator {

  /**
	 * @param args
	 */
	
	public static void main(String[] args) {
		int totalCost = Integer.parseInt(args[0]);
		int partCount = Integer.parseInt(args[1]);
		
		System.out.println("Total cost : " + totalCost);
		System.out.println("Number of participant : " + partCount);
		System.out.println("Cost per a person : " + totalCost/partCount);		
	}

}
