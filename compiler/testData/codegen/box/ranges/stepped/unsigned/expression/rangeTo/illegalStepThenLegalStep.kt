// Auto-generated by GenerateSteppedRangesCodegenTestData. Do not edit!
// DONT_TARGET_EXACT_BACKEND: WASM
// KJS_WITH_FULL_RUNTIME
// WITH_RUNTIME
import kotlin.test.*

fun box(): String {
    assertFailsWith<IllegalArgumentException> {
        val uintProgression = 1u..7u
        for (i in uintProgression step 0 step 2) {
        }
    }

    assertFailsWith<IllegalArgumentException> {
        val ulongProgression = 1uL..7uL
        for (i in ulongProgression step 0L step 2L) {
        }
    }

    return "OK"
}