package classes;

import Interfaces.IPizza;

public class Salute extends PizzaFactory {

	@Override
	public IPizza backen(String Best) {
		if(Best.equals("h")|| Best.equals("m")){
			if(Best=="h"){
				return new Hawaii();
			}
			else{
				return new Margherita();
			}
		}
		else{
			System.out.println("Falsche Eingabe!");
			return null;
		}
	}

}
