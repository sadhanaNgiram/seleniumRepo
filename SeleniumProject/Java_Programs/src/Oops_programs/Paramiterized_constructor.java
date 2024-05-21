package Oops_programs;

public class Paramiterized_constructor {
int id;
String name;

Paramiterized_constructor(int i,String n){
	id=i;
	name=n;
}
void display() {
	
	System.out.println(id +" " +name);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Paramiterized_constructor pc=new Paramiterized_constructor(11,"Sadhana");
		Paramiterized_constructor pc1=new Paramiterized_constructor(11,"Sadhana");

		pc.display();
		pc1.display();
	}

}
