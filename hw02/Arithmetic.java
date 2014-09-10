/*
 * This Class calculates a shopping cart with tax
 * @author David Brewster
 * @version 1.0
 */
public class Arithmetic {
	public static void main(String[] args) {
	//Number of pairs of socks
	int nSocks=3;
	//Cost per pair of socks
	//(‘$’ is part of the variable name)
	double sockCost$=2.58;

	//Number of drinking glasses
	int nGlasses=6;
	//Cost per glass
	double glassCost$=2.29;

	//Number of boxes of envelopes
		int nEnvelopes=1;
	//cost per box of envelopes
	double envelopeCost$=3.25;
	double taxPercent=0.06;
	double actualTax = 1+taxPercent;
	double sockTotal = nSocks*sockCost$;
	double glassTotal = nGlasses*glassCost$;
	double envelopeTotal =nEnvelopes*envelopeCost$;
	double totalPurchase = sockTotal+glassTotal+envelopeTotal;
	double actualCost = totalPurchase*(1+taxPercent);
	System.out.println("Socks: "+sockTotal+" Tax: "+ (sockTotal*actualTax)+"\nGlasses: "+glassTotal+" Tax: "+ (glassTotal*actualTax)+"\nEnvelopes: "+envelopeTotal+" Tax: "+ (envelopeTotal*actualTax));
	System.out.println("Total before tax:"+totalPurchase);
	System.out.println("Total to be charged: "+actualCost);
	}
}
