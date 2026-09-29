class Student {
    private String name;
    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }
}

public class set {
    public static void main(String[] args) {
        Student s = new Student();
        s.setname("Aashish @Codingal");
        System.out.println(s.getname());
    }
}