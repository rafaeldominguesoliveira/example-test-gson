package dtos;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Client {
    private int id;
    private String name;
    private String email;
}
