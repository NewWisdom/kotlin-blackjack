package dsl

// 위임 패턴
class Languages(private val languages: MutableList<Pair<String, Int>> = mutableListOf()) :
    List<Pair<String, Int>> by languages {

    infix fun String.level(other: Int) = languages.add(Pair(this, other))
}