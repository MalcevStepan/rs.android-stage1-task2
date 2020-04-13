package subtask1

import java.time.LocalDate
import java.time.format.DateTimeFormatter

class DateFormatter {

    fun toTextDay(day: String, month: String, year: String): String {
        var s = "Такого дня не существует"
        try {
            s = LocalDate.of(Integer.valueOf(year), Integer.valueOf(month), Integer.valueOf(day))
                .format(DateTimeFormatter.ofPattern("d MMMM, EEEE"))
        } finally {
            return s
        }
    }
}
