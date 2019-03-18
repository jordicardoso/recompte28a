package process;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import java.util.*;


public class arrayVots implements Processor {

    public void process(Exchange exchange) throws Exception {

        HashMap oldBody = (HashMap) exchange.getIn().getBody();
        int numPartits = 10;
        List<Integer> partits = new ArrayList<Integer>(numPartits);

        partits.add(Integer.valueOf(oldBody.get("votsPDECAT").toString()));
        partits.add(Integer.valueOf(oldBody.get("votsPSOE").toString()));
        partits.add(Integer.valueOf(oldBody.get("votsPodemos").toString()));
        partits.add(Integer.valueOf(oldBody.get("votsERC").toString()));
        partits.add(Integer.valueOf(oldBody.get("votsComuns").toString()));
        partits.add(Integer.valueOf(oldBody.get("votsPP").toString()));
        partits.add(Integer.valueOf(oldBody.get("votsCiudadanos").toString()));
        partits.add(Integer.valueOf(oldBody.get("votsVox").toString()));
        //partits.add(Integer.valueOf(oldBody.get("blanc").toString()));
        //partits.add(Integer.valueOf(oldBody.get("nuls").toString()));

        exchange.getOut().setHeaders(exchange.getIn().getHeaders());
        exchange.getOut().setBody(partits);
    }
}
