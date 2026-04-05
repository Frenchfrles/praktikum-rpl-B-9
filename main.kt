// Nama : Rafli Ahmad
// NIM  : L0124030

fun main() {
    KRS(
        nama = "Rafli Ahmad",
        nim = "L0124030",
        jurusan = "Teknik Informatika",
        beasiswa = "PPA",
        semester = 5,
        ipk = 3.6,
        mataKuliah = arrayOf("Struktur Data", "Basis Data", "Pemrograman Web", "AI")
    )

    KRS(
        nama = "James Gosling",
        nim = "L0125031",
        jurusan = "Sistem Informasi",
        beasiswa = "Beasiswa Unggulan",
        semester = 3,
        ipk = 3.5,
        mataKuliah = arrayOf("Manajemen Proyek TI", "Sistem Digital", "Kalkulus 2")
    )

    KRS(
        nama = "Bob Sadino",
        nim = "L0126032",
        jurusan = "Teknik Komputer",
        ipk = 2.8,
        mataKuliah = arrayOf("Fisika", "Kalkulus 1")
    )
}

fun KRS(
    nama: String,
    nim: String,
    jurusan: String,
    beasiswa: String? = null,
    semester: Int = 1,
    ipk: Double,
    vararg mataKuliah: String
    ) {
    
    val maksSKS = if (ipk >= 3.5){
        24
    } else if (ipk >= 3.0) {
        22
    } else if (ipk >= 2.5) {
        20
    } else {
        18
    }

    val statusBeasiswa = beasiswa ?: "Mandiri"
    val jumlahMataKuliah = mataKuliah.size
    val listMataKuliah = if (jumlahMataKuliah > 0) {
        mataKuliah.joinToString(", ")
    } else {
        "Tidak ada mata kuliah yang diambil"
    }

    val header = "\t\t\tKartu Rencana Studi (KRS)"
    val subHeader = "\t\t\t\tSemester $semester"

    val tampilan = """
        ==========================================================================
        $header
        $subHeader
        ==========================================================================
        Data Mahasiswa:
        Nama: $nama
        NIM: $nim
        Jurusan: $jurusan
        Beasiswa: $statusBeasiswa
        IPK: $ipk
        Maksimal SKS : $maksSKS
        Mata Kuliah yang diambil: $listMataKuliah
        ==========================================================================
    """.trimIndent()
    println(tampilan)
    println()
}