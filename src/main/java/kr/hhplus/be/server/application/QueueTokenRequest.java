package kr.hhplus.be.server.application;


import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "유저 대기열 토큰 요청 DTO")
public class QueueTokenRequest {
    @Schema(description = "유저 ID", example = "1")
    private Long userId;

    public QueueTokenRequest() {}

    public QueueTokenRequest(Long userId) {
        this.userId = userId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
