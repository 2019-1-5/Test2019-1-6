package two;

public class test {
	public static void main(String[] args) {
		computer1 c = new computer1();
		c.s();
	}
}
class computer1{
	private void save() {
		System.out.println("�������������еĳ���");
	}
	private void shut() {
		System.out.println("�ر����������еĳ���");
	}
	private void down() {
		System.out.println("�ػ�ϵͳ");
	}
	private void supply() {
		System.out.println("�ϵ�Դ");
	}
	public void s() {
		save();
		shut();
		down();
		supply();
	}
}
