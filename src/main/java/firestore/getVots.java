package firestore;

import com.google.api.client.util.ArrayMap;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.FirestoreOptions;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;

import java.io.InputStream;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;


public class getVots implements Processor{

    public void process(Exchange exchange) throws Exception {

        InputStream serviceAccount = getClass().getClassLoader().getResourceAsStream("service-key.json");
        GoogleCredentials credentials = GoogleCredentials.fromStream(serviceAccount);

        FirestoreOptions foptions =
                FirestoreOptions.newBuilder()
                        .setTimestampsInSnapshotsEnabled(true)
                        .setCredentials(credentials)
                        .setProjectId("tuvotestucomptes-4b846")
                        .build();
        Firestore db = foptions.getService();

        ApiFuture<QuerySnapshot> query =
                db.collection("vots").whereEqualTo("processat", false).get();

        QuerySnapshot querySnapshot = query.get();
        List<QueryDocumentSnapshot> documents = querySnapshot.getDocuments();

        ArrayList registreVots = new ArrayList();
        for (QueryDocumentSnapshot document : documents) {
            registreVots.add(document.getData());
        }

        exchange.getOut().setBody(registreVots);
    }
}