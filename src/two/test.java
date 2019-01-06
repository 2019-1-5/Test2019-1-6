package two;

public class test {
	public static void main(String[] args) {
		computer1 c = new computer1();
		c.s();
	}
}
class computer1{
	private void save() {
		System.out.println("保存正在运行中的程序");
	}
	private void shut() {
		System.out.println("关闭正在运行中的程序");
	}
	private void down() {
		System.out.println("关机系统");
	}
	private void supply() {
		System.out.println("断电源");
	}
	public void s() {
		save();
		shut();
		down();
		supply();
	}
}
