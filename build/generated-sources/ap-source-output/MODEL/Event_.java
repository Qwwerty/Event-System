package MODEL;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Event.class)
public abstract class Event_ extends MODEL.ObjetoBase_ {

	public static volatile SingularAttribute<Event, String> realizationAdress;
	public static volatile SingularAttribute<Event, String> timeStart;
	public static volatile SingularAttribute<Event, String> name;
	public static volatile SingularAttribute<Event, String> description;
	public static volatile SingularAttribute<Event, String> timeFinish;
	public static volatile SingularAttribute<Event, Integer> capacity;

}

