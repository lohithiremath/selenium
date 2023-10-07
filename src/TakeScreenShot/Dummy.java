package TakeScreenShot;

public class Dummy {
static Dummy obj=new Dummy();
public static void main(String[] args) {
	Dummy obj=new Dummy();
	System.out.println(obj.obj);
	System.out.println(obj);
	obj.test();
	obj.test();
}
public void test() {
	System.out.println("hi");
}
}
--