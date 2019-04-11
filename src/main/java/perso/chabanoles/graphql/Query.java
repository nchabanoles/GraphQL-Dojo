package perso.chabanoles.graphql;

import java.util.List;

import com.company.model.Request;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;
import perso.chabanoles.graphql.repositories.RequestRepository;

@Component
public class Query implements GraphQLQueryResolver {
    public List<Request>  allRequests(int from, int pageSize) throws Exception {
        return new RequestRepository().find(from,pageSize);
    }
}
