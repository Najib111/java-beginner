public class Human {
    String name;
    int age;
    int weight;
    String eyeColor;


    public Human(String name, int age, int weight, String eyeColor) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.eyeColor = eyeColor;

    }

    public void run() {
        System.out.println(this.name + " is running");
    }

    public void age() {
        System.out.println(this.name + " is " + this.age);
    }

    public void describe() {
        System.out.println("Name: " + this.name + "\nAge: " + this.age + "\nEye Color: " + this.eyeColor + "\nWeight: " + this.weight + "kg");
    }

    public void sleep() {
        System.out.println(this.name + " sleeping");
    }

    public void eat() {
        System.out.println(this.name + " eating");
    }
}