package com.bht.pim.mapper;

import com.bht.pim.entity.EmployeeEntity;
import com.bht.pim.proto.employees.Employee;
import org.mapstruct.CollectionMappingStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED,
        uses = CustomizedMapper.class, componentModel = "spring")
public interface EmployeeMapper {

    @Mappings({
            @Mapping(source = "employeeEntity", target = "employeeInfo"),
            @Mapping(source = "enrolledProjects", target = "enrolledProjectsList")})
    Employee toEmployee(final EmployeeEntity employeeEntity);
}