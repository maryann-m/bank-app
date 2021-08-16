package com.ekenya.rnd.etourism.ui.shop.shopitemdetail

import android.os.Build
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.ekenya.rnd.common.abstractions.BaseDaggerFragment
import com.ekenya.rnd.etourism.adapters.ShopAdapter
import com.ekenya.rnd.etourism.databinding.ShopitemDetailBinding
import com.ekenya.rnd.etourism.models.ShopItem
import com.ekenya.rnd.etourism.ui.AppData
import javax.inject.Inject


class ItemDetailFragment : BaseDaggerFragment() {
    @Inject
    public lateinit  var viewModelFactory: ViewModelProvider.Factory
    private  var itemDetailViewModel: ItemDetailViewModel? = null
    private var _binding: ShopitemDetailBinding? = null


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


        itemDetailViewModel =
            ViewModelProvider(this,viewModelFactory).get(ItemDetailViewModel::class.java)

        _binding = ShopitemDetailBinding.inflate(inflater, container, false)
        binding.closeIcon.setOnClickListener{
            it.findNavController().popBackStack()
        }

        val shopItemsRecyvlerview = binding.relatedproductsrv
        shopItemsRecyvlerview.layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
        val shopItems:List<ShopItem> = AppData().getShopItemsList()
        shopItemsRecyvlerview.adapter = ShopAdapter(shopItems)




        return binding.root
    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null


    }

}