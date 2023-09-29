package io.redskap.swagger.brake.runner.openapi;

import io.redskap.swagger.brake.core.ApiInfo;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.stereotype.Component;

@Component
public class ApiInfoFactory {
    public ApiInfo create(OpenAPI openAPI) {
        Info info = openAPI.getInfo();
        ApiInfo apiInfo = new ApiInfo();
        apiInfo.setTitle(info.getTitle());
        apiInfo.setDescription(info.getDescription());
        apiInfo.setVersion(info.getVersion());
        return apiInfo;
    }
}
