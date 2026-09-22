class Animal {
    void eat() {
        System.out.println("eating...Animal class...eat method");
    }
}

class lion extends Animal {
    void roar() {
        System.out.println("roaring...Lion class ...roar method");
    }
}

class Babylion extends lion {
    void weep() {
        System.out.println("weeping...Babylion class ...weep method");
    }
}

class inherit1 {
    public static void main(String[] args) {
        Babylion obj = new Babylion();
        obj.weep();
        obj.roar();
        obj.eat();
    }
}