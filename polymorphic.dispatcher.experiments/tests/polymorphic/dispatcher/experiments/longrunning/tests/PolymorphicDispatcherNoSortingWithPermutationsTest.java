package polymorphic.dispatcher.experiments.longrunning.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.Collections;
import java.util.List;

import org.eclipse.xtext.util.JavaVersion;
import org.eclipse.xtext.xbase.compiler.OnTheFlyJavaCompiler2;
import org.junit.Test;

import com.google.common.collect.Lists;

import polymorphic.dispatcher.experiments.PolymorphicDispatcherNoSorting;
import polymorphic.dispatcher.experiments.tests.Permutations;
import polymorphic.dispatcher.experiments.tests.Target;
import polymorphic.dispatcher.experiments.tests.TargetClassTemplate;
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

public class PolymorphicDispatcherNoSortingWithPermutationsTest {

	protected Target target = new Target();

	private OnTheFlyJavaCompiler2 javaCompiler;

	@Test
	public void testA() throws Exception {
		performTest("A", new A());
	}

	@Test
	public void testB() throws Exception {
		performTest("B", new B());
	}

	@Test
	public void testC() throws Exception {
		performTest("C", new C());
	}

	@Test
	public void testD() throws Exception {
		performTest("S", new D());
	}

	@Test
	public void testS() throws Exception {
		performTest("S", new S());
	}

	@Test
	public void testS1() throws Exception {
		performTest("S1", new S1());
	}

	@Test
	public void testI1() throws Exception {
		performTest("I1", new I1() {});
	}

	@Test
	public void testI2() throws Exception {
		performTest("I2", new I2() {});
	}

	@Test
	public void testI12() throws Exception {
		performTest("I12", new I12() {});
	}

	@Test
	public void testI12bis() throws Exception {
		performTest("", new I12bis() {}, true);
	}

	private void performTest(String expectedMethodString, Object argument) throws Exception {
		performTest(expectedMethodString, argument, false);
	}

	private void performTest(String expectedMethodString, Object argument, boolean expectedException) throws Exception {
		List<String> methodParamNames = Lists.newArrayList("S", "S1", "A", "B", "C", "I1", "I2", "I12");
		List<List<String>> permutations = Permutations.generatePerm(methodParamNames);
		javaCompiler = new OnTheFlyJavaCompiler2(getClass().getClassLoader(), JavaVersion.JAVA8);
		String classname = "targets.MyTarget";
		for (List<String> permutation : permutations) {
			System.out.print("[");
			for (String string : permutation) {
				System.out.print(string + ";");
			}
			System.out.println("]");
			String code = TargetClassTemplate.createClassCode(permutation);
			Class<?> result = javaCompiler.compileToClass(classname, code);
			Object newTarget = result.newInstance();
			PolymorphicDispatcherNoSorting<String> inv = new PolymorphicDispatcherNoSorting<>("test",
					Collections.singletonList(newTarget));
			try {
				String invoke = inv.invoke(argument);
				if (expectedException)
					fail("expected exception, instead: " + invoke);
				assertEquals("test(" + expectedMethodString + ")", invoke);
			} catch (IllegalStateException e) {
				if (!expectedException)
					throw e;
			}
		}
	}
}
