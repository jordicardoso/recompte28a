package aggregation;


import org.apache.camel.Exchange;
import org.apache.camel.processor.aggregate.AggregationStrategy;
import dataformats.resultats;

import static java.lang.Integer.parseInt;

public class circunscripcions implements AggregationStrategy {

    public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {
        if (oldExchange == null) {
            return newExchange;
        }

        String oldBody = oldExchange.getIn().getBody(String.class);
        String newBody = newExchange.getIn().getBody(String.class);

        resultats vots = (resultats) oldExchange.getIn().getBody();
        resultats nousvots = (resultats) newExchange.getIn().getBody();

        vots.setvnuls(vots.getvnuls() + nousvots.getvnuls());
        vots.setvblancs(vots.getvblancs() + nousvots.getvblancs());
        vots.setverc(vots.getverc() + nousvots.getverc());
        vots.setvjxc(vots.getvjxc() + nousvots.getvjxc());
        vots.setvcup(vots.getvcup() + nousvots.getvcup());
        vots.setvpsc(vots.getvpsc() + nousvots.getvpsc());
        vots.setvcs(vots.getvcs() + nousvots.getvcs());
        vots.setvppc(vots.getvppc() + nousvots.getvppc());
        vots.setvcom(vots.getvcom() + nousvots.getvcom());
        vots.setvpacma(vots.getvpacma() + nousvots.getvpacma());
        vots.setvdialeg(vots.getvdialeg() + nousvots.getvdialeg());
        vots.setvpumjust(vots.getvpumjust() + nousvots.getvpumjust());
        vots.setvrecortes(vots.getvrecortes() + nousvots.getvrecortes());
        vots.setvfamilia(vots.getvfamilia() + nousvots.getvfamilia());
        vots.setvdn(vots.getvdn() + nousvots.getvdn());
        vots.setvpfiv(vots.getvpfiv() + nousvots.getvpfiv());
        vots.setvconver(vots.getvconver() + nousvots.getvconver());
        vots.setvunidos(vots.getvunidos() + nousvots.getvunidos());
        vots.setvcilus(vots.getvcilus() + nousvots.getvcilus());

        oldExchange.getIn().setBody(vots);
        return oldExchange;
    }
}
