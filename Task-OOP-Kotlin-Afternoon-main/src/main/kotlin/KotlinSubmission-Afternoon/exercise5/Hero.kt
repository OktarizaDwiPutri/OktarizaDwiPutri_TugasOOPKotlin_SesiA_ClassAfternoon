package id.infinitelearning.KotlinSubmission.exercise5
class Hero {

    private var name: String? = null
    private var age = 0
    private var height = 0

    private var health = 20

    fun setProfile(name: String?, age: Int, height: Int) {
        this.name = name
        this.age = age
        this.height = height
    }

    fun profile() {
        println("========= Profile =========")
        println("Name: $name")
        println("Age: $age")
        println("Height: $height")
        println("Health: $health")
        println("===========================")
    }

    private fun checkHealth() {
        if (health <= 0) {
            println("Apa sajakah kegiatan yang sudah $name lakukan hari ini? ")
        }
    }

    fun jalan() {
        checkHealth()
        println("$name berjalan santai menikmati suasana taman")
        health -= 4
    }
    fun lari() {
        checkHealth()
        println("$name berlari mengelilingi lapangan di pagi hari")
        health -= -2
    }

    fun makan() {
        checkHealth()
        println("$name makan nasi goreng dengan temannya")
        health -= +2
    }

    fun minum() {
        checkHealth()
        println("$name minum air putih setelah berlari keliling lapangan")
        health -= +2
    }

    fun lompat() {
        checkHealth()
        println("setelah berlari $name melakukan olahraga lompat tali")
        health -= -2
    }

    fun duduk() {
        checkHealth()
        println("$name duduk di kursi taman setelah berjalan santai")
        health -= +1
    }


    /**
     * Buat fungsi untuk lari, makan, minum, lompat, dan duduk. Masing2 memiliki kriteria sebagai berikut:
     - pasang fungsi checkHealth() di dalam fungsi yang akan dibuat
     - Tampilkan text kegiatan yang sedang dilakukan, misal, jika lari: "$name sedang berlari..."
     - ubah nilai variable health sesuai kegiatan yang dilakukan:
      * lari = -2
      * makan = +2
      * minum = +2
      * lompat = -2
      * duduk = +1

      Contoh fungsi bisa mengikuti fungsi jalan() diatas.

    */
    
}

