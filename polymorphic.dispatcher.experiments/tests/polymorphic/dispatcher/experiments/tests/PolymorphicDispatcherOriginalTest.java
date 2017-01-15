package polymorphic.dispatcher.experiments.tests;

import java.util.Collections;

import org.eclipse.xtext.util.PolymorphicDispatcher;

public class PolymorphicDispatcherOriginalTest extends AbstractPolymorphicDispatcherTest {

	private PolymorphicDispatcher<String> invoker;

	@Override
	protected void createDispatcher() {
		invoker = new PolymorphicDispatcher<>("test", Collections.singletonList(data));
	}

	@Override
	protected String invoke(Object param) {
		return invoker.invoke(param);
	}

}
