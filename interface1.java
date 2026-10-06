interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog says berk berk ");
    }
}


interface Footballplayer {
    void play();
}

class Cristiano_Ronaldo implements Footballplayer {
    public void play() {
        System.out.println("He is G.O.A.T");
    }
}

class Messi implements Footballplayer {
    public void play() {
        System.out.println("He is also G.O.A.T");
    }
}

public class interface1 {
    public static void main(String[] args) {
        Cristiano_Ronaldo cr = new Cristiano_Ronaldo();
        Messi m = new Messi();
        cr.play();
        m.play();
    }
}