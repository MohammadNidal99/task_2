package jo.secondstep.algorithms;

public class Main {
	
	public static void main(String[] args) {
		int[] data = {5, 2, 6, 8, 7, 3};
		
		System.out.println("************* Before ***************");
		
		for(int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
		
		System.out.println();
		
		//Quick quick = new Quick();
		//Selection selection = new Selection();
		//Bubble bubble = new Bubble();
		//Merge merge = new Merge();
		//merge.sort(data);
		//bubble.sort(data);
		//selection.sort(data);
		//quick.sort(data);
		
		
		System.out.println("************* After ***************");
		
		for(int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
		
	}

}
