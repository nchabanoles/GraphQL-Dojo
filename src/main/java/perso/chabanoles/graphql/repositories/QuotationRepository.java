package perso.chabanoles.graphql.repositories;

import java.util.List;

import com.company.model.Quotation;
import com.company.model.QuotationDAO;
import org.springframework.stereotype.Component;

@Component
public class QuotationRepository extends AbstractBDMRepository<QuotationDAO> {


    public QuotationRepository() throws Exception {
        super();
    }

    public List<Quotation> find(int startIndex, int maxResults) {
        return dao.find(startIndex, maxResults);
    }

    public List<Quotation> findFromRequest(long requestPersistenceId, int fromIndex, int maxResults) {
        return dao.findFromRequest(requestPersistenceId,fromIndex,maxResults);
    }

}
