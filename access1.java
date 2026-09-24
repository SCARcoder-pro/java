class Parent {
    public void sayHello() {
        System.out.println("Hello from Parent");
    }
}

class Child extends Parent {
    public void sayHello() {
        System.out.println("Hello from Child");
    }
}

class access1 {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.sayHello();
    }
}