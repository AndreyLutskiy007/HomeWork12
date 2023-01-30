public class Main {
    public static void main(String[] args) {
        Person sarah = new Person("Sarah", 30);
        System.out.println("sarah.name = " + sarah.getName());
        System.out.println("sarah.age = " + sarah.getAge());
        sarah.setAge(31);
        System.out.println("sarah.getAge() = " + sarah.getAge());
        Person jon = new Person("Jon", 13);
        System.out.println("jon.name = " + jon.getName());
        System.out.println("jon.age = " + jon.getAge());
    }

}