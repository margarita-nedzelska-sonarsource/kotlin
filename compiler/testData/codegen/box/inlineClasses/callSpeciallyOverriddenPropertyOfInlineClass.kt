// WITH_RUNTIME
// TARGET_BACKEND: JVM

@Suppress("OPTIONAL_DECLARATION_USAGE_IN_NON_COMMON_SOURCE")
@kotlin.jvm.JvmInline
value class UInt(val x: Int)

@Suppress("OPTIONAL_DECLARATION_USAGE_IN_NON_COMMON_SOURCE")
@kotlin.jvm.JvmInline
value class UIntArray(private val storage: IntArray) : Collection<UInt> {
    public override val size: Int get() = storage.size

    override operator fun iterator() = TODO()
    override fun contains(element: UInt): Boolean = TODO()
    override fun containsAll(elements: Collection<UInt>): Boolean = TODO()
    override fun isEmpty(): Boolean = TODO()
}

fun calculate(u: UIntArray): Int {
    return u.size
}

fun box(): String {
    if (calculate(UIntArray(intArrayOf(1, 2, 3, 4))) != 4) return "Fail"
    return "OK"
}