package com.laman.paydaytradesystem.model.dto.request;

import com.laman.paydaytradesystem.model.enums.OrderType;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PlaceOrderRequestDto {

    OrderType orderType;
    String stockSymbol;
    BigDecimal targetPrice;
    int quantity;
}
