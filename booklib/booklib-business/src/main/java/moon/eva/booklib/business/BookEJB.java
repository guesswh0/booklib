package moon.eva.booklib.business;

import moon.eva.booklib.entities.Book;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

@Stateless
public class BookEJB {

    @Inject
    private EntityManager em;

    public Book findBookById(Long id) {
        return em.find(Book.class, id);
    }
}
