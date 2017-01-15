package polymorphic.dispatcher.experiments.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

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

	@Before
	public void init() {
		createDispatcher();
	}

	protected abstract void createDispatcher();

	protected abstract String invoke(Object param);

	@Test
	public void testA() {
		assertEquals("test(A)", invoke(new A()));
	}

	@Test
	public void testB() {
		assertEquals("test(B)", invoke(new B()));
	}

	@Test
	public void testC() {
		assertEquals("test(C)", invoke(new C()));
	}

	@Test
	public void testD() {
		assertEquals("test(S)", invoke(new D()));
	}

	@Test
	public void testS() {
		assertEquals("test(S)", invoke(new S()));
	}

	@Test
	public void testS1() {
		assertEquals("test(S1)", invoke(new S1()));
	}

	@Test
	public void testI1() {
		assertEquals("test(I1)", invoke(new I1() {}));
	}

	@Test
	public void testI2() {
		assertEquals("test(I2)", invoke(new I2() {}));
	}

	@Test
	public void testI12() {
		assertEquals("test(I12)", invoke(new I12() {}));
	}

	@Test(expected=IllegalStateException.class)
	public void testI12bis() {
		invoke(new I12bis() {});
	}
}
