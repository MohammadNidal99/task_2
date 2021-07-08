package jo.secondstep.algorithms;

public class Merge implements Sort{

	@Override
	public void sort(int[] data) {
		
		partitioning(data,0, data.length-1);
	}
	
	public void partitioning(int[] data, int start, int end) { 
		if(start < end) {
			int middle = (end + start) / 2; 
			partitioning(data, start, middle);
			partitioning(data, middle + 1, end);
			merge(data, start, middle, end);
		}
		
	}
	
public static void merge(int[] data, int start, int middle, int end) {
		
		int i = start;
		int j = middle + 1;
		int k = 0;
		int[] temp = new int[end+1];
		
		while(i <= middle && j <= end) {
			if(data[i] <= data[j]) {
				temp[k] = data[i];
				i++;
			}
			else {
				temp[k] = data[j];
				j++;
			}
			k++;
		}
		
		while(j <= end) {
			temp[k] = data[j];
			k++;
			j++;
		}
		
		while(i <= middle) {
			temp[k] = data[i];
			k++;
			i++;
		}
		
		for(i = start; i <= end; i += 1) {
			data[i] = temp[i - start];
		}
		
		
	}

}
