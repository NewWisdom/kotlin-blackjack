package domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class PlayerTest {
    @Test
    @DisplayName("플레이어 생성")
    internal fun create() {
        val name = "amazzi"
        val player = Player(name)
        assertThat(player.name).isEqualTo(name)
    }

    @Test
    @DisplayName("카드한장을 받는다")
    internal fun drawCard() {
        val player = Player("aron")
        val card = Card(Symbol.DIAMOND, Value.SEVEN)
        player.draw(card)

        assertThat(player.hand.cards).hasSize(1)
        assertThat(player.hand.cards).contains(card)
    }
}