package se.inyat.todo_list_application.data.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class PersonDTOView {

    private Long id;
    private String name;

}