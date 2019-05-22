package perso.chabanoles.graphql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import perso.chabanoles.graphql.repositories.QuotationRepository;
import perso.chabanoles.graphql.repositories.SupplierRepository;

@RestController
public class Endpoint {

    @Autowired
    private QuotationRepository quotationRepository;

    @Autowired
    private SupplierRepository supplierRepository;

    /* Exercise: Create the Request Repository  and display the count in the index below */



    public Endpoint() throws Exception {
    }

    @RequestMapping("/rest/stats")
    public String index() throws Exception {
        return "The system contains currently: <br>" +
                "<ul><li>" + quotationRepository.find(0,100).size() + " quotation(s)</li>" +
                "<li>"+supplierRepository.find(0,100).size() +" supplier(s)</li>" +
                "</ul>"
                ;
    }
}
