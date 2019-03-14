package perso.chabanoles.graphql.repositories;

import java.util.List;

import com.company.model.Supplier;
import com.company.model.SupplierDAO;
import org.springframework.stereotype.Component;

@Component
public class SupplierRepository extends AbstractBDMRepository<SupplierDAO> {

    public SupplierRepository() throws Exception {
        super();
    }

    public List<Supplier> find(int startIndex, int maxResults) {
        return dao.find(startIndex, maxResults);
    }

}
