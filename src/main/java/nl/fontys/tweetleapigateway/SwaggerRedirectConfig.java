package nl.fontys.tweetleapigateway;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import java.net.URI;

@Configuration
public class SwaggerRedirectConfig {

    @Bean
    public RouterFunction<ServerResponse> swaggerRouter() {
        return RouterFunctions.route(
                RequestPredicates.GET("/swagger-ui.html"),
                req -> ServerResponse.temporaryRedirect(URI.create("/webjars/swagger-ui/index.html")).build()
        );
    }
}
