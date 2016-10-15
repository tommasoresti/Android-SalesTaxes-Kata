package it.tommasoresti.salestaxes.domain.item;

public class Food extends Item {
    public Food(String description) {
        super(description);
    }

    @Override
    public ItemType getType() {
        return ItemType.FOOD;
    }
}
