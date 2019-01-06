package one;


interface traffic{
	void run();
}

class bicycle implements traffic{
	@Override
	public void run() {
		System.out.println("我是自行车");
	}	
}

class person{
	void util(traffic t) {
		System.out.println("走一个");
		t.run();
	}
	
}
//=====================================================
public class test {
	public static void main(String[] args) {
		person p = new person();
		bicycle b = new bicycle();
		RedHorse r = new RedHorse();
		aircraft a = new aircraft();
		p.util(b);
		p.util(r);
		p.util(a);
	}
}
class RedHorse implements traffic{

	@Override
	public void run() {
		System.out.println("我是赤兔马");
	}
	
}

class aircraft implements traffic{

	@Override
	public void run() {
		System.out.println("我是灰机");
	}
	
}

















