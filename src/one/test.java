package one;


interface traffic{
	void run();
}

class bicycle implements traffic{
	@Override
	public void run() {
		System.out.println("�������г�");
	}	
}

class person{
	void util(traffic t) {
		System.out.println("��һ��");
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
		System.out.println("���ǳ�����");
	}
	
}

class aircraft implements traffic{

	@Override
	public void run() {
		System.out.println("���ǻһ�");
	}
	
}

















