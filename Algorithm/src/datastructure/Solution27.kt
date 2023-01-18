package datastructure

// Programmers
class Solution27 {
    fun solution(ingredient: IntArray): Int {
        var answer = 0
        val burger = "1231"
        val ingredientStr = StringBuilder()

        ingredient.forEach {
            ingredientStr.append(it)

            val startIdx = ingredientStr.length - 4
            val finishIdx = ingredientStr.length

            if (ingredientStr.length >= burger.length) {
                if (ingredientStr.substring(startIdx) == burger) {
                    ingredientStr.delete(startIdx, finishIdx)
                    answer++
                }
            }
        }

        return answer
    }
}

// TODO: remove before submit
fun main() {
    val sol = Solution27()
    val intArray = intArrayOf(2, 1, 1, 2, 3, 1, 2, 3, 1)

    // should be 2
    println(sol.solution(intArray))
}
