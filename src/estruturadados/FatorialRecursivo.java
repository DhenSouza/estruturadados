package estruturadados;

public class FatorialRecursivo {
	
	public static void main(String[] args) {
		int result = 0;
		
		result = fatorialRecursivo(4);
		
		
		System.out.println(result);
	}
	
	public static  int fatorialRecursivo(int num) {
        if(num == 0) {
            return 1;
        }
        
        return  num * fatorialRecursivo(num-1);
    }

}
