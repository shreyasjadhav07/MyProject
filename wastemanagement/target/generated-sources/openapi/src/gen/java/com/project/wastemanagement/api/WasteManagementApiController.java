package com.project.wastemanagement.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-19T22:03:52.612060600+05:30[Asia/Calcutta]")
@Controller
@RequestMapping("${openapi.wasteManagement.base-path:}")
public class WasteManagementApiController implements WasteManagementApi {

    private final WasteManagementApiDelegate delegate;

    public WasteManagementApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) WasteManagementApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new WasteManagementApiDelegate() {});
    }

    @Override
    public WasteManagementApiDelegate getDelegate() {
        return delegate;
    }

}
