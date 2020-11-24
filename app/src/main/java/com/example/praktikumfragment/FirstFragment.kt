package com.example.praktikumfragment
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProviders
import com.google.android.material.textfield.TextInputEditText
class FirstFragment : Fragment() {

    private var communicationViewModel: CommunicationViewModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //deklarasi viewModel saat onCreate
        communicationViewModel =
                ViewModelProviders.of(requireActivity()).
                get(CommunicationViewModel::class.java)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //sc input data ke textboxt
        val nameEditText = view.findViewById<TextInputEditText>(R.id.textInputTextName)
        nameEditText.addTextChangedListener(
                object : TextWatcher {
                    override fun beforeTextChanged(
                            charSequence: CharSequence, i: Int, i1: Int, i2: Int) {
                    }
                    override fun onTextChanged(charSequence: CharSequence,
                                               i: Int, i1: Int, i2: Int) {
                        communicationViewModel!!.setName(charSequence.toString())
                    }
                    override fun afterTextChanged(editable: Editable) {
                    }
                })
    }
    companion object {
        fun newInstance(): FirstFragment {
            return FirstFragment()
        }
    }

}