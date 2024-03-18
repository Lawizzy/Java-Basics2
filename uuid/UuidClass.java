package uuid;

import java.util.UUID;

public class UuidClass {

	public static void main(String[] args) {

		/*
		 * UUID:
		 * 128 bit value
		 * Unique with numbers and characters
		 * Universally unique
		 */

		for(int i=1; i<=10; i++) {
			System.out.println(UUID.randomUUID());
		}
	}

}
