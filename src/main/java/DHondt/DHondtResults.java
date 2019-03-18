package DHondt;

import org.apache.camel.Processor;
import org.apache.camel.Exchange;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import random.rndResultats;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.lang.String;
import java.util.stream.Collectors;
import java.util.regex.Pattern;


public class DHondtResults implements Processor {

    private static Logger LOG = LoggerFactory.getLogger(rndResultats.class);

    public void process(Exchange exchange) throws Exception {

        String escons = (String) exchange.getIn().getHeader("escons");
        List<Integer> vots = (List<Integer>) exchange.getIn().getBody();
        Integer mandatecount = Integer.parseInt(escons);
        List<Integer> mandates = createMandatesList(vots.size());

        for (int i = 0; i < mandatecount; i++) {
            computeRound(vots, mandates);
        }

        exchange.getOut().setHeaders(exchange.getIn().getHeaders());
        exchange.getOut().setBody(mandates);
    }

    private static void computeRound(List<Integer> votes, List<Integer> mandates) {
        int indexOfWinner = getRoundWinner(votes, mandates);
        mandates.set(indexOfWinner, mandates.get(indexOfWinner) + 1);
    }


    private static int getRoundWinner(List<Integer> votes, List<Integer> mandates) {
        int indexOfWinner = 0;
        int winnersRoundVotes = 0;
        for (int i = 0; i < votes.size(); i++) {
            int partyRoundVotes = votes.get(i) / (mandates.get(i) + 1);
            if (partyRoundVotes > winnersRoundVotes) {
                indexOfWinner = i;
                winnersRoundVotes = partyRoundVotes;
            }
        }
        return indexOfWinner;
    }

    private static List<Integer> createMandatesList(int size) {
        List<Integer> mandates = new ArrayList<Integer>(size);
        for (int i = 0; i < size; i++)
            mandates.add(0);
        return mandates;
    }
}