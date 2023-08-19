package com.laman.paydaytradesystem.model.dto.request;

import com.laman.paydaytradesystem.model.entity.Product;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;
@Data
@Component

public class StockDTO {
    List<Product> products;
    Long total;
    Long skip;
    Long limit;
}
