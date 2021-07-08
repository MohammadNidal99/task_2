package jo.secondstep.algorithms;

public class Quick implements Sort{

	@Override
	public void sort(int[] data) { 
		quickSort(data, 0, data.length-1);
		
	}
	
public static void quickSort(int[] data, int start, int end) {
		
		if(end == start) {
			return;
		}
		
		int p = end;
		int i = start - 1;
		int j = start;
		
		while(j < p) {
			if(data[j] < data[p]) {
				i++;
				int temp = data[j];
				data[j] = data[i];
				data[i] = temp;
			}
			j++;
		}
		
		int temp = data[p];
		data[p] = data[i+1];
		data[i+1] = temp;
		
		if(i != start - 1) {
			quickSort(data, start, i);
		}
		
		if(i+2 <= end) {
			quickSort(data, i+2, end);
		}
		
		
		
	}

}
