package com.hotelprauriu.app.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "Logs")
@Getter
@Setter
public class Log {

    /**
     * Enumeración que representa las acciones posibles para un mensaje de registro.
     */
    public enum Action {
        PET,
        SIGNUP,
        LOGIN_SUCCESS,
        LOGIN_ERROR,
        LOGOUT
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    @Enumerated(EnumType.STRING)
    private Action action;

    @NotBlank
    private String message;

}
