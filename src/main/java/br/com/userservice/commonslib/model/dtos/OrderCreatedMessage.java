package br.com.userservice.commonslib.model.dtos;

import br.com.userservice.commonslib.model.responses.OrderResponse;
import br.com.userservice.commonslib.model.responses.UserResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

@Data
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class OrderCreatedMessage implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    private OrderResponse orderResponse;
    private UserResponse customer;
    private UserResponse requester;
}
