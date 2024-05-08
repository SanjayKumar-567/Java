package oops;

public class Facebooknew extends Facebookold {
	@Override
	void reaction(){
		System.out.println("like,sad,love,anger,care");
	}
public static void main(String[] args) {
	Facebookold fb = new Facebookold();
	fb.reaction();
	Facebooknew obj= new Facebooknew();
	obj.reaction();
	Facebookold  ref = new Facebooknew();//upcasting
	ref.reaction();

}
}
