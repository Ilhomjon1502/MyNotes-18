package uz.ilhomjon.mynotes18.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import uz.ilhomjon.mynotes18.R
import uz.ilhomjon.mynotes18.databinding.FragmentHome1Binding

class Home1Fragment : Fragment() {
    private val binding by lazy { FragmentHome1Binding.inflate(layoutInflater) }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding.apply {

        }
        return binding.root
    }
}