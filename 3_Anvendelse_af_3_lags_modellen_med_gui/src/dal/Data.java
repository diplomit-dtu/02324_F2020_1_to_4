package dal;
import java.util.ArrayList;
import java.util.Iterator;

import dal.IData;

public class Data implements IData {

	private ArrayList<Person> personer; 

	public Data(){
		personer = new ArrayList<Person>();
		// Tilf�j personer
		personer.add(new Person("234567-8901", "Ib Olsen", 1.80, 75.0));
		personer.add(new Person("456789-0123", "Ole Jensen", 1.75, 95.0));
		personer.add(new Person("123456-7890", "Eva Hansen", 1.65, 65.0));
		// print dem lige ud til debug
		Iterator<Person> it =  personer.iterator();
        while(it.hasNext()) 
        System.out.println(it.next());
        System.out.println("---");
	}

	//Returner personens navn
	public String getNavn(String cpr){
		for (int i= 0; i< personer.size(); i++)
			if (personer.get(i).cpr.equals(cpr))
				return personer.get(i).navn;
		return null;
	}
	
	//Returner personens v�gt
	public double getVaegt(String cpr){
		for (int i= 0; i< personer.size(); i++)
			if (personer.get(i).cpr.equals(cpr))
				return personer.get(i).vaegt;
		return -1;
	}
	
	//Returner personens h�jde
	public double getHoejde(String cpr){
		for (int i= 0; i< personer.size(); i++)
			if (personer.get(i).cpr.equals(cpr))
				return personer.get(i).hoejde;
		return -1;
	}

	private class Person {
		String cpr;
		String navn;
		double hoejde;
		double vaegt;

		private Person(String cpr, String navn, double hoejde, double vaegt) {
			super();
			this.cpr = cpr;
			this.navn = navn;
			this.hoejde = hoejde;
			this.vaegt = vaegt;
		}

		public String toString(){
			return cpr + " " + navn;
		}
	}
}
