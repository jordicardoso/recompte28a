package aggregation;

import org.apache.camel.Exchange;
import org.apache.camel.processor.aggregate.GroupedExchangeAggregationStrategy;

public class jsonAggregation extends GroupedExchangeAggregationStrategy {

    @Override
    public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {
        if (oldExchange == null) {
            return newExchange;
        }
        //else aggregate
        String oldBody = oldExchange.getIn().getBody(String.class);
        String newBody = newExchange.getIn().getBody(String.class);
        String aggregate = oldBody + ", " + newBody;
        oldExchange.getIn().setBody(aggregate);
        return oldExchange;
    }
}
