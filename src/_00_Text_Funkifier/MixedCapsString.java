package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		char[] arr = s.toCharArray();
		String mix = "";
		for(int i = 0; i < arr.length; i++) {
			if(i % 2 == 0) {
				mix += (arr[i] + "").toLowerCase();
			}else {
				mix += (arr[i] + "").toUpperCase();
			}
		}
		return mix;
	}

}
