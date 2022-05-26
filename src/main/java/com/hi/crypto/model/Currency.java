package com.hi.crypto.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
public class Currency {
    private CurrencySymbol symbol;
    private Double price;
    private Double change;
    private Long volume;
    private Exchange exchange;
}
