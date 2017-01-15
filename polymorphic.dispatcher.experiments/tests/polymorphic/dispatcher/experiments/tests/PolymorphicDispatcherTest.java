package polymorphic.dispatcher.experiments.tests;

import static org.junit.Assert.assertEquals;

import org.eclipse.xtext.util.PolymorphicDispatcher;
import org.junit.Before;
import org.junit.Test;

import polymorphic.dispatcher.experiments.tests.Types.A;
import polymorphic.dispatcher.experiments.tests.Types.B;
import polymorphic.dispatcher.experiments.tests.Types.C;
import polymorphic.dispatcher.experiments.tests.Types.D;
import polymorphic.dispatcher.experiments.tests.Types.S;
import polymorphic.dispatcher.experiments.tests.Types.S1;

public class PolymorphicDispatcherTest {

	public String test(S s) {
		return "test(S)";
	}

	public String test(S1 s) {
		return "test(S1)";
	}

	public String test(A a) {
		return "test(A)";
	}

	public String test(B b) {
		return "test(B)";
	}

	public String test(C c) {
		return "test(C)";
	}

	protected Object target;

	protected PolymorphicDispatcher<String> invoker;

	@Before
	public void init() {
		target = new PolymorphicDispatcherTest();
		invoker = PolymorphicDispatcher.createForSingleTarget("test", target);
	}

	@Test
	public void testA() {
		assertEquals("test(A)", invoker.invoke(new A()));
	}

	@Test
	public void testB() {
		assertEquals("test(B)", invoker.invoke(new B()));
	}

	@Test
	public void testC() {
		assertEquals("test(C)", invoker.invoke(new C()));
	}

	@Test
	public void testD() {
		assertEquals("test(S)", invoker.invoke(new D()));
	}

	@Test
	public void testS() {
		assertEquals("test(S)", invoker.invoke(new S()));
	}

	@Test
	public void testS1() {
		assertEquals("test(S1)", invoker.invoke(new S1()));
	}
}
