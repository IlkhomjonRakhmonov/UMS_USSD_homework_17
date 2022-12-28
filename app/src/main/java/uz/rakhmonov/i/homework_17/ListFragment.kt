package uz.rakhmonov.i.homework_17

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import uz.rakhmonov.i.homework_17.adapters.RvClick
import uz.rakhmonov.i.homework_17.adapters.my_recycle_adapter
import uz.rakhmonov.i.homework_17.databinding.FragmentListBinding
import uz.rakhmonov.i.homework_17.models.myTemplate

class ListFragment : Fragment() {
   private lateinit var binding: FragmentListBinding
   private lateinit var my_recycle_Adapter: my_recycle_adapter
   var number=0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentListBinding.inflate(layoutInflater)
        loadData()
        number=arguments?.getInt("KEYWORD",0)!!
        when (number){
            0->{
                showData(myData.listTarif)
                (activity as MainActivity)
                    .setActionBarTitle("Tariflar")
            }
            1->{
                showData(myData.listDaqiqa)
                (activity as MainActivity)
                    .setActionBarTitle("Daqiqalar")
            }
            2->{
                showData(myData.listInternet)
                (activity as MainActivity)
                    .setActionBarTitle("Internet")
            }
            3->{
                showData(myData.listXizmat)
                (activity as MainActivity)
                    .setActionBarTitle("Xizmat")
            }
            4->{
                showData(myData.listSMS)
                (activity as MainActivity)
                    .setActionBarTitle("SMS")
            }
        }

        return binding.root

    }

    private fun showData(list: List<myTemplate>) {
        my_recycle_Adapter= my_recycle_adapter(list, object :RvClick{
            override fun itemclick(myTemplate: myTemplate) {
                findNavController().navigate(R.id.infoFragment, bundleOf("keyTemp" to myTemplate))
            }
        })
        binding.RV.adapter=my_recycle_Adapter


    }


}