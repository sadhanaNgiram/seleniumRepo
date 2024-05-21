package String_word_programs;

public class count_certain_character {

	public static void main(String[] args) {
	int count=0;	// TODO Auto-generated method stub
String s="India Is My country";
for(int i=0;i<s.length();i++) {
	char c =s.charAt(i);
	if(Character.isDigit(c)) {
		if(c=="I") 
		{System.out.println(c);}
		count++;
	}
	System.out.println(count);
}
	}

}
