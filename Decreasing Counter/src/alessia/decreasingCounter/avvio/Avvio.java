package alessia.decreasingCounter.avvio;

import alessia.decreasingCounter.classe.DecreasingCounter;
import alessia.decreasingCounter.classe.HealthStation;
import alessia.decreasingCounter.classe.Person;

public class Avvio {

	public static void main(String[] args) {
		 DecreasingCounter counter = new DecreasingCounter(1);

	        counter.printValue();

	        counter.decrement();
	        counter.printValue();

	        counter.decrement();
	        counter.printValue();
	        
	        
	        
	        System.out.println("-----ESERCIZIO SUCCESSIVO-----");
	        HealthStation childrensHospital = new HealthStation();

	        Person ethan = new Person("Ethan", 1, 110, 7);
	        Person peter = new Person("Peter", 33, 176, 85);

	        System.out.println(ethan.getName() + " weight: " + childrensHospital.weigh(ethan) + " kilos");
	        System.out.println(peter.getName() + " weight: " + childrensHospital.weigh(peter) + " kilos");
	}

}
