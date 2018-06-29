package test;
import org.apache.commons.lang.StringUtils;

public class StringPangoli {

	private static String posChar = "abcdefghijklmnopqrstuvxyz";

	public void print_pangoli(int size) {
		int width = size * 4 - 3;
		String value = "";

		for (int i = 1; i < size + 1; i++) {

			for (int j = 0; j < i; j++) {
				value += posChar.charAt(size - j - 1);
				if (value.length() < width) {
					value += "-";
				}
			}

			for (int k = i - 1; k > 0; k--) {
				value += posChar.charAt(size - k);
				if (value.length() < width) {
					value += "-";
				}
			}
            
			value = StringUtils.center(value, width, "-");
			System.out.println(value);
			value = "";
		}

		for (int i = size - 1; i > 0; i--) {
			value = "";

			for (int j = 0; j < i; j++) {
				value += posChar.charAt(size - j - 1);
				if (value.length() < width) {
					value += "-";
				}
			}

			for (int k = i - 1; k > 0; k--) {
				value += posChar.charAt(size - k);
				if (value.length() < width) {
					value += "-";
				}
			}

			value = StringUtils.center(value, width, "-");
			System.out.println(value);
			value = "";
		}
	}

}
