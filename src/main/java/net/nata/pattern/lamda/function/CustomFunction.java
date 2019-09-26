package net.nata.pattern.lamda.function;


@FunctionalInterface
public interface CustomFunction {
	String init(Long x, int d);
	//추상메서드 1, 매개변수 자유로움, 반환도 자유로움, static 생성은 가능.
	//이걸 만든 이유가 뭐지...
	//함수형 인터페이스를 만드는거군요. 이걸 람다로 생성할수도 있군용.
   public static String add() {
        return null;
   }
}
