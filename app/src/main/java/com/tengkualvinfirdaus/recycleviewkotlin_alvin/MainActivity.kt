package com.tengkualvinfirdaus.recycleviewkotlin_alvin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val batikList = listOf<Batik>(
            Batik(
                R.drawable.batik_riau,
                "Batik Riau",
                "Motif batik Riau cenderung menggunakan warna yang kalem dan lembut. Namun ada juga seperti batik tabir yang menggunakan  warna yang mencolok dan warna-warna cerah. Motif batik riau paling banyak adalah motif tumbuh-tumbuhan dan jarang sekali bahkan tidak ada batik tabir yang menggambarkan kehidupan manusia ataupun hewan. Motif tumbuhan bisanya motif bunga tanjung, bunga kesumo, bunga cempaka, bunga matahari kaluk berkapas dan lainnya."
            ),
            Batik(
                R.drawable.batik_parang_kusumo,
                "Batik Parang Kusumo",
                " Batik Parang Kusumo berasal dari kata kusumo yang dalam bahasa Jawa berarti bunga, atau dalam makna lain diartikan sebagai bangsawan. Hal ini menunjukkan bagaimana batik yang memiliki arti bangsawan ini hanya boleh digunakan oleh keluarga kerajaan dan golongan tertentu saja."
            ),
            Batik(
                R.drawable.batik_mega_mendung,
                "Batik Mega Mendung",
                " Batik Megamendung merupakan karya seni batik yang identik dan bahkan menjadi ikon batik daerah Cirebon dan daerah Indonesia lainnya. Motif batik ini mempunyai kekhasan yang tidak ditemui di daerah penghasil batik lain."
            ),
            Batik(
                R.drawable.batik_sidomukti,
                "Batik Sidomukti",
                " Motif batik Sidomukti adalah perkembangan motif batik Sidomulyo dengan latar putih yang berasal dari zaman Mataram Kartasura. Lalu diganti dengan latar ukel oleh Paku Buwono IV. Batik Sidomukti terdiri dari beragam ornamen penyusun yang memiliki makna tersendiri. Jika digabungkan, ornamen-ornamen ini akan membentuk makna yang utuh yang membawa pemakainya pada kebahagiaan yang diinginkan. Berikut motif batik Sidomukti dan filosofinya yang perlu kamu ketahui."
            ),
            Batik(
                R.drawable.batik_tujuh_rupa,
                "Batik Tujuh Rupa",
                " Batik tujuh rupa adalah salah satu motif batik Indonesia yang berasal dari Pekalongan, Jawa Tengah. Motif batik tujuh rupa ini sangat kental dengan nuansa alam. Pada umumnya batik tujuh rupa menampilkan motif hewan atau tumbuhan. Motifnya diambil dari berbagai campuran budaya lokal dan etnis Tionghoa."
            ),
            Batik(
                R.drawable.batik_singa_barong,
                "Batik Singa Barong",
                " Batik Singa Barong dari Cirebon memiliki makna berdasarkan nama dan sejarahnya, singa barong merupakan sejenis binatang mitologis atau ajaib. Karena dalam budaya Jawa maupun Bali kata “barong” memiliki arti ajaib. Filosofi dari batik Singa Barong Cirebon sebagai wujud simbol-simbol yang bersifat spirititual."
            ),
            Batik(
                R.drawable.batik_sekar_jagad,
                "Batik Sekar Jagad",
                " atik Sekar Jagad adalah salah satu motif batik yang berasal dari Solo dan Yogyakarta. Motif ini mengandung makna kecantikan dan keindahan sehingga orang lain yang melihat akan terpesona."
            ),
            Batik(
                R.drawable.batik_pring_sedapur,
                "Batik Pring Sedapur",
                " Sejarah Batik Pring Sedapur dimulai dari masa awal perkembangan Islam. Setelah pecah perang, banyak prajurit Mataram lari ke daerah timur Gunung Lawu untuk mencari tempat yang aman, di antaranya di Desa Sidomukti dan sekitarnya. Di tempat itu mereka mengenalkan budaya batik kepada masyarakat sekitar Desa Sidomukti. “Awalnya para perajin mayoritas berasal Dusun Papringan. Mereka mendapatkan keahlian membatik dari nenek moyangnya,”ujar Tikno, panggilan akrabnya. Di awal masa jabatannya sebagai kepala DesaSidomukti pada tahun 1998, Tikno bersama Arif, salah satu penghobi batik asal Ngawi, belajar bagaimana membuat batik dan mengembangkannya di Magetan. Dengan mengambil motif gambar bambu yang terdapat di Dukuh Papringan jadilah motif batik pring sedapur."
            ),
            Batik(
                R.drawable.batik_sidoluhur,
                "Batik Sido Luhur",
                " Batik Sida Luhur adalah salah satu motif batik pedalaman yang cukup populer. Sesuai dengan namanya, motif ini bermakna harapan untuk mencapai kedudukan yang tinggi dan dapat menjadi panutan masyarakat. Motif-motif batik berawalan sida merupakan golongan motif yang banyak dibuat para pembatik."
            ),
            Batik(
                R.drawable.batik_tambal,
                "Batik Tambal",
                " Motif batik tambal memiliki arti tambal bermakna menambal atau memperbaiki hal-hal yang rusak. Dalam perjalanan hidupnya, manusia harus memperbaiki diri menuju kehidupan yang lebih baik, lahir maupun batin. Dahulu, kain batik bermotif tambal dipercaya bisa membantu kesembuhan orang yang sakit."
            ),
        )

        val recyclerView= findViewById<RecyclerView>(R.id.rv_batik)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = BatikAdapter(this, batikList){
            val intent = Intent(this,DetailBatikActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
}