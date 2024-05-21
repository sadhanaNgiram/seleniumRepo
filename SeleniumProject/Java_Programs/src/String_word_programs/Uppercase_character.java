package String_word_programs;

public class Uppercase_character {
	int count=0;
	public void upper(String s) {
		for(int i=0;i<s.length();i++) {
			
			char c=s.charAt(i);
			if(Character.isUpperCase(c))
				//System.out.println(c);
			count++;
			
		}
		System.out.println(count +"upper");
	}
public static void main(String[] args) {
	Uppercase_character uc=new Uppercase_character();
	uc.upper("SAAdhna is My Name");
	
}

}
