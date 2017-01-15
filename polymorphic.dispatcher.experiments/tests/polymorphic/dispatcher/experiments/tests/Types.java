package polymorphic.dispatcher.experiments.tests;

public class Types {

	static class S {
	}

	static class S1 {
	}

	static class B extends S {
	}

	static class C extends S {
	}

	static class A extends C {
	}

	static class D extends S {
	}

	static interface I1 {
		
	}
	
	static interface I2 {
		
	}
	
	static interface I12 extends I1, I2 {
		
	}

	static interface I12bis extends I1, I2 {
		
	}

	static interface I12d extends I12 {
		
	}
}
