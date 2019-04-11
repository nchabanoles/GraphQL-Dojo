package perso.chabanoles.graphql.repositories;

import java.lang.reflect.ParameterizedType;
import java.util.HashMap;

import com.bonitasoft.engine.api.APIClient;
import com.company.model.SupplierDAO;
import org.bonitasoft.engine.api.ApiAccessType;
import org.bonitasoft.engine.bdm.BusinessObjectDAOFactory;
import org.bonitasoft.engine.bdm.dao.BusinessObjectDAO;
import org.bonitasoft.engine.util.APITypeManager;

public abstract class AbstractBDMRepository<T extends BusinessObjectDAO> {

    /*
    * For the sake of simplicity for this internal Dojo, connection information are stored in a static section.
    * As a prerequisite a Bonita server is supposed to be available, i.e. up and running, with the Procurement 1.0 version
    * deployed on top of ACME organization at the address 192.168.1.62. A docker image could be provided in a future version of this Dojo.
    * */

    static {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("org.bonitasoft.engine.api-type.parameters", "server.url, application.name");
        map.put("server.url", "http://192.168.1.62:8080");
        map.put("application.name", "bonita");

        APITypeManager.setAPITypeAndParams(ApiAccessType.HTTP, map);
    }


    protected final T dao;

    public AbstractBDMRepository() throws Exception
    {
        APIClient client = new APIClient();
        client.login(1L,"walter.bates", "bpm");

        dao = new BusinessObjectDAOFactory().createDAO(client.getSession(), (Class<T>) ((ParameterizedType) getClass()
                .getGenericSuperclass()).getActualTypeArguments()[0]);
    }

}
