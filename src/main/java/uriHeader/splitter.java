package uriHeader;

import org.apache.camel.Exchange;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class splitter {

    private static Logger LOG = LoggerFactory.getLogger(splitter.class);

    public void process(Exchange exchange) throws Exception {

        String uri = (String) exchange.getIn().getHeader("CamelFileName");

        String[] parts = uri.split("\\\\");
        String provincia = parts[0];
        String municipi = parts[1];
        String collegi = parts[2];
        String mesa = parts[3];

        exchange.getOut().setHeaders(exchange.getIn().getHeaders());
        exchange.getOut().setHeader("provincia", provincia);
        exchange.getOut().setHeader("municipi", municipi);
        exchange.getOut().setHeader("collegi", collegi);
        exchange.getOut().setHeader("mesa", mesa);
        exchange.getOut().setBody(exchange.getIn().getBody());
    }
}
