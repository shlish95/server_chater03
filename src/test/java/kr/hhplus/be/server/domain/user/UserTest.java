package kr.hhplus.be.server.domain.user;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.assertj.core.api.Assertions.*;


@DisplayName("User 도메인 테스트")
class UserTest {

    @Test
    void 잔액보다_큰_금액의_경우_예외처리() {
        //given
        User user = new User(UUID.randomUUID(), "kim", 10000);

        //when
        //then
        assertThatThrownBy(() -> {
                    user.pay(15000);
                })
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("잔액이 부족합니다.");
    }

    @Test
    void 잔액보다_작은_금액_차감() {
        //given
        User user1 = new User(UUID.randomUUID(), "kim", 10000);

        //when
        user1.pay(500);

        //then
        assertThat(user1.getBalance()).isEqualTo(10000 - 500);
    }

    @Test
    void 충전_0보다_작은_금액() {
        //given
        User user2 = new User(UUID.randomUUID(), "kim", 0);

        //when
        //then
        assertThatThrownBy(() -> {
                user2.charge(0);
            })
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("충전 금액은 0원 보다 커야합니다.");

        assertThatThrownBy(() -> {
            user2.charge(-100);
        })
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("충전 금액은 0원 보다 커야합니다.");
    }

    @Test
    void 사용_0보다_작은_금액() {
        //given
        User user3 = new User(UUID.randomUUID(), "kim", 0);

        //when
        //then
        assertThatThrownBy(() -> {
            user3.pay(0);
        })
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("사용 금액은 0원 보다 커야합니다.");

        assertThatThrownBy(() -> {
            user3.pay(-100);
        })
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("사용 금액은 0원 보다 커야합니다.");
    }
}