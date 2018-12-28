public class SyncTask extends Task {
    public SyncTask(String name, Responder responder) {
        super(TaskType.SHORT, name, responder);
    }

    public void doTask(){
        System.out.println("finished sync task: " + name);
    }
}
