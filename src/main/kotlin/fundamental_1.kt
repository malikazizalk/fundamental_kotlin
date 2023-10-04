//fun main() {
//    var kegiatanku: String = "MSIB"
////  terdapat sebuah variable bernama kegiatanku yang nilainya "MSIB" bertipe data string
////  var adalah variable tempat untuk menyimpan data yang datanya bisa di ubah (mutable)
//
//    kegiatanku = "Studi Independen"
////  nilai dari variable kegiatanku yang awalnya "MSIB" dirubah menjadi "Studi Independen"
////  data ini bisa di ubah sebab ini menggunakan variable bertipe mutable
//    println(kegiatanku)
////    menampilkan output akhir dari variable kegiatanku
//}

//fun main() {
//    val kampusku: String = "Universitas Hamzanwadi"
////    terdapat sebuah variable bernama kampusku yang nilainya "Universitas Hamzanwadi" bertipe data string
////      val adalah variable untuk tempat menyimpan data yang tidak bisa diubah (immutable)
//    kampusku = "Universitas Indonesia"
////    nilai dari variable kampusku yang awalnya "Universitas Hamzanwadi" dirubah menjadi "Studi Independen"
////    namun akan terjadi eror sebab data dari variable val tidak bisa di ubah
////      data ini tidak bisa di ubah dan akan menghasilkan error sebab menggunakan variable bertipe immutable
//    println(kampusku)
//}

//fun main() {
//    var alfabet ='a'
////    terdapat variable alafabet dengan tipe data char,
////    ini ditandai dengan nilai data nya yg hanya satu
////    dan menggunakan petik satu ('') untuk inisialisaisi data tersebut
//    println("Ini adalah huruf " + alfabet++) //Operator ++ (increment) adalah operator yang digunakan
//    // untuk meningkatkan satu karakter (dalam hal ini, karena nilai awal pada variable alfabeth
//    // adalah 'a' maka setelah ditambahkan operator increment maka akan menjadi 'b').
//    println("Ini adalah huruf " + alfabet++) // begitupun nilai yang akan di tampilkan di sini, nilainya akan
//    // meneruskan nilai sebelumnya kemudian ditambah satu karakter (dari 'b' ke 'c')
//    println("Ini adalah huruf " + alfabet++)
//    println("")
//    println("Ini adalah huruf " + alfabet--)//Operator -- (decrement) adalah operator yang digunakan
//    // untuk mengurangi satu karakter (dalam hal ini, karena nilai sebelumnya pada variable alfabeth
//    // adalah 'e' maka setelah ditambahkan operator decrement maka akan menjadi 'd').
//    println("Ini adalah huruf " + alfabet--)// begitupun nilai yang akan di tampilkan di sini, nilainya akan
//    // meneruskan nilai sebelumnya kemudian dikurangi satu karakter (dari 'd' ke 'c')
//    println("Ini adalah huruf " + alfabet--)
////tanda (+) setelah string digunakan untuk menggabungkan string dengan suatu nilai data
//}

//fun main() {
//    val namaku = "Muhamad Malik Aziz Al Kutbi"
//    val hurufKesepuluh = namaku[11]
////  terdapa variable bertipe val bernama hurufKesepuluh yang akan mengakses nilai data index ke 11
////  pada variable bernama namaku
//    println("Halo, Salam Kenal, Namaku $namaku dan huruf ke 10 pada namaku adalah huruf $hurufKesepuluh")
////    string template digunakan untuk mengakses data dari luar di dalam text string
////    dengan menggunakan tanda ($) diikutin dengan nama variable atau field nya
// }

//fun main() {
//    val biodataku = "Jurusan saya Teknik Informatika \ndan \"Sekarang saya Semester 7\""
////    fungsi (\n) untuk membuat baris baru atau enter
////    fungsi (\") untuk menampilkan karakter tanda petik dua ("")
//    println(biodataku)
//}

//fun main() {
//    // tanda petik yg lebih dari 1 (2 atau 3) merupakan salah satu cara
//    // jika ingin membuat nilai tipe data string yang lebih dari satu baris atau text,
//    // jadi tidak perlu menggunakan petik 2 berkali kali
//    val hotNews = """
//        Selasa, 19 September 2023
//        ---------------------
//        Jadwal Asian Games Timnas Indonesia
//        Indonesia vs Kyrgystan, selasa 19 september pukul 18.30
//        ---------------------
//        Indonesia vs Taiwan, kamis 21 september pukul 15.00
//    """.trimIndent()
//    //trimIndent digunakan untuk menghapus spasi ekstra
//    // dari awal setiap baris sesuai dengan indentasi baris pertama.
//
//    println(hotNews)
//}

//fun main() {
//
//    var x = true
//    var y = false
////  terdapat variable bernama x yg menggunakan tipe data boolean,
////  tipe data ini di tandai dengan hanya memiliki atau bisa diisi dengan 2 nilai yaitu true atau false
//    println("x && y = " + (x && y)) //--> false and (akan bernilai false
//    // jika salah satu atau keduanya nilai bernilai false)
//    println("x || y = " + (x || y)) //--> true or (akan bernilai false
//    // jika kedua nilai bernilai false)
//    println("!y = " + (!y)) //--> true not (outputnya akan terbalik dengan nilainya,
//    // jika nilainya false maka akan jadi true begitu juga sebaliknya)
//}

//fun main() {
//    val Ayah: Int = 40
//    val Anak: Int = 21
////  terdapat dua variabel bertipe val bernama Ayah dan Anak
////  dengan tipe data Int dan masing-masing berisi nilai numerik.
////  Variabel Ayah diinisialisasi dengan nilai 40, sedangkan variabel Anak diinisialisasi dengan nilai 21.
//
//    println("Ayah > Anak = " + (Ayah > Anak))
////    membandingkan nilai variabel Ayah dengan variabel Anak.
////    Hasil perbandingan ini adalah true karena 40 lebih besar dari 21
//    println("Ayah < Anak = " + (Ayah < Anak))
//    //    Ayah < Anak memeriksa apakah Ayah kurang dari Anak.
//    //    Hasilnya adalah false karena 40 tidak kurang dari 21.
//
//    println("Ayah >= Anak = " + (Ayah >= Anak))
//    //    Ayah >= Anak memeriksa apakah Ayah lebih besar dari atau sama dengan Anak.
//    //    Hasilnya adalah true karena 40 lebih besar dari 21.
//
//    println("Ayah <= Anak = " + (Ayah <= Anak))
////    Ayah <= Anak memeriksa apakah Ayah kurang dari atau sama dengan Anak.
//    //    Hasilnya adalah false karena 40 tidak kurang dari atau sama dengan 21.
//
//    println("Ayah == Anak = " + (Ayah == Anak))
//    //    Ayah == Anak memeriksa apakah Ayah sama dengan Anak.
//    //    Hasilnya adalah false karena 40 tidak sama dengan 21.
//    println("Ayah != Anak = " + (Ayah != Anak))
//    //    Ayah != Anak memeriksa apakah Ayah tidak sama dengan Anak.
//    //    Hasilnya adalah true karena 40 tidak sama dengan 21.
//}

//fun main() {
//    val  laki: Boolean = false
//    val  perempuan: Boolean = true
//    val  lakiLaki: Boolean = false
//// terdapat variable bernama laki, perempuan, dan lakiLaki yg menggunakan tipe data boolean,
//// tipe data ini di tandai dengan hanya memiliki atau bisa diisi dengan 2 nilai yaitu true atau false
//    println("laki.and(perempuan) = " + laki.and(perempuan))
//    println("laki.or(perempuan) = " + laki.or(perempuan))
//    println("laki.and(lakilaki) = " + laki.and(lakiLaki))
////melakukan operasi logika "AND" antara variabel laki dan perempuan.
//// Hasil dari operasi ini adalah false, karena operasi "AND" menghasilkan true hanya
//// jika kedua operandnya adalah true.
////    laki.or(perempuan) melakukan operasi logika "OR" antara variabel laki dan perempuan.
////    Hasilnya adalah true, karena operasi "OR" menghasilkan true
////    jika salah satu atau kedua operandnya adalah true.
////    laki.and(lakiLaki) melakukan operasi logika "AND" antara variabel laki dan lakiLaki.
////    Hasilnya adalah false, karena keduanya memiliki nilai false.
//}

//fun main() {
//
//    val a: Int = 10000
////    (nilai ujian dsb)
////    salah satu tipe data number dengan min value -2 miliar sampai max value nya 2 miliar
//    val d: Double = 100.00
////    salah tipe data number dengan nilai desimal 15 sampai 16 digit
//    val f: Float = 100.00F
////     salah satu tipe data number dengan nilai desimal 6 sampai 7 digit, haarus di  akhiri dengan simbol "F" agar tipe datanya terbaca menjadi floa jika tidak maka akan terbaca double
//    val l: Long = 1000000004L
////    (data uang / data saldo uang) untuk memkasa menggunakan tipe data ini jika nilainya masih dibawah 2 miliar maka tambahkan "L" di akhir agar terbaca sebagai tpe data Long
////    salah satu tipe data number dengan min value -9 quadriliun dan max value 9 quadriliun
////    digunakan ketika nilai dari data nya lebih dari 2 miliar
//    val s: Short = 10
////    salah satu tipe data number dengan min value -32768 dan max value 32767
//    val b: Byte = Byte.MAX_VALUE
////    salah satu tipe data number dengan min value -128 dan max value 127
//    println("Int Value is " + a)
//    println("Double Value is " + d)
//    println("Float Value is " + f)
//    println("Long Value is " + l)
//    println("Short Value is " + s)
//    println("Byte Value is " + b)
//}

//fun main() {
//
//    val semester = arrayOf<String>("Semester 1", "Semester 2", "Semester 3", "Semester 4")
////    mendeklarasikan variabel semester sebagai array yang berisi elemen-elemen string.
////    Ini adalah array yang mengandung empat elemen string yang mewakili nama-nama semester.
//    println(semester[0])
////    mencetak elemen kedua dari array semester (indeks 1) ke layar, yang adalah "Semester 2".
//    println(semester.get(1))
//    println("------------")
//
//    semester[0] = "semester satu"
////    mengubah elemen pertama dari array semester (indeks 0) menjadi "semester satu"
////    dengan menggunakan operator indeks.
//    semester.set(1, "semester dua")
////    cara lain untuk mengubah elemen kedua dari array semester (indeks 1) menjadi "semester dua"
////    dengan menggunakan metode set().
//
//    println(semester[0])
//    println(semester.get(1))
//    println(semester.get(2))
////    mencetak elemen ketiga dari array semester (indeks 2), yang tetap tidak berubah dan masih "Semester 3"
//}

//fun main() {
//    val jumlahSiswa = intArrayOf(21, 19, 31, 25)
////    mendeklarasikan variabel jumlahSiswa sebagai array integer menggunakan intArrayOf().
////    Array ini berisi empat elemen integer yang mewakili jumlah siswa dalam empat kelas
////    atau kelompok yang berbeda.
//    jumlahSiswa[2] = 30
////    mengubah elemen ketiga dari array jumlahSiswa (indeks 2) menjadi 30. Awalnya,
////    jumlah siswa dalam kelas ketiga adalah 31, tetapi dengan pernyataan ini, Anda menggantinya menjadi 30.
//
//    println(jumlahSiswa[2])
////    mencetak nilai elemen ketiga dari array jumlahSiswa (indeks 2) ke layar. Hasilnya adalah 30 karena
////    telah diubah
//}