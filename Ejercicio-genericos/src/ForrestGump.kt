import java.util.Random

class ForrestGump <T> (private val life: RandomBox<T>) {

    fun theLineForrest(): String {
        val picked = life.pickOne()

        if (picked == null) {
            return "Life sucks..."
        }

        return "Life is like a box of chocolates \n${picked}"
    }
}