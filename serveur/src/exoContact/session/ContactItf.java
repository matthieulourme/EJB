package exoContact.session;

import javax.ejb.Remote;
import java.util.*;

@Remote()
public interface ContactItf {
	public List<String> getLesNoms();
	}
