package LinkedList;

public class Minion {
    private int age;
    private String name;
    private int eyes;
// age по возрастанию, name в алвафитном, eyes по убыванию
    public Minion(int age, String name, int eyes) {
        setAge(age);
        setName(name);
        setEyes(eyes);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getEyes() {
        return eyes;
    }

    @Override
    public String toString() {
        return "Minion " + name + ", " + age + " y.o., " + eyes + " eyes";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Minion minion = (Minion) obj;

        return age == minion.age && name.equals(minion.name);
    }
}
