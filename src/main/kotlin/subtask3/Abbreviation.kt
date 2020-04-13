package subtask3

class Abbreviation {

    fun abbreviationFromA(a: String, b: String): String {
        val s = a.toUpperCase()
        var index1 = 0
        var index2 = 0
        for (i in b) if (s.contains(i) && b.indexOf(i) >= index2 && s.indexOf(i) >= index1) {
            index1 = s.indexOf(i)
            index2 = b.indexOf(i)
        } else return "NO"
        return "YES"
    }
}
