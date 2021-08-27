package ObjectArrays;

public class Friend {

    private String name;
    private int age;

    public Friend(String n, int a) {
        name = n;
        age = a;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String n) {
        name = n;
    }

    public void setAge(int a) {
        age = a;
    }

    public int compareTo(Friend b){
        
        return this.name.compareTo(b.getName());
    }

    public String toString() {
        return name + " " + age;
    }
}
