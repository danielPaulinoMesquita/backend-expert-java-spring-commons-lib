package br.com.userservice.commonslib.model.enums;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum OrderStatusEnum {

    OPEN("Open"),
    IN_PROGRESS("In Progress"),
    CLOSED("Closed"),
    CANCELED("Canceled");

    @Getter
    private final String description;

    public static OrderStatusEnum toEnum(String description) {
        return Arrays.stream(OrderStatusEnum.values())
                .filter(e -> e.description.equals(description))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Invalid Description: " + description));
    }
}
