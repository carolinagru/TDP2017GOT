package probar;

public class Dos extends Uno{

	public Dos() {
		
	}
	public int f() {
		return super.f()+h();
	}
	public int h() {
		return 20;
	}
}
