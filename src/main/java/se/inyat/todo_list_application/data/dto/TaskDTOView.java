package se.inyat.todo_list_application.data.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Builder
public class TaskDTOView {
    private Long id;
    private String title;
    private String description;
    private LocalDate deadline;
    private boolean done;
    private PersonDTOForm person;

}