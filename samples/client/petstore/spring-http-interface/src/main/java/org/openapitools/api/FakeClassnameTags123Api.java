/*
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.15.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.ClientDto;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.service.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.15.0-SNAPSHOT")
public interface FakeClassnameTags123Api {

    /**
     * PATCH /fake_classname_test : To test class name in snake case
     * To test class name in snake case
     *
     * @param clientDto client model (required)
     * @return successful operation (status code 200)
     */
    @HttpExchange(
        method = "PATCH",
        value = "/fake_classname_test",
        accept = { "application/json" },
        contentType = "application/json"
    )
    ResponseEntity<ClientDto> testClassname(
         @RequestBody ClientDto clientDto
    );

}
