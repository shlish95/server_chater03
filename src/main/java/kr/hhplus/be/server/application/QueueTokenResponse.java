package kr.hhplus.be.server.application;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "유저 대기열 토큰 응답 DTO")
public class QueueTokenResponse {
    @Schema(description = "발급된 토큰", example = "abc123xyz")
    private String token;

    @Schema(description = "토큰 만료 시간", example = "2025-04-05T10:30:00Z")
    private String expiresAt;

    public QueueTokenResponse() {}

    public QueueTokenResponse(String token, String expiresAt) {
        this.token = token;
        this.expiresAt = expiresAt;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
    }
}
