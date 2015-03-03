package assignment07;

public class MulitplesOfThreeAndFive {//Class
	
	
	
	
/***
 * Method to give you the sum of numbers > target who's factors are 3 or 5
 * @param target = the to stop the method at
 * @return return the sum of all the nums with factors of 3 or 5
 */
		public int MultipleOfThreeAndFive(int target) {
			int i = 0; //Declare i
			int total = 0;//Declare total variable
			
			while ((++i < target)) {//begin while1
				
				
				if ((i % 5 == 0) || (i % 3 == 0)) { //begin if1
					 total +=  i;//Add nums that pass the if statement to total. 
				
				}//end if1
				
				
			}//end while1
			
			//System.out.println(total);//output sum
			return total;
			

		}//end method

	}//end class



