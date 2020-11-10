// Auto-generated by GenerateSteppedRangesCodegenTestData. Do not edit!
// DONT_TARGET_EXACT_BACKEND: WASM
// KJS_WITH_FULL_RUNTIME
// WITH_RUNTIME
import kotlin.test.*

fun box(): String {
    val uintList = mutableListOf<UInt>()
    for (i in 1u until 7u step 2 step 1) {
        uintList += i
    }
    assertEquals(listOf(1u, 2u, 3u, 4u, 5u), uintList)

    val ulongList = mutableListOf<ULong>()
    for (i in 1uL until 7uL step 2L step 1L) {
        ulongList += i
    }
    assertEquals(listOf(1uL, 2uL, 3uL, 4uL, 5uL), ulongList)

    return "OK"
}