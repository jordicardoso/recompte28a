package aggregation;

import org.apache.camel.Exchange;
import org.apache.camel.processor.aggregate.AggregationStrategy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class esconsCatalunya implements AggregationStrategy {

    public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {
        if (oldExchange == null) {
            return newExchange;
        }

        List<Integer> oldBody = (List<Integer>) oldExchange.getIn().getBody();
        List<Integer> newBody = (List<Integer>) newExchange.getIn().getBody();
        Map oldHeaders = oldExchange.getIn().getHeaders();
        Map newHeaders = newExchange.getIn().getHeaders();

        List<Integer> result = IntStream.range(0, oldBody.size())
                .mapToObj(i -> oldBody.get(i) + newBody.get(i))
                .collect(Collectors.toList());

        newHeaders.put("votsJxCAT",(Integer) newHeaders.get("votsJxCAT") + (Integer) oldHeaders.get("votsJxCAT"));
        newHeaders.put("votsERC",(Integer) newHeaders.get("votsERC") + (Integer) oldHeaders.get("votsERC"));
        newHeaders.put("votsVox",(Integer) newHeaders.get("votsVox") + (Integer) oldHeaders.get("votsVox"));
        newHeaders.put("votsCiudadanos",(Integer) newHeaders.get("votsCiudadanos") + (Integer) oldHeaders.get("votsCiudadanos"));
        newHeaders.put("votsPSOE",(Integer) newHeaders.get("votsPSOE") + (Integer) oldHeaders.get("votsPSOE"));
        newHeaders.put("votsComuns",(Integer) newHeaders.get("votsComuns") + (Integer) oldHeaders.get("votsComuns"));
        newHeaders.put("votsPP",(Integer) newHeaders.get("votsPP") + (Integer) oldHeaders.get("votsPP"));
        newHeaders.put("votsPACMA",(Integer) newHeaders.get("votsPACMA") + (Integer) oldHeaders.get("votsPACMA"));

        oldExchange.getOut().setBody(result);
        oldExchange.getOut().setHeaders(newHeaders);

        return oldExchange;
    }
}
