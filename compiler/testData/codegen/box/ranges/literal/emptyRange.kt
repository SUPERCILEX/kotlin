// DONT_TARGET_EXACT_BACKEND: WASM
// KJS_WITH_FULL_RUNTIME
// Auto-generated by org.jetbrains.kotlin.generators.tests.GenerateRangesCodegenTestData. DO NOT EDIT!
// WITH_RUNTIME



fun box(): String {
    val list1 = ArrayList<Int>()
    for (i in 10..5) {
        list1.add(i)
        if (list1.size > 23) break
    }
    if (list1 != listOf<Int>()) {
        return "Wrong elements for 10..5: $list1"
    }

    val list2 = ArrayList<Int>()
    for (i in 10.toByte()..(-5).toByte()) {
        list2.add(i)
        if (list2.size > 23) break
    }
    if (list2 != listOf<Int>()) {
        return "Wrong elements for 10.toByte()..(-5).toByte(): $list2"
    }

    val list3 = ArrayList<Int>()
    for (i in 10.toShort()..(-5).toShort()) {
        list3.add(i)
        if (list3.size > 23) break
    }
    if (list3 != listOf<Int>()) {
        return "Wrong elements for 10.toShort()..(-5).toShort(): $list3"
    }

    val list4 = ArrayList<Long>()
    for (i in 10L..-5L) {
        list4.add(i)
        if (list4.size > 23) break
    }
    if (list4 != listOf<Long>()) {
        return "Wrong elements for 10L..-5L: $list4"
    }

    val list5 = ArrayList<Char>()
    for (i in 'z'..'a') {
        list5.add(i)
        if (list5.size > 23) break
    }
    if (list5 != listOf<Char>()) {
        return "Wrong elements for 'z'..'a': $list5"
    }

    return "OK"
}
