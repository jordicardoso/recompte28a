package aggregation;

import org.apache.camel.Exchange;
import org.apache.camel.processor.aggregate.AggregationStrategy;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class votsXmunicipi implements AggregationStrategy {

    public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {
        if (oldExchange == null) {
            return newExchange;
        }

        Map oldHeaders = oldExchange.getIn().getHeaders();
        Map newHeaders = newExchange.getIn().getHeaders();

        newHeaders.put("votsPDECAT",(Integer) newHeaders.get("votsPDECAT") + (Integer) oldHeaders.get("votsPDECAT"));
        newHeaders.put("votsPSOE",(Integer) newHeaders.get("votsPSOE") + (Integer) oldHeaders.get("votsPSOE"));
        newHeaders.put("votsPodemos",(Integer) newHeaders.get("votsPodemos") + (Integer) oldHeaders.get("votsPodemos"));
        newHeaders.put("votsERC",(Integer) newHeaders.get("votsERC") + (Integer) oldHeaders.get("votsERC"));
        newHeaders.put("votsComuns",(Integer) newHeaders.get("votsComuns") + (Integer) oldHeaders.get("votsComuns"));
        newHeaders.put("votsPP",(Integer) newHeaders.get("votsPP") + (Integer) oldHeaders.get("votsPP"));
        newHeaders.put("votsCiudadanos",(Integer) newHeaders.get("votsCiudadanos") + (Integer) oldHeaders.get("votsCiudadanos"));
        newHeaders.put("votsVox",(Integer) newHeaders.get("votsVox") + (Integer) oldHeaders.get("votsVox"));

        oldExchange.getOut().setHeaders(newHeaders);
        return oldExchange;
    }
}
