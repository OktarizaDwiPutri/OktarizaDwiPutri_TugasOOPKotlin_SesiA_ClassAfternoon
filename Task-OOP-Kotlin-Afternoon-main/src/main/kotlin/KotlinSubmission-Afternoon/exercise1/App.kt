package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    val firstName : String = "Oktariza"
    val lastName : String = "Dwi Putri"
    val age : Number = 20
    val status : Boolean = true

    println("Nama depan saya yaitu $firstName")
    println("Nama belakang saya yaitu $lastName")
    println("Saat ini saya berumur $age tahun")
    println("Status saya ${if (status) "Single" else "Tidak Single"}")
}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
    val groupId = "Kuda Terbang"
    val groupMember = ListOf("Okta", "Ella", "Reza", "Wendi", "Messy", "Andre", "Kukuh", "Hary", "Ainul", "Jesika", "Laila")
    val session = "Afternoon"

    println("Group ID = $groupId")
    println("Group Member = $groupMember")
    println("Session = $session")
    return "Unit"
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<Any> {
    val groupMember = ListOf("Okta","Wendi","Ella","Reza","Messy")
    val myName = groupMember []
    println("Nama saya : $myName")
    return groupMember
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf<String>("Reynaldi","Malik")
    val countOfGroup = arrayOf<String>("Okta", "Ella", "Reza", "Wendi", "Messy", "Andre", "Kukuh", "Hary", "Ainul", "Jesika", "Laila")
    val total = mentor.size + countOfGroup.size
    return total
}

fun main() {

    myProfile()

    val myTeam = myTeam()
    println("My team is: $myTeam")

    val totalMember = totalMember()
    println("Total Member group : $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail(groupId = "", listOf(), session =  "")

}