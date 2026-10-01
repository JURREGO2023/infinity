package com.infinity.user.ms_user.controller.doc;

import com.infinity.user.ms_user.dto.UserDTO;
import com.infinity.user.ms_user.model.UserEntity;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import java.awt.*;

public interface IUserDoc {

    @Operation(
            summary = "create user",
            description = "This operation is for creating users"
    )
    @ApiResponses(
            value= {
                    @ApiResponse(
                            responseCode = "201", description = "User created",
                            content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE)
                    ),
                    @ApiResponse(
                            responseCode = "400", description = "bad request",
                            content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE)
                    )
            }
    )
    ResponseEntity<UserEntity> create(
            @RequestBody UserDTO user);
}
