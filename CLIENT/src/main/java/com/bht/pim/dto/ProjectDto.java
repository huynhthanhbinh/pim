package com.bht.pim.dto;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.StringProperty;
import lombok.*;
import lombok.extern.log4j.Log4j;

import java.time.LocalDate;
import java.util.List;

/**
 * @author bht
 */
@Log4j
@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
@Builder(toBuilder = true, builderClassName = "Builder", builderMethodName = "newBuilder")
public class ProjectDto {

    private BooleanProperty isSelected;

    @NonNull
    private long id;

    private long number;
    private String name;
    private String customer;
    private StringProperty status;
    private LocalDate start;
    private LocalDate end;
    private GroupDto group;
    private List<EmployeeDto> members;
}
