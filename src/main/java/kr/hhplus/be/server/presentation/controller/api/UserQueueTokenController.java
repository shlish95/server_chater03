package kr.hhplus.be.server.presentation.controller.api;

import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import kr.hhplus.be.server.application.QueueTokenRequest;
import kr.hhplus.be.server.application.QueueTokenResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;

@RestController
@RequestMapping("/api/queue")
@Tag(name = "User Queue Token", description = "유저 대기열 토큰 관리 API")
public class UserQueueTokenController {

    @PostMapping("/token")
    @Operation(
            summary = "유저 대기열 토큰 발급",
            description = "사용자가 대기열에 진입할 때 토큰을 발급합니다.",
            responses = {
                    @ApiResponse(responseCode = "200", description = "성공",
                            content = @Content(mediaType = "application/json",
                                    schema = @Schema(implementation = QueueTokenResponse.class))
                    ),
                    @ApiResponse(responseCode = "400", description = "잘못된 요청")
            }
    )
    public ResponseEntity<QueueTokenResponse> issueToken(@RequestBody QueueTokenRequest request) {
        // Mock Response
        QueueTokenResponse response = new QueueTokenResponse("abc123xyz", "2025-04-05T10:30:00Z");
        return ResponseEntity.ok(response);
    }

}
