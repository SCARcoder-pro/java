class Mammals {
    void mam() {
        System.out.println("Inside Mammals Class");
    }
}

class Lion extends Mammals {
    void roar() {
        System.out.println("Inside Lion Class");
    }
}

class Human extends Mammals {
    void hum() {
        System.out.println("Inside Human Class");
    }
}

class inh2 {
    public static void main(String[] args) {
        Lion l = new Lion();
        l.roar();
        l.mam();
        Human h = new Human();
        h.hum();
    }
}