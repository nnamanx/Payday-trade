package com.laman.paydaytradesystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
//@RequiredArgsConstructor
public class PaydayTradeSystemApplication {                            // implements CommandLineRunner
    // private final StockApiClient stockApiClient;
    public static void main(String[] args) {
        SpringApplication.run(PaydayTradeSystemApplication.class, args);
    }
//    @Override
//  public void run(String... args) throws Exception {
//        System.out.println(stockApiClient.getAllMockStocks());
//    }
}
