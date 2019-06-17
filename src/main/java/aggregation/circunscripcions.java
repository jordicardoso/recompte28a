package aggregation;

import com.google.api.client.util.ArrayMap;
import org.apache.camel.Exchange;
import org.apache.camel.processor.aggregate.AggregationStrategy;
import dataformats.resultats;

import java.util.HashMap;
import java.util.LinkedHashMap;

import static java.lang.Integer.parseInt;

public class circunscripcions implements AggregationStrategy {

    public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {
        if (oldExchange == null) {
            return newExchange;
        }

        LinkedHashMap vots = new LinkedHashMap();

        vots.put("votsJxCAT", (Integer)oldExchange.getIn().getHeader("votsJxCAT") + (Integer)newExchange.getIn().getHeader("votsJxCAT"));
        vots.put("votsPSOE", (Integer)oldExchange.getIn().getHeader("votsPSOE") + (Integer)newExchange.getIn().getHeader("votsPSOE"));
        vots.put("votsPACMA", (Integer)oldExchange.getIn().getHeader("votsPACMA") + (Integer)newExchange.getIn().getHeader("votsPACMA"));
        vots.put("votsERC", (Integer)oldExchange.getIn().getHeader("votsERC") + (Integer)newExchange.getIn().getHeader("votsERC"));
        vots.put("votsComuns", (Integer)oldExchange.getIn().getHeader("votsComuns") + (Integer)newExchange.getIn().getHeader("votsComuns"));
        vots.put("votsPP", (Integer)oldExchange.getIn().getHeader("votsPP") + (Integer)newExchange.getIn().getHeader("votsPP"));
        vots.put("votsCiudadanos", (Integer)oldExchange.getIn().getHeader("votsCiudadanos") + (Integer)newExchange.getIn().getHeader("votsCiudadanos"));
        vots.put("votsVox", (Integer)oldExchange.getIn().getHeader("votsVox") + (Integer)newExchange.getIn().getHeader("votsVox"));
        vots.put("votsBlancs", (Integer)oldExchange.getIn().getHeader("votsBlancs") + (Integer)newExchange.getIn().getHeader("votsBlancs"));
        vots.put("votsNuls", (Integer)oldExchange.getIn().getHeader("votsNuls") + (Integer)newExchange.getIn().getHeader("votsNuls"));

        oldExchange.getOut().setHeader("votsJxCAT", vots.get("votsJxCAT"));
        oldExchange.getOut().setHeader("votsPSOE", vots.get("votsPSOE"));
        oldExchange.getOut().setHeader("votsPACMA", vots.get("votsPACMA"));
        oldExchange.getOut().setHeader("votsERC", vots.get("votsERC"));
        oldExchange.getOut().setHeader("votsComuns", vots.get("votsComuns"));
        oldExchange.getOut().setHeader("votsPP", vots.get("votsPP"));
        oldExchange.getOut().setHeader("votsCiudadanos", vots.get("votsCiudadanos"));
        oldExchange.getOut().setHeader("votsVox", vots.get("votsVox"));
        oldExchange.getOut().setHeader("votsBlancs", vots.get("votsBlancs"));
        oldExchange.getOut().setHeader("votsNuls", vots.get("votsNuls"));
        return oldExchange;
    }
}