package polymorphic.dispatcher.experiments.tests;

import java.util.Collections;

import polymorphic.dispatcher.experiments.PolymorphicDispatcherNoSorting;

public class PolymorphicDispatcherNoSortingTest extends AbstractPolymorphicDispatcherTest {

	private PolymorphicDispatcherNoSorting<String> invoker;

	@Override
	protected void createDispatcher() {
		invoker = new PolymorphicDispatcherNoSorting<>("test", Collections.singletonList(target));
	}

	@Override
	protected String invoke(Object param) {
		return invoker.invoke(param);
	}
}
