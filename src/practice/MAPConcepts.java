package practice;

import java.util.HashMap;

public class MAPConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		
				/*
				 * Hashmap implements map interface. It cntains only unique elemets. It contains
				 * data in the form of key value pair.
				 * It may have one null key and multiple null values.
				 * It mantains no order
				 */

				HashMap<Integer, String> hm = new HashMap<Integer, String>(); 
				hm.put(1, "Rash");
				hm.put(2, "Faisal");
				hm.put(3,"Rohit");
				
				//System.out.println(hm.get(1));
				hm.put(null, "Rekha");
				for(int i = 1; i<=hm.size(); i++)
				{
					System.out.println(hm.get(i));
				}


	}

}
