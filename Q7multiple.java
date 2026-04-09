class A {
    void show() {
        System.out.println("A");
    }
}

class B extends A {
    void b() {
        System.out.println("B");
    }
}

class C extends A {
    void c() {
        System.out.println("C");
    }
}

class Test3 {
    public static void main(String[] args) {
        B obj1 = new B();
        obj1.show();
        obj1.b();

        C obj2 = new C();
        obj2.show();
        obj2.c();
        
    }
}