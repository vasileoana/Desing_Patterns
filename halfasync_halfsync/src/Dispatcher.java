public class Dispatcher {
    private WorkQueue workQueue = new WorkQueue();

    public void doTask(Task task) {
        if (task.type == TaskType.SHORT) {
            ((SyncTask) task).doTask();
        } else {
            workQueue.enqueue((AsyncTask) task);
        }
    }
}
