package dtos;

import lombok.Data;

import java.util.List;

@Data
public class Order {
    private int id;
    private Client cliente;
    private List<Items> items;
}
