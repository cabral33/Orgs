package br.com.alura.orgs.ui.recyclerview.adpater

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.alura.orgs.model.Produto

class ListaProdutosAdpater(
    private val produtos : List<Produto>

) : RecyclerView.Adapter<ListaProdutosAdpater.viewHolder>() {

    class  viewHolder(view: View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        return viewHolder(view = )
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int = produtos.size

}
