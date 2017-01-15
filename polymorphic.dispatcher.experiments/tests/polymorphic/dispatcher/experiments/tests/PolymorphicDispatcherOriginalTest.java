package polymorphic.dispatcher.experiments.tests;

import java.util.Collections;

import polymorphic.dispatcher.experiments.IPolymorphicDispatcher;
import polymorphic.dispatcher.experiments.PolymorphicDispatcherOriginal;

public class PolymorphicDispatcherOriginalTest extends AbstractPolymorphicDispatcherTest {

	@Override
	protected IPolymorphicDispatcher<String> createDispatcher() {
		return new PolymorphicDispatcherOriginal<>("test", Collections.singletonList(data));
	}

}
