class Mammals {
    void mam() {
        System.out.println("Inside Mammals class");
    }
}

class Lion extends Mammals {
    void roar() {
        System.out.println("Inside Lion class");
    }
}

class Human extends Mammals {
    void hum() {
        System.out.println("Inside Human");
    }
}

class inherit2 {
    public static void main(String[] args) {
        Lion l = new Lion();
        l.roar();
        l.mam();
        Human h = new Human();
        h.hum();
    }
}