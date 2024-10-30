package ru.ersted.common.client;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import ru.ersted.common.dto.IndividualDto;

@Component
public class UserServiceClient {
    private final String REGISTRATION_ENDPOINT = "/api/v1/individuals";
    private final String DETAILS_ENDPOINT = "/api/v1/individuals/%s";
    private final WebClient webClient;

    public UserServiceClient(@Qualifier("baseUserClient") WebClient useClient) {
        this.webClient = useClient;
    }

    public Mono<IndividualDto> registration(IndividualDto body) {
        return webClient.post()
                .uri(REGISTRATION_ENDPOINT)
                .bodyValue(body)
                .retrieve()
                .bodyToMono(IndividualDto.class);
    }

    public Mono<IndividualDto> details(String id) {
        return webClient.get()
                .uri(DETAILS_ENDPOINT.formatted(id))
                .retrieve()
                .bodyToMono(IndividualDto.class);
    }
}