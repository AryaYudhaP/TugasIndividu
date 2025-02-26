package dev.yudha.profileapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import dev.yudha.profileapp.Mahasiswa

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var mahasiswaList: ArrayList<Mahasiswa>
    lateinit var imageList: ArrayList<Int>
    lateinit var nimList:ArrayList<String>
    lateinit var namaList:ArrayList<String>
    lateinit var prodiList:ArrayList<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageList = arrayListOf(
            R.drawable.profile_image,
            R.drawable.profile_image,
            R.drawable.profile_image,
            R.drawable.profile_image,
            R.drawable.profile_image,
            R.drawable.profile_image,
            R.drawable.profile_image,
            R.drawable.profile_image,
            R.drawable.profile_image,
            R.drawable.profile_image,
            R.drawable.profile_image,
            R.drawable.profile_image,
            R.drawable.profile_image,
            R.drawable.profile_image,
            R.drawable.profile_image,
            R.drawable.profile_image,
            R.drawable.profile_image,
            R.drawable.profile_image,
            R.drawable.profile_image,
            R.drawable.profile_image,
            R.drawable.profile_image,
            R.drawable.profile_image,
            R.drawable.profile_image,
            R.drawable.profile_image,
            R.drawable.profile_image,
            R.drawable.profile_image,
            R.drawable.profile_image)

        nimList = arrayListOf(
            "234311001",
            "234311002",
            "234311003",
            "234311004",
            "234311005",
            "234311006",
            "234311007",
            "234311008",
            "234311009",
            "234311010",
            "234311011",
            "234311012",
            "234311013",
            "234311014",
            "234311015",
            "234311016",
            "234311017",
            "234311018",
            "234311019",
            "234311020",
            "234311021",
            "234311022",
            "234311023",
            "234311024",
            "234311025",
            "234311026",
            "234311028")

        namaList = arrayListOf(
            "Abyan Raga",
            "Adam Mahabayu",
            "Aditya Dimas",
            "Afiq Galuh",
            "Alfonsus William",
            "Alwi Sihabudin",
            "Arya Yudha",
            "Balqis Amanda",
            "Bramastya Wika",
            "Cantikka May",
            "Dika Fadilah",
            "Dionesyus Divo",
            "Enjang Margha",
            "Fauzan Fathin",
            "Iqbal Khafidz",
            "Irma Reyta",
            "Mohammad Dimas",
            "Mohammad Fakhriza",
            "Muhammad Dzakwan",
            "Muhammad Aulia",
            "Nabila Carissa",
            "Nur Azizah",
            "Rengga Adhiva",
            "Richo Novian Saputra",
            "Saifullah Isnan",
            "Salva Mahardhika",
            "Shaffa Dwiaji")

        prodiList = arrayListOf(
            "Teknologi Rekayasa Perangkat Lunak",
            "Teknologi Rekayasa Perangkat Lunak",
            "Teknologi Rekayasa Perangkat Lunak",
            "Teknologi Rekayasa Perangkat Lunak",
            "Teknologi Rekayasa Perangkat Lunak",
            "Teknologi Rekayasa Perangkat Lunak",
            "Teknologi Rekayasa Perangkat Lunak",
            "Teknologi Rekayasa Perangkat Lunak",
            "Teknologi Rekayasa Perangkat Lunak",
            "Teknologi Rekayasa Perangkat Lunak",
            "Teknologi Rekayasa Perangkat Lunak",
            "Teknologi Rekayasa Perangkat Lunak",
            "Teknologi Rekayasa Perangkat Lunak",
            "Teknologi Rekayasa Perangkat Lunak",
            "Teknologi Rekayasa Perangkat Lunak",
            "Teknologi Rekayasa Perangkat Lunak",
            "Teknologi Rekayasa Perangkat Lunak",
            "Teknologi Rekayasa Perangkat Lunak",
            "Teknologi Rekayasa Perangkat Lunak",
            "Teknologi Rekayasa Perangkat Lunak",
            "Teknologi Rekayasa Perangkat Lunak",
            "Teknologi Rekayasa Perangkat Lunak",
            "Teknologi Rekayasa Perangkat Lunak",
            "Teknologi Rekayasa Perangkat Lunak",
            "Teknologi Rekayasa Perangkat Lunak",
            "Teknologi Rekayasa Perangkat Lunak",
            "Teknologi Rekayasa Perangkat Lunak")

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)

        mahasiswaList = arrayListOf<Mahasiswa>()
        getData()
    }

    private fun getData() {
        for (i in imageList.indices) {
            val MahasiswaClass = Mahasiswa(imageList[i], nimList[i], namaList[i], prodiList[i])
            mahasiswaList.add(MahasiswaClass)
        }
        recyclerView.adapter = MahasiswaAdapter(mahasiswaList)
    }
}