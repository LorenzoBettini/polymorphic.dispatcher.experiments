package polymorphic.dispatcher.experiments.tests;

import java.util.Collections;

import polymorphic.dispatcher.experiments.PolymorphicDispatcherTotalOrder;

public class PolymorphicDispatcherTotalOrderTest extends AbstractPolymorphicDispatcherTest {

	private PolymorphicDispatcherTotalOrder<String> invoker;

	@Override
	protected void createDispatcher() {
		invoker = new PolymorphicDispatcherTotalOrder<>("test", Collections.singletonList(target));
	}

	@Override
	protected String invoke(Object param) {
		return invoker.invoke(param);
	}
}
