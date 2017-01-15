package polymorphic.dispatcher.experiments.tests;

import static org.junit.Assert.assertEquals;

import org.eclipse.xtext.util.PolymorphicDispatcher;
import org.junit.Before;
import org.junit.Test;

import polymorphic.dispatcher.experiments.tests.Types.A;
import polymorphic.dispatcher.experiments.tests.Types.B;
import polymorphic.dispatcher.experiments.tests.Types.C;
import polymorphic.dispatcher.experiments.tests.Types.D;
import polymorphic.dispatcher.experiments.tests.Types.Foo1;
import polymorphic.dispatcher.experiments.tests.Types.Foo10;
import polymorphic.dispatcher.experiments.tests.Types.Foo11;
import polymorphic.dispatcher.experiments.tests.Types.Foo12;
import polymorphic.dispatcher.experiments.tests.Types.Foo13;
import polymorphic.dispatcher.experiments.tests.Types.Foo14;
import polymorphic.dispatcher.experiments.tests.Types.Foo15;
import polymorphic.dispatcher.experiments.tests.Types.Foo16;
import polymorphic.dispatcher.experiments.tests.Types.Foo17;
import polymorphic.dispatcher.experiments.tests.Types.Foo18;
import polymorphic.dispatcher.experiments.tests.Types.Foo19;
import polymorphic.dispatcher.experiments.tests.Types.Foo2;
import polymorphic.dispatcher.experiments.tests.Types.Foo20;
import polymorphic.dispatcher.experiments.tests.Types.Foo21;
import polymorphic.dispatcher.experiments.tests.Types.Foo22;
import polymorphic.dispatcher.experiments.tests.Types.Foo23;
import polymorphic.dispatcher.experiments.tests.Types.Foo24;
import polymorphic.dispatcher.experiments.tests.Types.Foo25;
import polymorphic.dispatcher.experiments.tests.Types.Foo26;
import polymorphic.dispatcher.experiments.tests.Types.Foo27;
import polymorphic.dispatcher.experiments.tests.Types.Foo28;
import polymorphic.dispatcher.experiments.tests.Types.Foo29;
import polymorphic.dispatcher.experiments.tests.Types.Foo3;
import polymorphic.dispatcher.experiments.tests.Types.Foo30;
import polymorphic.dispatcher.experiments.tests.Types.Foo31;
import polymorphic.dispatcher.experiments.tests.Types.Foo32;
import polymorphic.dispatcher.experiments.tests.Types.Foo33;
import polymorphic.dispatcher.experiments.tests.Types.Foo34;
import polymorphic.dispatcher.experiments.tests.Types.Foo35;
import polymorphic.dispatcher.experiments.tests.Types.Foo36;
import polymorphic.dispatcher.experiments.tests.Types.Foo37;
import polymorphic.dispatcher.experiments.tests.Types.Foo38;
import polymorphic.dispatcher.experiments.tests.Types.Foo39;
import polymorphic.dispatcher.experiments.tests.Types.Foo4;
import polymorphic.dispatcher.experiments.tests.Types.Foo40;
import polymorphic.dispatcher.experiments.tests.Types.Foo41;
import polymorphic.dispatcher.experiments.tests.Types.Foo42;
import polymorphic.dispatcher.experiments.tests.Types.Foo43;
import polymorphic.dispatcher.experiments.tests.Types.Foo44;
import polymorphic.dispatcher.experiments.tests.Types.Foo45;
import polymorphic.dispatcher.experiments.tests.Types.Foo46;
import polymorphic.dispatcher.experiments.tests.Types.Foo47;
import polymorphic.dispatcher.experiments.tests.Types.Foo48;
import polymorphic.dispatcher.experiments.tests.Types.Foo49;
import polymorphic.dispatcher.experiments.tests.Types.Foo5;
import polymorphic.dispatcher.experiments.tests.Types.Foo50;
import polymorphic.dispatcher.experiments.tests.Types.Foo6;
import polymorphic.dispatcher.experiments.tests.Types.Foo7;
import polymorphic.dispatcher.experiments.tests.Types.Foo8;
import polymorphic.dispatcher.experiments.tests.Types.Foo9;
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

	public String test(Foo1 c) {
		return "...";
	}

	public String test(Foo2 c) {
		return "...";
	}

	public String test(Foo3 c) {
		return "...";
	}

	public String test(Foo4 c) {
		return "...";
	}

	public String test(Foo5 c) {
		return "...";
	}

	public String test(Foo6 c) {
		return "...";
	}

	public String test(Foo7 c) {
		return "...";
	}

	public String test(Foo8 c) {
		return "...";
	}

	public String test(Foo9 c) {
		return "...";
	}

	public String test(Foo10 c) {
		return "...";
	}

	public String test(Foo11 c) {
		return "...";
	}

	public String test(Foo12 c) {
		return "...";
	}

	public String test(Foo13 c) {
		return "...";
	}

	public String test(Foo14 c) {
		return "...";
	}

	public String test(Foo15 c) {
		return "...";
	}

	public String test(Foo16 c) {
		return "...";
	}

	public String test(Foo17 c) {
		return "...";
	}

	public String test(Foo18 c) {
		return "...";
	}

	public String test(Foo19 c) {
		return "...";
	}

	public String test(Foo20 c) {
		return "...";
	}

	public String test(Foo21 c) {
		return "...";
	}

	public String test(Foo22 c) {
		return "...";
	}

	public String test(Foo23 c) {
		return "...";
	}

	public String test(Foo24 c) {
		return "...";
	}

	public String test(Foo25 c) {
		return "...";
	}

	public String test(Foo26 c) {
		return "...";
	}

	public String test(Foo27 c) {
		return "...";
	}

	public String test(Foo28 c) {
		return "...";
	}

	public String test(Foo29 c) {
		return "...";
	}

	public String test(Foo30 c) {
		return "...";
	}

	public String test(Foo31 c) {
		return "...";
	}

	public String test(Foo32 c) {
		return "...";
	}

	public String test(Foo33 c) {
		return "...";
	}

	public String test(Foo34 c) {
		return "...";
	}

	public String test(Foo35 c) {
		return "...";
	}

	public String test(Foo36 c) {
		return "...";
	}

	public String test(Foo37 c) {
		return "...";
	}

	public String test(Foo38 c) {
		return "...";
	}

	public String test(Foo39 c) {
		return "...";
	}

	public String test(Foo40 c) {
		return "...";
	}

	public String test(Foo41 c) {
		return "...";
	}

	public String test(Foo42 c) {
		return "...";
	}

	public String test(Foo43 c) {
		return "...";
	}

	public String test(Foo44 c) {
		return "...";
	}

	public String test(Foo45 c) {
		return "...";
	}

	public String test(Foo46 c) {
		return "...";
	}

	public String test(Foo47 c) {
		return "...";
	}

	public String test(Foo48 c) {
		return "...";
	}

	public String test(Foo49 c) {
		return "...";
	}

	public String test(Foo50 c) {
		return "...";
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
