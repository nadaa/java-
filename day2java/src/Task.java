public class Task {
    static int taskNo=0;
    String taskName;
    boolean isDone;
    public Task(){
        taskNo+=1;
    }

    public Task(String taskName,boolean isDone){
        this.taskName=taskName;
        this.isDone=isDone;
    }
    public int getTaskNo(){
        return taskNo;
    }

    public void modifyTask( String taskName,boolean isDone){
       this.taskName=taskName;
        this.isDone=isDone;
    }
    public void runTask( String taskName,int time) throws InterruptedException{
        System.out.println(taskName+"the task is running");
        Thread.sleep(time);
        isDone=true;
        System.out.println("the task is done");

    }






}
