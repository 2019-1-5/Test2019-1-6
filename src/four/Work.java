package four;

interface car{
	void run();
}
class biyadi implements car{

	@Override
	public void run() {
		System.out.println("�����Ǳ��ǵ�");
		
	}
	
}
class benchi implements car{

	@Override
	public void run() {
		System.out.println("�����Ǳ���");
		
	}
	
}
interface Food{
	void eat();
}
class Hbb implements Food{

	@Override
	public void eat() {
		System.out.println("�����Ǻ�����");
		
	}
	
}
class Cola implements Food{

	@Override
	public void eat() {
		System.out.println("�����ǿ���");
		
	}
	
}
interface Factor {
	car getcar();
	Food getFood();
}
class bydHbbFactor implements Factor{

	@Override
	public car getcar() {
		
		return new biyadi();
	}

	@Override
	public Food getFood() {
		// TODO Auto-generated method stub
		return new Hbb();
	}
	
	
}
class benchiColaFactor implements Factor{

	@Override
	public car getcar() {
		
		return new benchi();
	}

	@Override
	public Food getFood() {
		// TODO Auto-generated method stub
		return new Cola();
	}
	
	
}


//===================================================================
public class Work {
	public static void main(String[] args) {
		benchiColaFactor b = new benchiColaFactor();
		System.out.println(b.getcar());
	}
}
