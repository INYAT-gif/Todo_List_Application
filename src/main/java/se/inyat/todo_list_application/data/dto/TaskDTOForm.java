package se.inyat.todo_list_application.data.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Builder
public class TaskDTOForm {

    @PositiveOrZero(message = "ID must be a positive number or zero")
    private Long id;

    @NotBlank(message = "Title is required")
    private String title;

    private String description;

    @FutureOrPresent(message = "Deadline must be in the present or future")
    private LocalDate deadline;

    private boolean done;

    @NotNull
    @Valid
    private PersonDTOForm person;

}