package com.sedlarski.customer;

public record CustomerRegistrationRequest(
    String firstName,
    String lastName,
    String email) {
}
