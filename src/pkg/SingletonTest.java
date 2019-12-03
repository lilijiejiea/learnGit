package pkg;

public class SingletonTest {
    //懒汉式单例类.在第一次调用的时候实例化自己
    private SingletonTest() {}
    private static SingletonTest single=null;
    //静态工厂方法
    public static SingletonTest getInstance() {
        if (single == null) {
            single = new SingletonTest();
            System.out.println("创建一次");
        }
        return single;
    }

    public void show(){
        System.out.println("我是show");
    }

}