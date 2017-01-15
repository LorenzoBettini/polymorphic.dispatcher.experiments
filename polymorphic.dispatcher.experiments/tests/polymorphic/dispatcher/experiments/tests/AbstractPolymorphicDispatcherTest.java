package polymorphic.dispatcher.experiments.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import polymorphic.dispatcher.experiments.IPolymorphicDispatcher;
import polymorphic.dispatcher.experiments.tests.Types.A;
import polymorphic.dispatcher.experiments.tests.Types.B;
import polymorphic.dispatcher.experiments.tests.Types.C;
import polymorphic.dispatcher.experiments.tests.Types.D;
import polymorphic.dispatcher.experiments.tests.Types.I1;
import polymorphic.dispatcher.experiments.tests.Types.I12;
import polymorphic.dispatcher.experiments.tests.Types.I12bis;
import polymorphic.dispatcher.experiments.tests.Types.I2;
import polymorphic.dispatcher.experiments.tests.Types.S;
import polymorphic.dispatcher.experiments.tests.Types.S1;

public abstract class AbstractPolymorphicDispatcherTest {

	protected Target data = new Target();

	protected IPolymorphicDispatcher<String> invoker;

	@Before
	public void init() {
		invoker = createDispatcher();
	}

	protected abstract IPolymorphicDispatcher<String> createDispatcher();

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

	@Test
	public void testI1() {
		assertEquals("test(I1)", invoker.invoke(new I1() {}));
	}

	@Test
	public void testI2() {
		assertEquals("test(I2)", invoker.invoke(new I2() {}));
	}

	@Test
	public void testI12() {
		assertEquals("test(I12)", invoker.invoke(new I12() {}));
	}

	@Test(expected=IllegalStateException.class)
	public void testI12bis() {
		assertEquals("test(I12)", invoker.invoke(new I12bis() {}));
	}
}
