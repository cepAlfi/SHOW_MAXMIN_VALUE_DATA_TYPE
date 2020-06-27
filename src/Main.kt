class ShowValue() {
    private val minInt = Int.MIN_VALUE
    private val maxInt = Int.MAX_VALUE
    private val minShort = Short.MIN_VALUE
    private val maxShort = Short.MAX_VALUE
    private val minLong = Long.MIN_VALUE
    private val maxLong = Long.MAX_VALUE
    private val minFloat = Float.MIN_VALUE
    private val maxFloat = Float.MAX_VALUE
    private val minDouble = Double.MIN_VALUE
    private val maxDouble = Double.MAX_VALUE

    fun showMinInt(): Int = minInt

    fun showMaxInt(): Int = maxInt

    fun showMinShort(): Short = minShort

    fun showMaxShort(): Short = maxShort

    fun showMinLong(): Long = minLong

    fun showMaxLong(): Long = maxLong

    fun showMinFloat(): Float = minFloat

    fun showMaxFloat(): Float = maxFloat

    fun showMinDouble(): Double = minDouble

    fun showMaxDouble(): Double = maxDouble

}

fun main() {
    println("Nilai Minimal Tipe Data INTEGER adalah ${ShowValue().showMinInt()}")
    println("Nilai Maksimal Tipe Data INTEGER adalah ${ShowValue().showMaxInt()}")
    println("========================")
    println("Nilai Minimal Tipe Data SHORT adalah ${ShowValue().showMinShort()}")
    println("Nilai Maksimal Tipe Data SHORT adalah ${ShowValue().showMaxShort()}")
    println("========================")
    println("Nilai Minimal Tipe Data LONG adalah ${ShowValue().showMinLong()}")
    println("Nilai Maksimal Tipe Data LONG adalah ${ShowValue().showMaxLong()}")
    println("========================")
    println("Nilai Minimal Tipe Data FLOAT adalah ${ShowValue().showMinFloat()}")
    println("Nilai Maksimal Tipe Data FLOAT adalah ${ShowValue().showMaxFloat()}")
    println("========================")
    println("Nilai Minimal Tipe Data DOUBLE adalah ${ShowValue().showMinDouble()}")
    println("Nilai Maksimal Tipe Data DOUBLE adalah ${ShowValue().showMaxDouble()}")
}
