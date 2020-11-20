// Auto-generated by GenerateSteppedRangesCodegenTestData. Do not edit!
// KOTLIN_CONFIGURATION_FLAGS: +JVM.USE_OLD_INLINE_CLASSES_MANGLING_SCHEME
// DONT_TARGET_EXACT_BACKEND: WASM
// KJS_WITH_FULL_RUNTIME
// WITH_RUNTIME
import kotlin.test.*

fun box(): String {
    val uintList = mutableListOf<UInt>()
    for (i in 6u downTo 1u step 2 step 1) {
        uintList += i
    }
    assertEquals(listOf(6u, 5u, 4u, 3u, 2u), uintList)

    val ulongList = mutableListOf<ULong>()
    for (i in 6uL downTo 1uL step 2L step 1L) {
        ulongList += i
    }
    assertEquals(listOf(6uL, 5uL, 4uL, 3uL, 2uL), ulongList)

    return "OK"
}