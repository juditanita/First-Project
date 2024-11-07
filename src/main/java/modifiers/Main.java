package modifiers;

public class Main {
   public static void main(String[] args) {
       Person person = new Person();
       person.name = "Judit";
       person.address = "34 Address";
       person.ssn = 3;
       person.setAge(23);
      int personAge = person.getAge();
       System.out.println();
       System.out.println(person.address);
       System.out.println(person.name);
   }
}
