package dtos;

import lombok.Data;

import java.util.List;

@Data
public class Order {
    private int id;
    private Client client;
    private List<Items> items;
}
