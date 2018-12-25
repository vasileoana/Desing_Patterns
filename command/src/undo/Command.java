package undo;

public interface Command {
    void executa();
    void unexecute();
}
