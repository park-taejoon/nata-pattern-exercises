package net.nata.pattern.lamda.function;


@FunctionalInterface
public interface Consumer {
	String init();
	//추상메서드 1, 매개변수 자유로움, 반환도 자유로움, static 생성은 가능.
   public static String add() {
        return null;
   }
}
