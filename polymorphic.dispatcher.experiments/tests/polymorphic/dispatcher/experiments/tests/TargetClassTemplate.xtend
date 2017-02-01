package polymorphic.dispatcher.experiments.tests

import java.util.List

class TargetClassTemplate {
	def static String createClassCode(List<String> methodParamTypes) {
		'''
		package targets;
		
		import polymorphic.dispatcher.experiments.tests.Types.*;
		
		public class MyTarget {
			«FOR m : methodParamTypes»
			public String test(«m» a) {
				return "test(«m»)";
			} 
			«ENDFOR»
		}
		'''
	}
}