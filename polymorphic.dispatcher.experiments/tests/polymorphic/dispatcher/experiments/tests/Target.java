package polymorphic.dispatcher.experiments.tests;

import polymorphic.dispatcher.experiments.tests.Types.A;
import polymorphic.dispatcher.experiments.tests.Types.B;
import polymorphic.dispatcher.experiments.tests.Types.C;
import polymorphic.dispatcher.experiments.tests.Types.I1;
import polymorphic.dispatcher.experiments.tests.Types.I12;
import polymorphic.dispatcher.experiments.tests.Types.I2;
import polymorphic.dispatcher.experiments.tests.Types.S;
import polymorphic.dispatcher.experiments.tests.Types.S1;

public class Target {

	public Target() {
	}

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

	public String test(I1 c) {
		return "test(I1)";
	}

	public String test(I2 c) {
		return "test(I2)";
	}

	public String test(I12 c) {
		return "test(I12)";
	}
}