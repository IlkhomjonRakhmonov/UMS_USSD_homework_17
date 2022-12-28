package uz.rakhmonov.i.homework_17

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.onNavDestinationSelected
import uz.rakhmonov.i.homework_17.databinding.FragmentInfoBinding
import uz.rakhmonov.i.homework_17.models.myTemplate

class InfoFragment : Fragment() {
    lateinit var binding: FragmentInfoBinding
    lateinit var myTemplate: myTemplate
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentInfoBinding.inflate(layoutInflater)
        setupBackButton()

        myTemplate=arguments?.getSerializable("keyTemp") as myTemplate
        binding.infoName.setText(myTemplate.name)
        binding.infoText.setText(R.string.INFO_60)
        binding.infoCode.setText(myTemplate.code)
         return binding.root
    }
    override fun onResume() {
        super.onResume()
        (activity as MainActivity)
            .setActionBarTitle("UMS")

    }
    private fun setupBackButton() {
        if (activity is AppCompatActivity) {
            (activity as AppCompatActivity?)?.supportActionBar?.setDisplayHomeAsUpEnabled(true)

        }

    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home)
            finish()
        return true
    }

    private fun finish() {
        parentFragmentManager.beginTransaction()
            .replace(R.id.homeFragment,Fragment())
            .commit()

    }


}