package id.infinitelearning.KotlinSubmission.exercise2

fun main() {

    /** Latihan 1 List
    Buatlah sebuah variabel bertipe list dengan ketentuan:
    - List tersebut menampung bilangan genap dari 1 hingga 100
    Optional:
    - Agar lebih mudah, gunakanlah for loop dan logika if untuk mengisi bilangan genap pada list
     */
    val listBilangan = mutableListOf<Int>()

    for (i in 1..100) {
        if (i % 2 == 0) {
            listBilangan.add(i)
        }
        }
    println("Bilangan Genap dari 1 hingga 100:")
    println(listBilangan)
}


    /** Latihan 2 Map
    Buatlah variabel bertipe Map dengan kriteria:
    Daftar nama bulan dalam setahun,
    - Set Key nya dengan inisial nama bulan dan Value nya nama bulan, contoh
    - key "Jan", value January
    - key "Feb", value February
    - dst...*/
    val monthMap = mapOf(
    "Jan" to "January",
    "Feb" to "February",
    "Mar" to "Maret",
    "Apr" to "April",
    "May" to "May",
    "Jun" to "Juni",
    "Jul" to "Juli",
    "Aug" to "Agustus",
    "Sep" to "September",
    "Oct" to "Oktober",
    "Nov" to "November",
    "Des" to "Desember"
    )

    /**Cetak semua nama bulan dengan fungsi forEach sehingga hasil output seperti:
    - Jan -> January
    - Feb -> February
    - Dst...*/
    println("---- Nama-Nama Bulan=====")
    monthMap.forEach { (key, value) ->
    println("$key -> $value")
    }

    /**Cetak nama bulan sekarang dan bulan lahir kamu dengan format string berikut:
    - "It's {$monthNow} now, I was born in {$birthMonth}"
     */
    val monthNow = "Nov"
    val birthMonth = "Oct"

    val output = "It's ${monthMap[monthNow]} now, I was born in ${monthMap[birthMonth]}"
    println(output)


}