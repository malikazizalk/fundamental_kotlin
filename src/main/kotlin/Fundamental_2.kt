//fun main(){
//    val profile = setUser("Aziz", 23)
////    memanggil fungsi setUser() dengan dua argumen, yaitu "Aziz" dan 23.
////    Hasil yang dikembalikan oleh fungsi ini disimpan dalam variabel profile.
//    println(profile)
//}
//
//fun setUser(name: String, age: Int): String {
////    mendefinisikan fungsi setUser(). Fungsi ini menerima dua parameter,
//    //    yaitu name dengan tipe data string dan age dengan tipe data integer, dan mengembalikan sebuah string.
//
//    return "Nama ku adalah $name, dan umur ku $age tahun"
////    menggabungkan nilai name dan age ke dalam sebuah string menggunakan string template,
////    dan kemudian mengembalikan string tersebut sebagai hasil dari fungsi setUser.
//}

//fun main() {
//    val bangun = 8
//    val tidur = 23
//    val sekarang = if (bangun >= tidur || tidur < bangun) "Kerja" else "Istirahat"
////   kode berikut adalah kondisional yang digunakan untuk menentukan nilai dari variabel sekarang.
////   Ekspresi ini melakukan perbandingan antara bangun dan tidur. Jika kondisi
////   (bangun >= tidur || tidur < bangun) terpenuhi (artinya Anda bangun lebih awal atau
////   tidur lebih awal daripada waktu bangun), maka variabel sekarang akan diinisialisasi dengan string "Kerja".
////   Jika kondisi tidak terpenuhi, maka variabel sekarang akan diinisialisasi dengan string "Istirahat".
//
//    println(sekarang)
//}

//fun main() {
//    var masukKelas: String? = null
////      null digunakan untuk membuat variable yang tidak memiliki data atau
////      kita belum pasti mau menggunakan data apa
////      sebab di kotlin jjika membuat variable tanpa diberi nilai maka akan menghasilkan error
//    var absen = "masuk"
//
//    absen = "hadir"
//
//    if (absen.equals("hadir")) {
////        ini adalah suatu kondisional if yang mana jika nilai pada veriable absen sama dengan hadir
//        masukKelas = "Hari ini kamu masuk kelas"
////        Jika kondisi dalam if terpenuhi (nilai absen adalah "hadir"),
//    //    maka variabel masukKelas akan diinisialisasi dengan string "Hari ini kamu masuk kelas".
//    }
//    println(masukKelas)
//}

//fun main() {
//    val alamat = "Lombok, Nusa Tenggara Barat"
//    println("Saya berasal dari $alamat")
////    mencetak pesan ke layar "Saya berasal dari " diikuti oleh nilai dari
////    variabel alamat yang dimasukkan ke dalam string menggunakan string template
////    dengan sintaks $alamat. Dengan string template, nilai variabel alamat akan
////    digabungkan ke dalam teks sehingga pesan yang dicetak akan menjadi
////    "Saya berasal dari Lombok, Nusa Tenggara Barat".
//}

//fun main() {
//    val gol = 3
//    println("Result: ${if(gol >= 3) "Kamu Menang" else "Kamu Kalah"}")
////    mencetak pesan ke layar. Dalam string template, terdapat kondisional yang ditempatkan
////    di antara ${}. Ekspresi ini akan mengevaluasi apakah gol lebih besar atau sama dengan 3.
////    Jika kondisi tersebut terpenuhi (gol lebih besar atau sama dengan 3), pesan "Kamu Menang" akan digunakan.
////    Jika kondisi tidak terpenuhi, pesan "Kamu Kalah" akan digunakan.
//
////      string template digunakan untuk mengakses data dari luar di dalam text string
////      dengan menggunakan tanda ($) diikutin kurung kurawal '{}' untuk membuat expresi
////      yang lebih kompleks seperti menaruh suatu kondisi if else di dalamnya dll
//}
