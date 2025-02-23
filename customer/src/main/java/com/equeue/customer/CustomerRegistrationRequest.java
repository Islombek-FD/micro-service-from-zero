package com.equeue.customer;

public record CustomerRegistrationRequest(
    String firstName,
    String lastName,
    String email
) {
}
