package studio2;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double startAmount=2;
		double winChance=.7;
		double winLimit=10;
		int totalSimulation=500;
		double moneyLeft= startAmount;
		
		while (moneyLeft<winLimit && moneyLeft>0){
				 double x=Math.random();
				 
				 if (x<=winChance) {
				 moneyLeft++;
			 
			 }
				 else {
					 moneyLeft--;}
		}
		
		
		if (moneyLeft>=100) {
			System.out.println("Success");
		}
		if (moneyLeft<=0) {
			System.out.println("Ruin");
		}	
	}
}
		
		


