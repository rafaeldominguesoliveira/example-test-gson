package dtos;

import lombok.Data;

import java.util.List;

@Data
public class Order {
    private int id;
    private Customer client;
    private List<Items> items;
}
