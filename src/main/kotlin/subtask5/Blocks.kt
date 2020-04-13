package subtask5

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import kotlin.reflect.KClass

class Blocks {
    fun getData(blockA: Array<Any>, blockB: KClass<*>): Any {
        val arr = blockA.filterIsInstance(blockB.javaObjectType)
        return when (blockB) {
            String::class -> arr.joinToString("")
            Int::class -> arr.sumBy {  it as Int }
            else -> LocalDate.parse(arr.maxBy { it as LocalDate}.toString()).format(
                DateTimeFormatter.ofPattern("dd.MM.yyyy"))
        }
    }
}
