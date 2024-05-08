package oops;

public class HotstarPremium extends Hotstar {
	@Override
	void watch() {
		System.out.println("fully axcessed , no ads ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Hotstar ref;
System.out.println("free content starts");
ref = new HotstarFree();
ref.login();
ref.watch();
System.out.println("Vip content starts");
ref =new HotstartVip();
ref.login();
ref.watch();
System.out.println("premium content starts");
ref =new HotstarPremium();
ref.login();
ref.watch();
}
}