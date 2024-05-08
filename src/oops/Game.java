package oops;

public class Game {

	void play(int a) {
		System.out.println("pubg");
		
	}

	void play(int a ,int b) {
		System.out.println("freefire");
	}

	void play(int a ,int b, int c) {
		System.out.println("cod");
	}
	public static void main(String[] args) {
		Game ref = new Game();
		ref.play(11);
		ref.play(11, 03);
        ref.play(11,03 , 1997);
	}

}
