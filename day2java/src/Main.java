public class Main {
    public static void main(String[] args) {
        Person people[] = new Person[4];
        people[0] = new Person("alaa", "last", 11, "amman", 2007, "Jordanian", "amman", 12.0, 12.0, true);
        people[1] = new Person("alaa", "last", 11, "amman", 2007, "Jordanian", "amman", 12.0, 12.0, true);
        people[2] = new Person("alaa", "last", 11, "amman", 2007, "Jordanian", "amman", 12.0, 12.0, true);
        people[3] = new Person("alaa", "last", 11, "amman", 2007, "Jordanian", "amman", 12.0, 12.0, true);
        System.out.println(people[0].getAddress());
        Task t = new Task("studying", false);
        Task t1 = new Task("praying", false);
//        try {
////            t.runTask("studying", 2000);
////        }
////        catch(InterruptedException e){
////            System.out.println(e);        }
////
////
people[0].assignTask(t);
people[1].assignTask(t1);
people[0].deleteTask(0);
        System.out.println(people[1].countTasks());
        people[1].deleteTask(0);
        System.out.println(people[1].countTasks());
    }

}
