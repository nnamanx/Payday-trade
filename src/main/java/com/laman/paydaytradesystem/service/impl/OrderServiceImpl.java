package com.laman.paydaytradesystem.service.impl;

import com.laman.paydaytradesystem.model.entity.Customer;
import com.laman.paydaytradesystem.model.entity.OrderStock;
import com.laman.paydaytradesystem.model.enums.OrderType;
import com.laman.paydaytradesystem.repository.CustomerRepository;
import com.laman.paydaytradesystem.repository.OrderRepository;
import com.laman.paydaytradesystem.service.OrderService;
import com.laman.paydaytradesystem.service.StockPriceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private CustomerRepository customerRepository;

    private OrderRepository orderRepository;

    private StockPriceService stockPriceService;

    @Override
    public void placeOrder(Customer customer, OrderType orderType, String stockSymbol, BigDecimal targetPrice, int quantity) {

        OrderStock order = OrderStock.builder()
                .customer(customer)
                .orderType(orderType)
                .stockSymbol(stockSymbol)
                .targetPrice(targetPrice)
                .quantity(quantity)
                .build();

        orderRepository.save(order);
    }

    @Override
    public void executeOrders() {

        List<OrderStock> orders = orderRepository.findAll();

        for (OrderStock order : orders) {
            BigDecimal currentStockPrice = stockPriceService.getStockPrice(order.getStockSymbol());
            if ((order.getOrderType() == OrderType.BUY && currentStockPrice.compareTo(order.getTargetPrice()) <= 0) ||
                    (order.getOrderType() == OrderType.SELL && currentStockPrice.compareTo(order.getTargetPrice()) >= 0)) {

                // Update user's cash balance and perform other necessary actions
                Customer customer = order.getCustomer();
                BigDecimal totalTransactionAmount = currentStockPrice.multiply(BigDecimal.valueOf(order.getQuantity()));
                if (order.getOrderType() == OrderType.BUY) {
                    customer.setBalance(customer.getBalance().subtract(totalTransactionAmount));
                } else {
                    customer.setBalance(customer.getBalance().add(totalTransactionAmount));
                }


                order.setIsFilled(true);
                orderRepository.save(order);
                customerRepository.save(customer);
            }
        }
    }
}
