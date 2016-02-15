package test;

interface SuperInterface {
    void methodA();
}

abstract class A implements SuperInterface {
  protected abstract void methodB();
}

public class C extends A {
  public void methodA() { System.out.println("method A");}

  protected void methodB() {System.out.println("method B");}

  public static void main(String ... a) {
    C c = new C();
    c.methodA();
    c.methodB();
    c.caller();
  }

  void caller() {
    methodA();
    methodB();
  }
}
