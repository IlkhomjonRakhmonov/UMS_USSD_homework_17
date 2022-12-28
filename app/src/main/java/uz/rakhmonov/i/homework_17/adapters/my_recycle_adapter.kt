package uz.rakhmonov.i.homework_17.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import uz.rakhmonov.i.homework_17.databinding.MyItemBinding
import uz.rakhmonov.i.homework_17.models.myTemplate

class my_recycle_adapter (val list:List<myTemplate>, val rvClick: RvClick): RecyclerView.Adapter<my_recycle_adapter.VH>(){

    inner class VH (val myItemBinding:MyItemBinding):RecyclerView.ViewHolder(myItemBinding.root){
        fun onHolder(myTemplate: myTemplate){
            myItemBinding.TVName.text=myTemplate.name
            myItemBinding.TVCode.text=myTemplate.code
            myItemBinding.TVPrice.text=myTemplate.price

            myItemBinding.root.setOnClickListener {
                rvClick.itemclick(myTemplate)
            }

        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        return VH(MyItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))

    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.onHolder(list[position])

    }

    override fun getItemCount(): Int=list.size


}
interface RvClick{
    fun itemclick(myTemplate: myTemplate)

}

