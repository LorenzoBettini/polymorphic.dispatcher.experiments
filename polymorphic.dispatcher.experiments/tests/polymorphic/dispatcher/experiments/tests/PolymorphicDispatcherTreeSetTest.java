package polymorphic.dispatcher.experiments.tests;

import java.util.Collections;

import polymorphic.dispatcher.experiments.PolymorphicDispatcherTreeSet;

public class PolymorphicDispatcherTreeSetTest extends AbstractPolymorphicDispatcherTest {

	private PolymorphicDispatcherTreeSet<String> invoker;

	@Override
	protected void createDispatcher() {
		invoker = new PolymorphicDispatcherTreeSet<>("test", Collections.singletonList(data));
	}

	@Override
	protected String invoke(Object param) {
		return invoker.invoke(param);
	}
}
