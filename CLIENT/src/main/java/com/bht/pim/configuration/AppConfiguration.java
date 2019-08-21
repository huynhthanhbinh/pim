package com.bht.pim.configuration;

import com.bht.pim.mapper.*;
import com.bht.pim.property.LanguageProperty;
import com.bht.pim.proto.employees.EmployeeServiceGrpc;
import com.bht.pim.proto.groups.GroupServiceGrpc;
import com.bht.pim.proto.projects.ProjectServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import lombok.extern.log4j.Log4j;
import org.mapstruct.factory.Mappers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Locale;

@Log4j
@ComponentScan("com.bht.pim")
@Configuration
public class AppConfiguration {

    public static final LanguageProperty LANGUAGE_PROPERTY =
            new LanguageProperty(Locale.FRENCH);

    public AppConfiguration() {
        log.info("[PIM] On init configuration beans !\n");
    }

    private static final int PORT = 9999;
    private static final String HOST = "localhost";

    // Channel is the abstraction to connect to a service endpoint
    // Let's use plaintext communication because we don't have certs
    private final ManagedChannel channel = ManagedChannelBuilder
            .forAddress(HOST, PORT)
            .usePlaintext()
            .maxInboundMessageSize(10 * 1024 * 1024)
            .build();

    public static final String PERSPECTIVE = "idPIMPerspective";
    public static final String LANGUAGE_BUNDLES = "bundles.languageBundle";

    public static final String TARGET_CONTAINER_TOP = "PTop";
    public static final String TARGET_CONTAINER_LEFT = "PLeft";
    public static final String TARGET_CONTAINER_MAIN = "PMain";

    public static final String COMPONENT_TOP = "idcTop";
    public static final String COMPONENT_LEFT = "idcLeft";
    public static final String COMPONENT_MAIN = "idcMain";

    public static final String FRAGMENT_MAIN_LABEL = "idfMLabel"; // label of main-pane
    public static final String FRAGMENT_CONFIRM = "idfConfirm"; // ok_cancel box
    public static final String FRAGMENT_PAGINATION = "idFPagination"; // pagination-pane

    public static final String FRAGMENT_PROJECT_LIST = "idfPList";
    public static final String FRAGMENT_PROJECT_INFO = "idfPInfo";
    public static final String FRAGMENT_PROJECT_CREATE = "idfPCreate";
    public static final String FRAGMENT_PROJECT_UPDATE = "idfPUpdate";

    public static final String FRAGMENT_PROJECT_UTIL = "idfPUtil";
    public static final String FRAGMENT_PROJECT_TABLE = "idfPTable";
    public static final String FRAGMENT_PROJECT_EDIT_FORM = "iffPEditForm";

    public static final String FRAGMENT_GROUP_LIST = "idfGList";
    public static final String FRAGMENT_GROUP_INFO = "idfGInfo";

    public static final String FRAGMENT_EMPLOYEE_LIST = "idfEList";
    public static final String FRAGMENT_EMPLOYEE_INFO = "idfEInfo";

    public static final String LABEL_PIM_MAIN = "label.pim.main";
    public static final String LABEL_LEFT_LIST_PROJECT = "label.pim.left.list.project";
    public static final String LABEL_LEFT_LIST_GROUP = "label.pim.left.list.group";
    public static final String LABEL_LEFT_LIST_EMPLOYEE = "label.pim.left.list.employee";

    public static final String LABEL_PROJECT_LIST = "label.project.list";
    public static final String LABEL_PROJECT_CREATE = "label.project.create";
    public static final String LABEL_PROJECT_INFO = "label.project.info";
    public static final String LABEL_PROJECT_UPDATE = "label.project.update";

    public static final String LABEL_CONFIRM_CREATE = "label.confirm.form.create";
    public static final String LABEL_CONFIRM_UPDATE = "label.confirm.form.update";
    public static final String LABEL_CONFIRM_CANCEL = "label.confirm.form.cancel";

    @Bean
    public EmployeeServiceGrpc.EmployeeServiceBlockingStub employeeServiceBlockingStub() {
        log.info("[PIM] Creating bean of < EmployeeServiceBlockingStub >");
        return EmployeeServiceGrpc.newBlockingStub(channel);
    }

    @Bean
    public GroupServiceGrpc.GroupServiceBlockingStub groupServiceBlockingStub() {
        log.info("[PIM] Creating bean of < GroupServiceBlockingStub >");
        return GroupServiceGrpc.newBlockingStub(channel);
    }

    @Bean
    public ProjectServiceGrpc.ProjectServiceBlockingStub projectServiceBlockingStub() {
        log.info("[PIM] Creating bean of < ProjectServiceBlockingStub >");
        return ProjectServiceGrpc.newBlockingStub(channel);
    }

    @Bean
    public StatusMapper statusMapper() {
        log.info("[PIM] Creating bean of < StatusMapper >");
        return Mappers.getMapper(StatusMapper.class);
    }

    @Bean
    public DateTimeMapper dateTimeMapper() {
        log.info("[PIM] Creating bean of < DateTimeMapper >");
        return Mappers.getMapper(DateTimeMapper.class);
    }

    @Bean
    public EmployeeMapper employeeMapper() {
        log.info("[PIM] Creating bean of < EmployeeMapper >");
        return Mappers.getMapper(EmployeeMapper.class);
    }

    @Bean
    public GroupMapper groupMapper() {
        log.info("[PIM] Creating bean of < GroupMapper >");
        return Mappers.getMapper(GroupMapper.class);
    }

    @Bean
    public ProjectMapper projectMapper() {
        log.info("[PIM] Creating bean of < ProjectMapper >");
        return Mappers.getMapper(ProjectMapper.class);
    }
}