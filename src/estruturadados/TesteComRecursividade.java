package estruturadados;

public class TesteComRecursividade {

	public static void main(String[] args) {
		System.out.println(fatorialN�oRecursivo(5));
		System.out.println(fatorialRecursivo(5));
		for (int i = 0; i < 10; i++) {
			System.out.print(fibonacci(i) + " ");
		}
	}

	public static Integer fatorialN�oRecursivo(Integer num) {
		Integer total = 1;
		if (num == 0)
			return 1;

		for (int i = num; i > 1; i--) {
			total *= i;
		}
		return total;
	}

	public static Integer fatorialRecursivo(Integer num) {

		if (num == 0) {
			return 1;
		}
		return num * fatorialRecursivo(num - 1);
	}

	
	// Resolvendo a equa��o de fibonacci com recursividade
	public static Integer fibonacci(Integer numero) {

		if (numero < 2) {
			return 1;
		}

		return fibonacci(numero - 1) + fibonacci(numero - 2);
	}

}
