public class Main {
    public static void main(String[] args) {
      Course course = new Course();
      course.cheer();

      //abstract one
        //abstract can not be instantiated
        //Animal animal = new Animal();
        Dog dog = new Dog();
        dog.talk();


        //FINAL

        College college = new College();
        System.out.println(college.getSTUDENTCAP());

    }
}
