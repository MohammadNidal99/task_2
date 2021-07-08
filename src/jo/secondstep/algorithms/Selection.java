package jo.secondstep.algorithms;

public class Selection implements Sort{

	@Override
	public void sort(int[] data) { 

		int temp;
		System.out.println();
		
		for(int i = 0; i<data.length; i++) {
			int min = i;
			for(int j = i + 1; j < data.length; j++) {
				if(data[j] < data[min]) {
					min = j; 
				}
				
			}
			temp = data[i];
			data[i] = data[min];
			data[min] = temp;
		}
		
	}
	
	

}
