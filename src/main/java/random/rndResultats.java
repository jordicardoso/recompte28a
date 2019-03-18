package random;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class rndResultats implements Processor {

    private static Logger LOG = LoggerFactory.getLogger(rndResultats.class);

    public void process(Exchange exchange) throws Exception {

        List<dataformats.resultats> totals = (List<dataformats.resultats>) exchange.getIn().getBody();

        /*
        for (dataformats.resultats candidatura : totals) {
            Object obj = candidatura.getCandidatura();
            String codart = obj.toString();
            Random randomGenerator = new Random();

            if (!candidatura.getCandidatura().equals("CENS") && !candidatura.getCandidatura().equals("VOTANTS")){
                Integer totalCandidat = randomGenerator.nextInt(1000);
                candidatura.setresultat(totalCandidat.toString());
            }
            else{
                candidatura.setResultat("0");
            }
        }*/
        exchange.getOut().setHeaders(exchange.getIn().getHeaders());
        exchange.getOut().setBody(totals);
    }
}
