package polymorphic.dispatcher.experiments;

public interface IPolymorphicDispatcher<RT> {

	public RT invoke(Object... params);

}
