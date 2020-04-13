package subtask4

import java.lang.StringBuilder

class Pangram {

    fun getResult(inputString: String): String {
        val vowels = arrayOf('a', 'e', 'i', 'o', 'u', 'y')
        val consonants = arrayOf('b', 'd', 'g', 'v', 'm', 'n', 'w', 'l', 'r', 'j', 'z', 'p', 't', 'k', 'f', 's', 'c', 'h', 'x', 'q')
        val str = inputString.split(' ').filter { it.isNotEmpty() && it != "\n" }
        var word = if (str.isNotEmpty()) str[0].toCharArray() else return ""
        var count = 0
        var i = 0
        var j = 0
        val res = StringBuilder()
        val wordsFlgs = Array(26) { 0 }
        for (k in inputString) if (k in 'a'..'z' && wordsFlgs[k - 'a'] == 0) wordsFlgs[k - 'a'] = 1
        else if (k in 'A'..'Z' && wordsFlgs[k - 'A'] == 0) wordsFlgs[k - 'A'] = 1
        if (wordsFlgs.sum() == 26)
            while (i < str.size) {
                while (j < word.size) {
                    if (vowels.contains(word[j]) || vowels.contains(word[j].toLowerCase())) {
                        word[j] = word[j].toUpperCase()
                        count++
                    }
                    j++
                }
                res.append(count.toString() + word.joinToString("") + " ")
                count = 0
                j = 0
                if (i != str.size - 1) word = str[++i].toCharArray() else break
            }
        else
            while (i < str.size) {
                while (j < word.size) {
                    if (consonants.contains(word[j]) || consonants.contains(word[j].toLowerCase())) {
                        word[j] = word[j].toUpperCase()
                        count++
                    }
                    j++
                }
                res.append(count.toString() + word.joinToString("") + " ")
                count = 0
                j = 0
                if (i != str.size - 1) word = str[i++ + 1].toCharArray() else break
            }
        return res.toString().split(' ').dropLast(1).sortedBy { it[0] }.joinToString(" ")
    }
}
