package example.jvm.value;
class Person{
    String name;
}


public class Transfer {
    public static void main(String[] args) {
        Person p = new Person();
        p.name="123";
        System.out.println(p.name);
        System.out.println(p);
        changePerson(p);
        System.out.println(p.name);

        int i = 20;
        changeValue(i);
        System.out.println(i);

    }
    public static  void changePerson(Person p){
        System.out.println(p);
        p.name="456";
    }
    public static void changeValue(int i){
        i=30;
    }

}
