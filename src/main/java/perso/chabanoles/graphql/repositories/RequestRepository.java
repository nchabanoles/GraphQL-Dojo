package perso.chabanoles.graphql.repositories;

import java.util.List;

import com.company.model.Request;
import com.company.model.RequestDAO;
import org.springframework.stereotype.Component;

@Component
public class RequestRepository extends AbstractBDMRepository<RequestDAO> {
    public RequestRepository() throws Exception {
        super();
    }

    public List<Request> find(int startIndex, int maxResults) {
        return dao.find(startIndex,maxResults);
    }
}
