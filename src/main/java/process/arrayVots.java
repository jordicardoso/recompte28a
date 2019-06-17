package process;

import com.google.api.client.util.ArrayMap;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import java.util.*;


public class arrayVots implements Processor {

    public void process(Exchange exchange) throws Exception {

        ArrayMap<String, Integer> body = (ArrayMap<String, Integer>) exchange.getIn().getBody();
        int numPartits = 10;
        List<Integer> partits = new ArrayList<Integer>(numPartits);

        partits.add(Integer.valueOf(body.get("votsJxCAT")));
        partits.add(Integer.valueOf(body.get("votsPSOE")));
        partits.add(Integer.valueOf(body.get("votsPACMA")));
        partits.add(Integer.valueOf(body.get("votsERC")));
        partits.add(Integer.valueOf(body.get("votsComuns")));
        partits.add(Integer.valueOf(body.get("votsPP")));
        partits.add(Integer.valueOf(body.get("votsCiudadanos")));
        partits.add(Integer.valueOf(body.get("votsVox")));
        partits.add(Integer.valueOf(body.get("blanc")));
        partits.add(Integer.valueOf(body.get("votsnuls")));

        exchange.getOut().setHeaders(exchange.getIn().getHeaders());
        exchange.getOut().setBody(partits);
    }
}
