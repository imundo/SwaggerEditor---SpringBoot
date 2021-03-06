/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.5).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Documentos;
import io.swagger.model.ModelApiResponse;
import org.springframework.core.io.Resource;
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

@Api(value = "docs", description = "the docs API")
public interface DocsApi {

    @ApiOperation(value = "Deletes a documentos", nickname = "deleteDocumentos", notes = "", authorizations = {
        @Authorization(value = "petstore_auth", scopes = {
            @AuthorizationScope(scope = "write:documentos", description = "modify documentos in your account"),
            @AuthorizationScope(scope = "read:documentos", description = "read your documentos")
            })
    }, tags={ "Documentos", })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid ID supplied"),
        @ApiResponse(code = 404, message = "Doc not found") })
    @RequestMapping(value = "/docs/{docId}",
        produces = { "application/xml", "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteDocumentos(@ApiParam(value = "Doc id to delete",required=true) @PathVariable("docId") Long docId,@ApiParam(value = "" ) @RequestHeader(value="api_key", required=false) String apiKey);


    @ApiOperation(value = "encontrar documento by status", nickname = "findDocumentoByStatus", notes = "Multiple status values can be provided with comma separated strings", response = Documentos.class, responseContainer = "List", authorizations = {
        @Authorization(value = "petstore_auth", scopes = {
            @AuthorizationScope(scope = "write:documentos", description = "modify documentos in your account"),
            @AuthorizationScope(scope = "read:documentos", description = "read your documentos")
            })
    }, tags={ "Documentos", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Documentos.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid status value") })
    @RequestMapping(value = "/docs/findByStatus",
        produces = { "application/xml", "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Documentos>> findDocumentoByStatus(@NotNull @ApiParam(value = "Status values that need to be considered for filter", required = true, allowableValues = "available, pending, sold") @Valid @RequestParam(value = "status", required = true) List<String> status);


    @ApiOperation(value = "Finds documentos by tags", nickname = "findDocumentosByTags", notes = "Muliple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.", response = Documentos.class, responseContainer = "List", authorizations = {
        @Authorization(value = "petstore_auth", scopes = {
            @AuthorizationScope(scope = "write:documentos", description = "modify documentos in your account"),
            @AuthorizationScope(scope = "read:documentos", description = "read your documentos")
            })
    }, tags={ "Documentos", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Documentos.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid tag value") })
    @RequestMapping(value = "/docs/findByTags",
        produces = { "application/xml", "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Documentos>> findDocumentosByTags(@NotNull @ApiParam(value = "Tags to filter by", required = true) @Valid @RequestParam(value = "tags", required = true) List<String> tags);


    @ApiOperation(value = "Find doc by ID", nickname = "getDocumentosById", notes = "Returns a single doc", response = Documentos.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "Documentos", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Documentos.class),
        @ApiResponse(code = 400, message = "Invalid ID supplied"),
        @ApiResponse(code = 404, message = "Doc not found") })
    @RequestMapping(value = "/docs/{docId}",
        produces = { "application/xml", "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Documentos> getDocumentosById(@ApiParam(value = "ID of pet to return",required=true) @PathVariable("docId") Long docId);


    @ApiOperation(value = "Updates a pet in the store with form data", nickname = "updateDocWithForm", notes = "", authorizations = {
        @Authorization(value = "petstore_auth", scopes = {
            @AuthorizationScope(scope = "write:documentos", description = "modify documentos in your account"),
            @AuthorizationScope(scope = "read:documentos", description = "read your documentos")
            })
    }, tags={ "Documentos", })
    @ApiResponses(value = { 
        @ApiResponse(code = 405, message = "Invalid input") })
    @RequestMapping(value = "/docs/{docId}",
        produces = { "application/xml", "application/json" }, 
        consumes = { "application/x-www-form-urlencoded" },
        method = RequestMethod.POST)
    ResponseEntity<Void> updateDocWithForm(@ApiParam(value = "ID of doc that needs to be updated",required=true) @PathVariable("docId") Long docId,@ApiParam(value = "Updated name of the doc") @RequestParam(value="name", required=false)  String name,@ApiParam(value = "Updated status of the doc") @RequestParam(value="status", required=false)  String status);


    @ApiOperation(value = "uploads an image", nickname = "uploadFile", notes = "", response = ModelApiResponse.class, authorizations = {
        @Authorization(value = "petstore_auth", scopes = {
            @AuthorizationScope(scope = "write:documentos", description = "modify documentos in your account"),
            @AuthorizationScope(scope = "read:documentos", description = "read your documentos")
            })
    }, tags={ "Documentos", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ModelApiResponse.class) })
    @RequestMapping(value = "/docs/{docId}/uploadImage",
        produces = { "application/json" }, 
        consumes = { "multipart/form-data" },
        method = RequestMethod.POST)
    ResponseEntity<ModelApiResponse> uploadFile(@ApiParam(value = "ID of doc to update",required=true) @PathVariable("docId") Long docId,@ApiParam(value = "Additional data to pass to server") @RequestParam(value="additionalMetadata", required=false)  String additionalMetadata,@ApiParam(value = "file detail") @Valid @RequestPart("file") MultipartFile file);

}
