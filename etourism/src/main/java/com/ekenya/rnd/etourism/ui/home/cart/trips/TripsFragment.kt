package com.ekenya.rnd.etourism.ui.home.cart.trips

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.ekenya.rnd.etourism.adapters.TripsItemRecyclerviewAdapter
import com.ekenya.rnd.etourism.databinding.TripsFragmentBinding
import com.ekenya.rnd.etourism.ui.AppData
import com.rnd.digitaltourismcard.ui.home.bag.trips.TripsViewModel


class TripsFragment : Fragment() {
    private var _binding: TripsFragmentBinding? = null
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    private  lateinit var  rvAdapter: TripsItemRecyclerviewAdapter



    companion object {
        private const val ARG_SECTION_NUMBER = "section_number"

        //fun newInstance() = TripsFragment()
        fun newInstance(sectionNumber: Int): TripsFragment {
            return TripsFragment().apply {
                arguments = Bundle().apply {
                    putInt(ARG_SECTION_NUMBER, sectionNumber)
                }
            }
        }
    }

    private lateinit var viewModel: TripsViewModel

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = TripsFragmentBinding.inflate(inflater, container, false)

        rvAdapter = TripsItemRecyclerviewAdapter(AppData().getcartTripItems())
        val rv= binding.tripitemRv
        rv.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL     ,false)
        rv.adapter = rvAdapter




        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(TripsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}