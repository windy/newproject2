import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;

public class ElasticSearchDemo {
    public static void main(String[] args) {
        // Create the client
        try (RestHighLevelClient client = new RestHighLevelClient(
                RestClient.builder(
                        new HttpHost("localhost", 9200, "http")))) {

            // Your operations go here
            
            System.out.println("Connected to ElasticSearch");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class Main {
    public static void main(final String[] args) {
        System.out.print("你好世界");
    }

}