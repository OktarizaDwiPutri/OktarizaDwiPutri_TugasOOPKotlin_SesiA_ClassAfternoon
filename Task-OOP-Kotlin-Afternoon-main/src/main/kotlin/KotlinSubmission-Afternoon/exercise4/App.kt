package id.infinitelearning.KotlinSubmission.exercise4

fun main() {

    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    val inputString = "123abc"
try {
    val integerValue = inputString.toInt()
    println("String berhasil diubah menjadi integer: $integerValue")
} catch (e: NumberFormatException) {
    println("Gagal mengonversi string ke integer. Kesalahan: ${e.message}")
}
}
