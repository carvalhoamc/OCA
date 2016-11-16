//236

class Filhote{

	public double getAverageWeight(){

		return 50;
	}
}


public class Lion extends Filhote{

	public double getAverageWeight(){
		return super.getAverageWeight() + 20;
	}


	public static void main (String[] args){

		System.out.println(new Lion().getAverageWeight());
		System.out.println(new Filhote().getAverageWeight());

	}


}