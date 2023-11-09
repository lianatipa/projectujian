package id.utdi.projectujian

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
//pada movieadapter ini untuk membuat dan menampilkan gambar dan text pada movie
class MovieAdapter(
    private val  listMovie: List<MovieModel>
) : RecyclerView.Adapter<MovieAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieAdapter.ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.adapter_model,parent,false)
        )
    }

    override fun onBindViewHolder(holder: MovieAdapter.ViewHolder, position: Int) {
        val movie = listMovie[position]
        holder.imageView.setImageResource(movie.image)
        holder.textView. text = movie.name
    }

    override fun getItemCount() = listMovie.size

    class ViewHolder(view : View): RecyclerView.ViewHolder(view){
        val imageView = view.findViewById<ImageView>(R.id.imageView)
        val textView = view.findViewById<TextView>(R.id.textView)
    }
}