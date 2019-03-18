package jsonResult;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.camel.Exchange;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayOutputStream;
import java.util.List;

public class totals {

    private static Logger LOG = LoggerFactory.getLogger(totals.class);

    public void process(Exchange exchange) throws Exception {

        List<List<String>> data = (List<List<String>>) exchange.getIn().getBody();

        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final ObjectMapper mapper = new ObjectMapper();

        mapper.writeValue(out, data);

        final byte[] finaldata = out.toByteArray();
        LOG.info(new String(finaldata));

        exchange.getOut().setHeaders(exchange.getIn().getHeaders());
        exchange.getOut().setBody(exchange.getIn().getBody());
    }
}
