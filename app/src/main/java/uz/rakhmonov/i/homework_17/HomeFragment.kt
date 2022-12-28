package uz.rakhmonov.i.homework_17

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import uz.rakhmonov.i.homework_17.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentHomeBinding.inflate(layoutInflater)


        binding.tarif.setOnClickListener {
            putData(0)
        }
        binding.daqiqa.setOnClickListener {
            putData(1)
        }
        binding.internet.setOnClickListener {
            putData(2)
        }
        binding.xizmat.setOnClickListener {
            putData(3)
        }
        binding.SMS.setOnClickListener {
            putData(4)
        }
        binding.news.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://mobi.uz/uz/")))
        }
        binding.ums.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://company.mobi.uz/uz/")))
        }



       return binding.root
    }
    private fun putData(number:Int){
        findNavController().navigate(R.id.listFragment, bundleOf("KEYWORD" to number))


    }

    override fun onResume() {
        super.onResume()
        (activity as MainActivity)
            .setActionBarTitle("UMS")

    }


}