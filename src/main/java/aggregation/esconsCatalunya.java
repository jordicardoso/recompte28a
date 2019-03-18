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

        newHeaders.put("votsJxC",(Integer) newHeaders.get("votsJxC") + (Integer) oldHeaders.get("votsJxC"));
        newHeaders.put("votsERC",(Integer) newHeaders.get("votsERC") + (Integer) oldHeaders.get("votsERC"));
        newHeaders.put("votsCUP",(Integer) newHeaders.get("votsCUP") + (Integer) oldHeaders.get("votsCUP"));
        newHeaders.put("votsCs",(Integer) newHeaders.get("votsCs") + (Integer) oldHeaders.get("votsCs"));
        newHeaders.put("votsPSC",(Integer) newHeaders.get("votsPSC") + (Integer) oldHeaders.get("votsPSC"));
        newHeaders.put("votsComuns",(Integer) newHeaders.get("votsComuns") + (Integer) oldHeaders.get("votsComuns"));
        newHeaders.put("votsPP",(Integer) newHeaders.get("votsPP") + (Integer) oldHeaders.get("votsPP"));
        newHeaders.put("votsPACMA",(Integer) newHeaders.get("votsPACMA") + (Integer) oldHeaders.get("votsPACMA"));
        newHeaders.put("votspumj",(Integer) newHeaders.get("votspumj") + (Integer) oldHeaders.get("votspumj"));
        newHeaders.put("votsRecortes",(Integer) newHeaders.get("votsRecortes") + (Integer) oldHeaders.get("votsRecortes"));

        oldExchange.getOut().setBody(result);
        oldExchange.getOut().setHeaders(newHeaders);

        return oldExchange;
    }
}
