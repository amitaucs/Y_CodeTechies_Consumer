package com.codetechies.codetechiesconsumer.messageGateway;

import com.codetechies.codetechiesconsumer.event.BankEvent;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

@AllArgsConstructor
@Slf4j
@Configuration
public class BankMessageListener {

    @Bean
    public Consumer<BankEvent> bankMessageConsumer(){

         return bankEvent -> {
             log.info("Received the message as : {}",bankEvent.getMessage());
         };
    }
}
