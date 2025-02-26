package dev.yudha.profileapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import dev.yudha.profileapp.R
import dev.yudha.profileapp.Mahasiswa
import kotlinx.coroutines.currentCoroutineContext

class MahasiswaAdapter(private val mahasiswaList: ArrayList<Mahasiswa>) :
    RecyclerView.Adapter<MahasiswaAdapter.MahasiswaViewHolder>() {

    // ViewHolder untuk memegang referensi item view
    class MahasiswaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val fotoProfil: ImageView = itemView.findViewById(R.id.image)
        val nimTextView: TextView = itemView.findViewById(R.id.nimMhs)
        val namaTextView: TextView = itemView.findViewById(R.id.namaMhs)
        val prodiTextView: TextView = itemView.findViewById(R.id.prodiMhs)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MahasiswaViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_view_mahasiswa, parent, false)
        return MahasiswaViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MahasiswaViewHolder, position: Int) {
        val mahasiswa = mahasiswaList[position]
        holder.fotoProfil.setImageResource(mahasiswa.dataImage)
        holder.nimTextView.text = mahasiswa.dataNIM
        holder.namaTextView.text = mahasiswa.dataNama
        holder.prodiTextView.text = mahasiswa.dataProdi
    }

    override fun getItemCount(): Int {
        return mahasiswaList.size
    }
}
