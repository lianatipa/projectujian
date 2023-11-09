package id.utdi.projectujian

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // untuk menampilkan hasil project yg di kerjakan di mainActivity
           imageAdapter()
        //  textAdapter()
        //   numberAdapter()
            modelAdapter()
    }
    // menampilkan gambar berserta judul pada movie tersebut,
    // R.drawble memangil id gambar yang tersimpan pada res bagian drawable
    private fun modelAdapter(){
        val movies = listOf<MovieModel>(
            MovieModel(1, "THE BUETY INSIDE (2023)", R.drawable.gambar1),
            MovieModel(2, "A BISNES PROPOSAL (2023)", R.drawable.gambar2),
            MovieModel(3, "ON YOUR WEDDING DAY (2023)", R.drawable.gambar3),
            MovieModel(4, "MOVING (2023)", R.drawable.gambar4),
            MovieModel(5, "A TIME CALLED YOU (2023)", R.drawable.gambar5),
            MovieModel(6, "DESTINEND WHIT YOU (2023)", R.drawable.gambar6),
            MovieModel(7, "BEHIND YOUR TOUCH (2023)", R.drawable.gambar7),
        )
        val movieAdapter = MovieAdapter(movies)
        findViewById<RecyclerView>(R.id.recyclerView).adapter = movieAdapter
    }

    private fun imageAdapter(){
        val images = listOf<Int>(
            R.drawable.gambar1,
            R.drawable.gambar2,
            R.drawable.gambar3,
            R.drawable.gambar4,
            R.drawable.gambar5,
            R.drawable.gambar6,
            R.drawable.gambar7,
        )

        val imageAdapter = ImageAdapter(images)
        findViewById<RecyclerView>(R.id.recyclerView).apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter =imageAdapter
        }
    }




    private fun textAdapter() {
        val names = listOf<String>(
            "Budi",
            "Aris",
            "Aven",
            "Iyo",
            "Jefri",
            "Aril",
            "Rion",
            "Remal",
        )
        // Log.e("MainaActivity", " size{${names.size}}")
        // Log.e("MainaActivity", names[1])
        names.forEach { name ->
            Log.e("MainaActivity", name)
        }

            val textAdapter = TextAdapter(names)
            findViewById<RecyclerView>(R.id.recyclerView).adapter = textAdapter

    }
    private fun numberAdapter(){
        val numbers = listOf<Int>(
            1,
            2,
            3,
            4,
            5,
            6,
            7,
            8,
        )
        val numberAdapter = NumberAdapter ( numbers )
        findViewById<RecyclerView>(R.id.recyclerView).adapter = numberAdapter


    }
}