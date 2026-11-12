class Superclass {
    int number = 56;
}

class Subclass extends Superclass {
    int number = 96;
    void printNumber() {
        System.out.println(number);
    }
}

class acc2 {
    public static void main(String[] args) {
        Subclass obj = new Subclass();
        obj.printNumber();
    }
}