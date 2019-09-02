package _00_Text_Funkifier;

public class BackwardsString extends SpecialString {

	public BackwardsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		char[] arr = s.toCharArray();
		String back = "";
		for(int i = arr.length-1; i >= 0; i--) {
			back += arr[i];
		}
		return back;
	}

}
