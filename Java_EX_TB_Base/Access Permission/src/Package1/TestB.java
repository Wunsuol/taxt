package Package1;

public class TestB {
    public static void main(String[] args) {
        TestA a=new TestA();
        //变量
        System.out.println("a1="+a.a1);
        System.out.println("a2="+a.a2);
        System.out.println("a3="+a.a3);
//		System.out.println("a4="+a.a4);
        //方法
        a.A();
        a.B();
        a.C();
//		a.D();
    }
}

