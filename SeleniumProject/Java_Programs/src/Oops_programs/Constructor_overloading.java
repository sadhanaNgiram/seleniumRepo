package Oops_programs;

public class Constructor_overloading {
	int id;
	String name;
	int roll_no;

	Constructor_overloading(int i,String n){
		id=i;
		name=n;
	}
	Constructor_overloading(int i,String n,int roll){
		
		id=i;
		name=n;
		roll_no=roll;
	}
	void display() {
		
		System.out.println(id +" " +name +roll_no);
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Paramiterized_constructor pc=new Paramiterized_constructor(11,"Sadhana",101);
			Paramiterized_constructor pc1=new Paramiterized_constructor(11,"Sadhana");

			pc.display();
			pc1.display();
		}

	}

