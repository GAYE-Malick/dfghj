package s2017_2018;

public class A  {
	private String f; 
	private void f() {
		this.g(); // 3 VRAIE
		 this.h(); // 5 VRAIE
		
	};
//	{ /* definition de f () */ ...}
	protected String g;
	protected void g() {
		this.f(); // 1 VRAIE
		 this.h(); // 6 VRAIE
		
	};
	//{...}
	public String  h;
	public void h() {
		this.f(); // 2 VRAIE
		this.g(); //4 VRAIE
		
	};
	//{...}

}
