package searchinabox;

import org.elasticsearch.client.Client;
import org.elasticsearch.node.Node;
import org.elasticsearch.node.NodeBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean(destroyMethod = "close")
    public Node node() {
        return NodeBuilder.nodeBuilder().node();
    }

    @Bean
    public Client client() {
        return node().client();
    }
}
