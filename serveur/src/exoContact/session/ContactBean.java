package exoContact.session;

import javax.ejb.*;
import javax.persistence.*;
import java.util.*;

import exoContact.entity.*;

@Stateless (mappedName="exoDemo")
public class ContactBean implements ContactItf {
    @PersistenceContext(unitName="exoDemoPU")
    private EntityManager em;

	public List<String> getLesNoms()
	{
		return em.createQuery("SELECT ce.lastName FROM ContactEntity ce").getResultList();
	}
}

