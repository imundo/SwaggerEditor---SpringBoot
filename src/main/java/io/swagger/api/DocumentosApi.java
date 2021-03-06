/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.5).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Documentos;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-05-07T16:36:30.252Z")

@Api(value = "Documentos", description = "the Documentos API")
public interface DocumentosApi {

    @ApiOperation(value = "Add nuevo Documentos a el almance", nickname = "addDocumento", notes = "", authorizations = {
        @Authorization(value = "petstore_auth", scopes = {
            @AuthorizationScope(scope = "write:documentos", description = "modify documentos in your account"),
            @AuthorizationScope(scope = "read:documentos", description = "read your documentos")
            })
    }, tags={ "Documentos", })
    @ApiResponses(value = { 
        @ApiResponse(code = 405, message = "Invalid input") })
    @RequestMapping(value = "/Documentos",
        produces = { "application/xml", "application/json" }, 
        consumes = { "application/json", "application/xml" },
        method = RequestMethod.POST)
    ResponseEntity<Void> addDocumento(@ApiParam(value = "Pet object that needs to be added to the store" ,required=true )  @Valid @RequestBody Documentos body);


    @ApiOperation(value = "Update an existing documento", nickname = "updateDocumento", notes = "", authorizations = {
        @Authorization(value = "petstore_auth", scopes = {
            @AuthorizationScope(scope = "write:documentos", description = "modify documentos in your account"),
            @AuthorizationScope(scope = "read:documentos", description = "read your documentos")
            })
    }, tags={ "Documentos", })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid ID supplied"),
        @ApiResponse(code = 404, message = "Pet not found"),
        @ApiResponse(code = 405, message = "Validation exception") })
    @RequestMapping(value = "/Documentos",
        produces = { "application/xml", "application/json" }, 
        consumes = { "application/json", "application/xml" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> updateDocumento(@ApiParam(value = "Pet object that needs to be added to the store" ,required=true )  @Valid @RequestBody Documentos body);

}
