package com.ekenya.rnd.etourism.ui.home.virtualsafari

import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.ekenya.rnd.common.abstractions.BaseDaggerFragment
import com.ekenya.rnd.etourism.adapters.LiveTripsRecyclerviewAdapter
import com.ekenya.rnd.etourism.databinding.VirtualSafariFragmentBinding
import com.ekenya.rnd.etourism.ui.AppData
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView
import com.ekenya.rnd.etourism.adapters.GalleryRecyclerviewAdapter
import javax.inject.Inject


class VirtualSafariFragment : BaseDaggerFragment() {
    @Inject
    public lateinit  var viewModelFactory: ViewModelProvider.Factory
    private  var virtualSafariViewModel: VirtualSafariViewModel? = null
    private lateinit var  liveTripsRecyclerviewAdapter: LiveTripsRecyclerviewAdapter
    private lateinit var  galleryRecyclerviewAdapter: GalleryRecyclerviewAdapter
    private lateinit var videoView: YouTubePlayerView


    private var _binding: VirtualSafariFragmentBinding? = null


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


        virtualSafariViewModel =
            ViewModelProvider(this,viewModelFactory).get(VirtualSafariViewModel::class.java)

        liveTripsRecyclerviewAdapter = LiveTripsRecyclerviewAdapter(AppData().getLiveItemList())
        galleryRecyclerviewAdapter = GalleryRecyclerviewAdapter(AppData().getGalleryItems())


        _binding = VirtualSafariFragmentBinding.inflate(inflater, container, false)

        val rv = binding.liveSafarisRv
        val gallerrv = binding.galleryRecyclerview

        rv.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL ,false)
        rv.adapter = liveTripsRecyclerviewAdapter

        gallerrv.layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
        gallerrv.adapter = galleryRecyclerviewAdapter
        val videoView =binding.videoView

        lifecycle.addObserver(videoView)

        videoView.addYouTubePlayerListener(object : AbstractYouTubePlayerListener() {
            override fun onReady(youTubePlayer: YouTubePlayer) {
                val videoId = "S0Q4gqBUs7c"

                youTubePlayer.loadVideo(videoId, 0f)
            }
        })

        binding.closeIcon.setOnClickListener(View.OnClickListener {
            Navigation.findNavController(it).popBackStack()
        })




        return binding.root
    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
//        videoView.release();



    }

}