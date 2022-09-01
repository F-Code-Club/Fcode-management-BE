package fcode.backend.management.sevice.constant;

import lombok.Getter;

@Getter
public enum ServiceMessage {
    SUCCESS_MESSAGE("Success"),
    ID_NOT_EXIST_MESSAGE("Id is not exist"),
    INVALID_ARGUMENT_MESSAGE("Invalid argument"),
    FORBIDDEN_MESSAGE("User do not have role to use this service");
    private String message;
    ServiceMessage(String message) {
        this.message = message;
    }


}
