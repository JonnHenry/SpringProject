package com.example.market.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PurchaseItem {
    private int productId;
    private int quantity;
    private double total;
    private boolean active;
}
