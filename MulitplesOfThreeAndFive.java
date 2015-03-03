package multiplesOfThreeAndFive;

public class MulitplesOfThreeAndFive {
	
	
	
	

		public int MultipleOfThreeAndFive(int target) {
			int i = 0; 
			int total = 0;
			
			while ((++i < target)) {//begin while1
				
				
				if ((i % 5 == 0) || (i % 3 == 0)) { //begin if1
					 total +=  i;
				
				}//end if1
				
				
			}//end while1
			
			System.out.println(total);//output sum
			return total;
			

		}//end

	}//end



