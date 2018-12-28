public class Task {
    protected TaskType type;
    protected String name;
    protected Responder responder;

    public Task(TaskType type, String name, Responder responder) {
        this.type = type;
        this.name = name;
        this.responder = responder;
    }
}
