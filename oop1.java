class oop1 {
    int number = 10;
    void increment() {
        number=number+1;
    }

    public static void main(String[] args) {
        oop1 obj1 = new oop1();
        oop1 obj2 = new oop1();
        oop1 obj3 = new oop1();

        obj1.increment();
        obj2.increment();
        obj3.increment();

        System.out.println(obj1.number);
        System.out.println(obj2.number);
        System.out.println(obj3.number);
    }
}