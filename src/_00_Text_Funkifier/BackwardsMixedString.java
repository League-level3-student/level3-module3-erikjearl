package _00_Text_Funkifier;

public class BackwardsMixedString extends SpecialString{

	public BackwardsMixedString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String str = "";
		char[] arr = s.toCharArray();
		for(int i = arr.length-1; i >= 0; i--) {
			str += arr[i];
		}
		String str2 = "";
		char[] arr2 = str.toCharArray();
		for(int i = 0; i < arr2.length; i++) {
			if(i % 2 == 0) {
				str2 += (arr2[i] + "").toLowerCase();
			}else {
				str2 += (arr2[i] + "").toUpperCase();
			}
		}
		return str2;
	}

}
