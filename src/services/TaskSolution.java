package services;

public abstract class TaskSolution {
	String str;
	
	protected abstract void input(String str);
	protected abstract void process();
	protected abstract void output();
}
