package ud4;

import java.util.Scanner;

public class ArrayyFunciones_C_NoeG {
	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int tam = 5; 
		double nums [] = new double [tam];
		double resultado = 0;
		double numBuscado;
		//direccion de memoria
		System.out.println("direccion de memoria" + nums);
		rellenaArray(nums);
		
		//devolver array original
		System.out.println("Tu array es: ");
		muestraArray(nums);
		
		//devolver suma de todos los nº del array:
		sumarElementos(nums);
		resultado = sumarElementos(nums);
		System.out.println("La suma de todos los numeros de tu array es :" + resultado);
		
		//devolver resta de todos los nº del array:
		restarElementos(nums);
		resultado = restarElementos(nums);
		System.out.println("La resta de todos los numeros de tu array es :" + resultado);
		
		//devolver multiplicacion de todos los nº del array:
		multiplicarElementos(nums);
		resultado = multiplicarElementos(nums);
		System.out.println("La multiplicacion de todos los numeros de tu array es :" + resultado);
		
		//devolver division de todos los nº del array:
		dividirElementos(nums);
		resultado = dividirElementos(nums);
		System.out.println("La division de todos los numeros de tu array es :" + resultado);
		
		//devolver el promedio de todos los nº del array:
		calcularPromedio(nums);
		resultado = calcularPromedio(nums);
		System.out.println("El promedio de todos los numeros de tu array es :" + resultado);
		
		//devolver el valor maximo del array
		encontrarMaximo(nums);
		resultado = encontrarMaximo(nums);
		System.out.println("El valor máximo de tu array es :" + resultado);
		
		//devolver el valor mínimo del array
		encontrarMinimo(nums);
		resultado = encontrarMinimo(nums);
		System.out.println("El valor mínimo de tu array es :" + resultado);
	
		//devolver array inverso
		System.out.println("Tu array inverso es: ");
        double[] numsInverso = invertirArray(nums);
        muestraArray(numsInverso);
		
		//pedimos un numero para la funcion buscar
		System.out.println("Introduce el numero para buscar: ");
		double busqueda = entrada.nextDouble();
		if (buscarNumero(nums, busqueda) == true) {
			System.out.println("Si se encuentra en el array");
		}
		else {
			System.out.println("No se encuentra en el array");
		}
	}
	//Hacer una función principal que lea 5 números por teclado y pruebe los siguiente métodos (no es necesario un menú):
	
	//rellenamos el array 
	public static double[] rellenaArray(double nums[]) {
		for (int i =0 ; i< nums.length; i++) {
			System.out.println("Introduce un numero: ");
			nums[i]=entrada.nextInt();
		}
		return nums;
	}
	public static void muestraArray(double[] nums) {
		for (int i =0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
	/**
	 * Calcula la suma de todos los elementos en un array.
	 * @param array El array de números.
	 * @return La suma de los elementos.
	 */
	public static double sumarElementos(double[] nums) {
		double suma = 0;
		for (int i =0; i<nums.length; i++) {
			suma = suma + nums[i];
		}
		return suma;
	}
	/**
	 * Calcula la resta de todos los elementos en un array.
	 * @param array El array de números.
	 * @return La resta de los elementos.
	 */
	public static double restarElementos(double[] nums){
		double resta = nums[0];
		for (int i =1; i<nums.length; i++) {
			resta = resta - nums[i];
		}
		return resta;
	}
	/**
	 * Calcula la multiplicación de todos los elementos en un array.
	 * @param array El array de números.
	 * @return La multiplicación de los elementos.
	 */
	public static double multiplicarElementos(double[] nums) {
		double multi = nums[0];
		for (int i =0; i<nums.length; i++) {
			multi = multi * nums[i];
		}
		return multi;
	}
	/**
	 * Calcula la división de todos los elementos en un array.
	 * @param array El array de números.
	 * @return La división de los elementos.
	 */
	public static double dividirElementos(double[] nums) {
		double divi = nums[0];
		for (int i =0; i<nums.length; i++) {
			 if (nums[i] != 0) {
		            divi = divi / nums[i];}
			 else {
			System.out.println("No se puede dividir por cero");
			System.out.println("Introduce un nuevo numero");
			nums[i] = entrada.nextDouble();
			divi = divi / nums[i];}
		}
		return divi;
	}
	/**
	 * Calcula el promedio de todos los elementos en un array.
	 * @param array El array de números.
	 * @return El promedio de los elementos.
	 */
	public static double calcularPromedio(double[] nums) {
		double media = sumarElementos(nums)/nums.length;
		return media;
	}
	/**
	 * Encuentra el valor máximo en un array.
	 * @param array El array de números.
	 * @return El valor máximo en el array.
	 */
	public static double encontrarMaximo(double[] nums) {
		double max = nums[0];
		for(int i = 1; i<nums.length;i++) {
			if (nums[i]>max) {
				max = nums[i];
			}
		}
		return max;	
	}
	/**
	 * Encuentra el valor mínimo en un array.
	 * @param array El array de números.
	 * @return El valor mínimo en el array.
	 */
	public static double encontrarMinimo(double[] nums) {
		double min = nums[0];
		for(int i = 1; i<nums.length;i++) {
			if (nums[i]<min) {
				min = nums[i];
			}
		}
		return min;	
	}

	/**
	 * Calcula la suma acumulada de los elementos en un array.
	 * @param array El array de números.
	 * @return Un nuevo array con la suma acumulada de los elementos.
	 //no se hacerlo ni se a que te refieres
	public double[] sumaAcumulada(double[] array);*/
	/**
	 * Invierte el orden de los elementos en un array.
	 * @param array El array de números.
	 * @return Un nuevo array con el orden invertido de los elementos.
	 */
	public static double[] invertirArray(double[] nums) {
		double numsInv [] = new double [nums.length];
		int j = nums.length -1;
		for (int i = 0; i< nums.length; i++) {
			numsInv[i]=nums[j];
			j--;
		}
		return numsInv;//no lo entiendo
	}
	/**
	 * Verifica si un número específico está presente en el array.
	 * @param array El array de números.
	 * @param numero El número a buscar.
	 * @return true si el número está presente, false en caso contrario.
	 */
	public static boolean buscarNumero(double[] nums, double numero) {
		for (int i = 0; i < nums.length; i++) {
			if (numero == nums[i]) {
				System.out.println("El numero introducido se encuentra en la posicion: " + (i+1));
				return true;
			}
		}
		return false;
	}
}
