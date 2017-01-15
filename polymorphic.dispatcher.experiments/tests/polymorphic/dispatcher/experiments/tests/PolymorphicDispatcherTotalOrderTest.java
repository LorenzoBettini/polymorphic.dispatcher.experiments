package polymorphic.dispatcher.experiments.tests;

import java.util.Collections;

import polymorphic.dispatcher.experiments.IPolymorphicDispatcher;
import polymorphic.dispatcher.experiments.PolymorphicDispatcherTotalOrder;

public class PolymorphicDispatcherTotalOrderTest extends AbstractPolymorphicDispatcherTest {

	@Override
	protected IPolymorphicDispatcher<String> createDispatcher() {
		return new PolymorphicDispatcherTotalOrder<>("test", Collections.singletonList(data));
	}

}
