package net.nata.pattern.example.step1.action.fly;

public interface FlyBehavior {
	void fly();
	default void display() {
		System.out.println("fly : " +this.getClass().getName());
	};
}
