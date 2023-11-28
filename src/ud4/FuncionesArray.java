package ud4;

import java.util.Scanner;

public class FuncionesArray {
	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		int[] nums = new int [3];
		nums = rellenaArray(nums);
		muestraArray(nums);

	}
	public static int[] rellenaArray(int[] nums) {
		for (int i = 0; i<nums.length; i++) {
			System.out.println("intro un nº: ");
			nums[i] = entrada.nextInt();
		}
		return nums;
	}
	public static void muestraArray(int[] nums) {
		for (int i =0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
}
