package net.nata.pattern.example.step1.action.quack;

public interface QuackBehavior {
	void quack();
	default void display() {
		System.out.println("quack : " +this.getClass().getName());
	};
}
