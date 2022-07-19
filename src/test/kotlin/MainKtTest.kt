import org.junit.Test

import org.junit.Assert.*
import ru.netology.calcCommission

class MainKtTest {

    @Test
    fun calcCommissionVisa() {
        // 1 - arrange
        val typeCard: String = "Visa"
        val prevSum: Int = 35_000 * 100 // 35 тыщ руб в копейках
        val sum: Int = 15_000 * 100 // 15 тыщ руб в копейках

        // 2 - act
        val res = calcCommission(typeCard,prevSum, sum)

        // 3 - assert
        assertEquals(11250,res)
    }

    @Test
    fun calcCommissionMaestro() {
        // 1 - arrange
        val typeCard: String = "Maestro"
        val prevSum: Int = 75_000 * 100 // 35 тыщ руб в копейках
        val sum: Int = 15_000 * 100 // 15 тыщ руб в копейках

        // 2 - act
        val res = calcCommission(typeCard, prevSum, sum)

        // 3 - assert
        assertEquals(9020, res)
    }

    @Test
    fun calcCommissionVK() {
        // 1 - arrange
        val typeCard: String = "Maestro"
        val prevSum: Int = 35_000 * 100 // 35 тыщ руб в копейках
        val sum: Int = 15_000 * 100 // 15 тыщ руб в копейках

        // 2 - act
        val res = calcCommission(typeCard, prevSum, sum)

        // 3 - assert
        //assertEquals(0, res)
        assertEquals(1, res)
    }
}