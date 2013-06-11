
public class test {

	public test(){
		
	}
	
    
	public int[][] rotate(int[][] matrix, int n) {
		int temp=0;
		for(int layer=0; layer<n/2; layer++){
			int length = n - 2 * layer;
			for(int i=0; i < length -1; i++){
		
				temp=matrix[layer][layer+i];
			
				matrix[layer][layer+i]=matrix[n-1-layer-i][layer];
			
				matrix[n-1-layer-i][layer]=matrix[n-1-layer][n-1-layer-i];
			
				matrix[n-1-layer][n-1-layer-i]=matrix[layer+i][n-1-layer];
			
				matrix[layer+i][n-1-layer]=temp;

			}
		}
		return matrix;
	}
}
