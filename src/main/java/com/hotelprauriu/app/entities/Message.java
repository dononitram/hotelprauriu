package com.hotelprauriu.app.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Messages")
@Getter
@Setter
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Guest name is required")
    @Size(min = 2, max = 100, message = "Guest full name must be between 2 and 100 characters")
    private String guestFullName;

    @Email(message = "Please provide a valid email address")
    private String guestEmail;

    @NotBlank(message = "Message is required")
    @Size(min = 1, max = 511, message = "Message must be between 1 and 511 characters")
    private String guestMessage;

    @Size(min = 1, max = 511, message = "Message must be between 1 and 511 characters")
    private String reply;

}
