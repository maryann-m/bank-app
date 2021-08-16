package com.ekenya.rnd.etourism.ui.home.destination

import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.ekenya.rnd.common.abstractions.BaseDaggerFragment
import com.ekenya.rnd.etourism.databinding.TripFragmentBinding
import com.ekenya.rnd.etourism.ui.AppData
import com.ekenya.rnd.etourism.adapters.GalleryRecyclerviewAdapter
import javax.inject.Inject


class SingleTripFragment : BaseDaggerFragment() {
    @Inject
    public lateinit  var viewModelFactory: ViewModelProvider.Factory

    private var singleTripViewModel: SingleTripViewModel? = null
    private lateinit var galleryRecyclerviewAdapter: GalleryRecyclerviewAdapter


    private var _binding: TripFragmentBinding? = null


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!


    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        singleTripViewModel =
            ViewModelProvider(requireActivity(),viewModelFactory!!).get(SingleTripViewModel::class.java)

        _binding = TripFragmentBinding.inflate(inflater, container, false)
        galleryRecyclerviewAdapter = GalleryRecyclerviewAdapter(AppData().getGalleryItems())
        val gallerrv = binding.singletriphotosrv
        gallerrv.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL,false)
        gallerrv.adapter = galleryRecyclerviewAdapter

        binding.plantripFab.setOnClickListener(View.OnClickListener {

           // Navigation.findNavController(it).navigate(R.id.action_singleTripFragment_to_personalTripsFragment)
        })









        return binding.root
    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null


    }

}