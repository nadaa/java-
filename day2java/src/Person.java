import java.util.ArrayList;

public class Person {

    static int counter;
    String firstName;
    String lastName;
    int Age;
    private String address;
    int dateOfBirth;
    String nationality;
    String city;
    private double weight;
    private double height;
    boolean isMale;
    ArrayList<Task>  taskList=null;



   public Person( String firstName, String lastName, int Age, String address, int dateOfBirth, String nationality, String city, double weight, double height, boolean isMale) {
       counter+=1;
       this.firstName=firstName;
       this.lastName= lastName;
       this.Age = Age;
       this.address = address;
       this.dateOfBirth = dateOfBirth;
       this.nationality = nationality;
       this.city  = city;
       this.weight= weight;
       this.height = height ;
       this.isMale = isMale;
       taskList=new ArrayList<>();
   }
    public void setAddress(String address){
       this.address=address;

    }
    public String getAddress(){
       return address;
    }
    public String getFullName(){
     return firstName+" "+lastName;
        //System.out.println(firstName + lastName );
    }
    public double getHeightInFeet(){
    return height*0.0328084;

    }
    public int getAge(){
            return Age;

    }
    public void eating(){
        System.out.println("I'm eating ");
        weight+=1;

    }
    public void getInfo(){

        System.out.println(counter);
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(Age);
        System.out.println(address);
        System.out.println(dateOfBirth);
        System.out.println(nationality);
        System.out.println(city);
        System.out.println(weight);
        System.out.println(height);
        System.out.println(isMale);
    }
    public void assignTask(Task task){
        System.out.printf("task added");
       taskList.add(task);

    }
    public void deleteTask(int index){
        System.out.printf("task deleted");
        taskList.remove(index);

    }
    public int countTasks(){
       return taskList.size();
    }

}
