package com.project.wastemanagement.api;

import com.project.wastemanagement.dto.ErrorDto;
import com.project.wastemanagement.dto.WasteManagementDto;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * A delegate to be called by the {@link WasteManagementApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-19T22:03:52.612060600+05:30[Asia/Calcutta]")
public interface WasteManagementApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /v1/md/wm/ : Create waste details for user
     *
     * @param wasteManagementDto Create waste details for user (optional)
     * @return WasteManagement created successfully (status code 201)
     *         or Already Reported (status code 208)
     *         or Bad request (status code 400)
     *         or Unauthorized (status code 401)
     *         or Forbidden (status code 403)
     *         or Not Found (status code 404)
     *         or Internal Server Error (status code 500)
     * @see WasteManagementApi#createDetails
     */
    default ResponseEntity<WasteManagementDto> createDetails(WasteManagementDto wasteManagementDto) throws Exception {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"dustBinNo\" : \"dustBinNo\", \"weight\" : 1.4658129805029452, \"id\" : 0, \"userName\" : \"userName\", \"userNumber\" : 6 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /v1/md/wm/wastemanagement/ : get all waste detail  for users
     * get all waste detail  for users
     *
     * @return data is successfully retrieved from the database (status code 200)
     *         or Already Reported (status code 208)
     *         or Bad request (status code 400)
     *         or Unauthorized (status code 401)
     *         or Forbidden (status code 403)
     *         or Not Found (status code 404)
     *         or Internal Server Error (status code 500)
     * @see WasteManagementApi#getAllDetails
     */
    default ResponseEntity<List<WasteManagementDto>> getAllDetails() throws Exception {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"dustBinNo\" : \"dustBinNo\", \"weight\" : 1.4658129805029452, \"id\" : 0, \"userName\" : \"userName\", \"userNumber\" : 6 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
