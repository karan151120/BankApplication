package class2;

public class Main {
    public static void main(String[] args) {
       //without static we have to write MANOJSIR repeatedly but class teacher name is same

        /* ClassRoom student = new ClassRoom(1, "Akshay", "manojSir", "1234");
        ClassRoom student1 = new ClassRoom(1, "Akku", "manojSir", "1234");
        ClassRoom student2 = new ClassRoom(1, "Ajay", "manojSir", "1234");

        */

        //with static define classTeacher name once result save in time ans space

        ClassRoom.classTeacher = "ManojSir";

        ClassRoom student = new ClassRoom(1, "Akshay", "1234");
        ClassRoom student1 = new ClassRoom(1, "Akku", "1234");
        ClassRoom student2 = new ClassRoom(1, "Ajay", "1234");
    }
}
