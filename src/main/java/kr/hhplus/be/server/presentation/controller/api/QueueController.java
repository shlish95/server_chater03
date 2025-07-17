package kr.hhplus.be.server.presentation.controller.api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@Tag(name = "Queue", description = "대기열 관련 API")
@RestController
public class QueueController {

//    @PostMapping("/queue/token")
//    @Operation(summary = "대기열 토큰 발급", description = "유저에게 대기열 토큰을 발급합니다.")
//    public ResponseEntity<Map<String, Object>> getQueueToken(@RequestBody QueueTokenRequest request) {
//        Map<String, Object> response = new HashMap<>();
//        response.put("userId", 1);
//        response.put("queuePosition", 10);
//        response.put("expiresAt", LocalDateTime.now().plusMinutes(10));
//
//        return ResponseEntity.ok(response);
//
}
