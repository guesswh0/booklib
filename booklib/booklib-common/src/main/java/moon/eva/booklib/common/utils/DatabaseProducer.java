package moon.eva.booklib.common.utils;

import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class DatabaseProducer {

    @Produces
    @PersistenceContext(unitName = "booklibDB")
    private EntityManager em;
}
