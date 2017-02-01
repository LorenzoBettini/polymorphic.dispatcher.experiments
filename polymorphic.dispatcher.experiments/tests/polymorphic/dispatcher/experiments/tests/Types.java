package polymorphic.dispatcher.experiments.tests;

public class Types {

	static public class S {
	}

	static public class S1 {
	}

	static public class B extends S {
	}

	static public class C extends S {
	}

	static public class A extends C {
	}

	static public class D extends S {
	}

	static public interface I1 {
		
	}
	
	static public interface I2 {
		
	}
	
	static public interface I12 extends I1, I2 {
		
	}

	static public interface I12bis extends I1, I2 {
		
	}

	static public interface I12d extends I12 {
		
	}
}
