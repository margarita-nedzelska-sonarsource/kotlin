// IGNORE_BACKEND: WASM
// WASM_MUTE_REASON: STDLIB_LAZY
//WITH_RUNTIME

fun box(): String {
    var methodVar = "OK"

    fun localMethod() : String
    {
        return lazy { methodVar }::value.get()
    }

    return localMethod()
}