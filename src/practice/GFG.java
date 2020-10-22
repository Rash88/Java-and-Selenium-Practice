package practice;

public class GFG {

	public static void main(String[] args) {
		
		 public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list) 
		    { 
		  
		        // Create a new ArrayList 
		        ArrayList<T> newList = new ArrayList<T>(); 
		  
		        // Traverse through the first list 
		        for (T element : list) { 
		  
		            // If this element is not present in newList 
		            // then add it 
		            if (!newList.contains(element)) { 
		  
		                newList.add(element); 
		            } 
		        } 
		  
		        // return the new list 
		        return newList; 
		    } 
		// TODO Auto-generated method stub

	}

}
