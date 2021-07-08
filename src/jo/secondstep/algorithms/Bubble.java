package jo.secondstep.algorithms;

public class Bubble implements Sort {

	@Override
	public void sort(int[] data) { 
		
		int dataLength = data.length;
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < dataLength; j++) {
				if (j < dataLength - 1) {
					if (data[j] > data[j + 1]) {
						int temp = data[j];
						data[j] = data[j + 1];
						data[j + 1] = temp;
					}
				}
			}
			dataLength--;

		}		
		
	}

}
