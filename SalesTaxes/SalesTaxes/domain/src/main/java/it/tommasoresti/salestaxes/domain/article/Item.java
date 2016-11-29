package it.tommasoresti.salestaxes.domain.article;

import java.math.BigDecimal;

public class Item implements Article{

    private String description;
    private String category;
    private BigDecimal price;

    public Item(String category, String description, BigDecimal price) {
        this.category = category;
        this.description = description;
        this.setPrice(price);
    }

    @Override
    public String getCategory() {
        return category;
    }

    @Override
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
