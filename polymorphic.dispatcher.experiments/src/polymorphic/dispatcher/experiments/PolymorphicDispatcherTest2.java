package polymorphic.dispatcher.experiments;

import org.eclipse.xtext.util.PolymorphicDispatcher;

public class PolymorphicDispatcherTest2 {

	private static class S {
	}

	private static class A extends C {
	}

	private static class B extends S {
	}

	private static class C extends S {
	}

	private static class D extends S {
	}

	public void test(S s) {
		System.out.println("test(S)");
	}

	public void test(A a) {
		System.out.println("test(A)");
	}

	public void test(B b) {
		System.out.println("test(B)");
	}

	public void test(C c) {
		System.out.println("test(C)");
	}

	public static void main(String[] args) {
		PolymorphicDispatcherTest2 target = new PolymorphicDispatcherTest2();
		PolymorphicDispatcher<Object> invoker = PolymorphicDispatcher.createForSingleTarget("test", target);

		invoker.invoke(new A());
		invoker.invoke(new B());
		invoker.invoke(new C());
		invoker.invoke(new D());
	}
}
