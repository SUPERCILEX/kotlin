// Auto-generated by GenerateSteppedRangesCodegenTestData. Do not edit!
// KOTLIN_CONFIGURATION_FLAGS: +JVM.USE_OLD_INLINE_CLASSES_MANGLING_SCHEME
// DONT_TARGET_EXACT_BACKEND: WASM
// KJS_WITH_FULL_RUNTIME
// WITH_RUNTIME
import kotlin.test.*

fun box(): String {
    val uintList = mutableListOf<UInt>()
    val uintProgression = 1u..10u
    for (i in (uintProgression step 2).reversed() step 3) {
        uintList += i
    }
    assertEquals(listOf(9u, 6u, 3u), uintList)

    val ulongList = mutableListOf<ULong>()
    val ulongProgression = 1uL..10uL
    for (i in (ulongProgression step 2L).reversed() step 3L) {
        ulongList += i
    }
    assertEquals(listOf(9uL, 6uL, 3uL), ulongList)

    return "OK"
}