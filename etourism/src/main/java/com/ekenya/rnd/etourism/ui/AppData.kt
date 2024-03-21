package com.ekenya.rnd.etourism.ui


import com.ekenya.rnd.etourism.R
import com.ekenya.rnd.etourism.models.*
import javax.inject.Inject

class AppData @Inject constructor() {

    public fun getTripList(): List<UpcomingTrip> {

        val itemlist= ArrayList<UpcomingTrip>()
        itemlist.add(UpcomingTrip(R.drawable.sutirta,R.drawable.ic_heart__1_,"Maasai Mara Specials","12/12/2020"))
        itemlist.add(UpcomingTrip(R.drawable.scott,R.drawable.ic_heart_etourism,"Meru Camp","12/12/2020"))
        itemlist.add(UpcomingTrip(R.drawable.cinthia,R.drawable.ic_heart__1_,"Samburu Bush Safari","12/12/2020"))

        return itemlist



    }

    public fun getImages(): MutableList<SliderImage> {
        val images= ArrayList<SliderImage>()
        images.add(SliderImage(R.drawable.cinthia))
        images.add(SliderImage(R.drawable.cinthia))
        images.add(SliderImage(R.drawable.cinthia))
        return  images

    }
    public fun getcatogoryList(): List<ShopCategoryItem> {
        val categories = ArrayList<ShopCategoryItem>()
        categories.add(ShopCategoryItem(R.drawable.ic_arts,"Arts"))
        categories.add(ShopCategoryItem(R.drawable.ic_coffee,"Coffee"))
        categories.add(ShopCategoryItem(R.drawable.ic_books,"Books"))
        categories.add(ShopCategoryItem(R.drawable.ic_painting,"Painting"))
        return  categories

    }
    fun getShopItemsList(): List<ShopItem> {
        val shopitems= ArrayList<ShopItem>()
        shopitems.add(ShopItem(R.drawable.ic_compass,"IDEAS,INFLUENCE AND INCOME","By Tanya Hall","KSH 2,500"))
        shopitems.add(ShopItem(R.drawable.ic_compass,"IDEAS,INFLUENCE AND INCOME","By Tanya Hall","KSH 2,500"))
        shopitems.add(ShopItem(R.drawable.ic_compass,"IDEAS,INFLUENCE AND INCOME","By Tanya Hall","KSH 2,500"))
        shopitems.add(ShopItem(R.drawable.ic_compass,"IDEAS,INFLUENCE AND INCOME","By Tanya Hall","KSH 2,500"))
        shopitems.add(ShopItem(R.drawable.ic_compass,"IDEAS,INFLUENCE AND INCOME","By Tanya Hall","KSH 2,500"))
        shopitems.add(ShopItem(R.drawable.ic_compass,"IDEAS,INFLUENCE AND INCOME","By Tanya Hall","KSH 2,500"))
        shopitems.add(ShopItem(R.drawable.ic_compass,"IDEAS,INFLUENCE AND INCOME","By Tanya Hall","KSH 2,500"))
        shopitems.add(ShopItem(R.drawable.ic_compass,"IDEAS,INFLUENCE AND INCOME","By Tanya Hall","KSH 2,500"))
        shopitems.add(ShopItem(R.drawable.ic_compass,"IDEAS,INFLUENCE AND INCOME","By Tanya Hall","KSH 2,500"))
        shopitems.add(ShopItem(R.drawable.ic_compass,"IDEAS,INFLUENCE AND INCOME","By Tanya Hall","KSH 2,500"))
        shopitems.add(ShopItem(R.drawable.ic_compass,"IDEAS,INFLUENCE AND INCOME","By Tanya Hall","KSH 2,500"))
        shopitems.add(ShopItem(R.drawable.ic_compass,"IDEAS,INFLUENCE AND INCOME","By Tanya Hall","KSH 2,500"))


        return shopitems

    }
     fun getSliderImages(): MutableList<SliderImage>? {
        val images= ArrayList<SliderImage>()
        images.add(SliderImage(R.drawable.nathan))
        images.add(SliderImage(R.drawable.cinthia))
        images.add(SliderImage(R.drawable.nathan))
        return  images

    }
     fun getHistoryitems(): List<HistoryItem> {
        val tripHistory = ArrayList<HistoryItem>()
        tripHistory.add(HistoryItem(R.drawable.ic_check_etourism,"Maasai mara",100000,"12/12/2020"))
        tripHistory.add(HistoryItem(R.drawable.ic_chaza_card_1,"Topped Up",20000,"08/08/2021"))
        tripHistory.add(HistoryItem(R.drawable.ic_chaza_card_1,"Chaza Card purchase",20000,"12/12/2021"))
        tripHistory.add(HistoryItem(R.drawable.ic_savings_account,"Maasai mara",20000,"12/12/2021"))
        tripHistory.add(HistoryItem(R.drawable.ic_check_etourism,"Maasai mara",20000,"12/12/2021"))

        return tripHistory

    }

    public fun getTripViewPagerList(): MutableList<TripViewPagerItem>? {
        val images= ArrayList<TripViewPagerItem>()
        images.add(TripViewPagerItem(R.drawable.cinthia,"Maasai Mara National Park","MARA SERENA","23 December 2021"))
        images.add(TripViewPagerItem(R.drawable.scott,"Maasai Mara National Park","MARA SERENA","21 October 2021"))
        images.add(TripViewPagerItem(R.drawable.cinthia,"Maasai Mara National Park","MARA SERENA","1 July 2021"))

        return  images

    }

    fun getLiveItemList(): List<LiveTrip> {
        val liveTrips = ArrayList<LiveTrip>()

        liveTrips.add(LiveTrip(R.drawable.redcharlie,"Mara Camp"))
        liveTrips.add(LiveTrip(R.drawable.david,"Samburu Park"))
        liveTrips.add(LiveTrip(R.drawable.redcharlie,"Tsavo East Park"))

        return liveTrips

    }

    fun getGalleryItems(): List<GalleryItem> {
        val items = ArrayList<GalleryItem>()

        items.add(GalleryItem(R.drawable.elephant))
        items.add(GalleryItem(R.drawable.eunice))
        items.add(GalleryItem(R.drawable.heather))
        items.add(GalleryItem(R.drawable.tree))
        return items

    }

    fun getPaymentOptionsList(): List<Paymentoption> {
        val items = ArrayList<Paymentoption>()
        items.add(Paymentoption(R.drawable.ic_mpesa_logo,"Mpesa"))
        items.add(Paymentoption(R.drawable.airtel_etourism,"Airtel"))
        items.add(Paymentoption(R.drawable.ic_credit_card,"Bank Cards"))
        items.add(Paymentoption(R.drawable.pesalink_etourism,"Pesa Link"))
        items.add(Paymentoption(R.drawable.ic_chaza_card_1,"Chaza Card"))

        return items

    }

    fun getPhotos(): List<Photo> {
        val items = ArrayList<Photo>()
        items.add(Photo(R.drawable.chui))
        items.add(Photo(R.drawable.elcarito))
        items.add(Photo(R.drawable.screenshot_etourism))
        items.add(Photo(R.drawable.redcharlie))
        items.add(Photo(R.drawable.eunice2))
        items.add(Photo(R.drawable.sneha2))
        items.add(Photo(R.drawable.heather2))
        items.add(Photo(R.drawable.huchen))
        items.add(Photo(R.drawable.david))


        return items

    }

    fun getPayments(): List<PaymentHistoryItem> {
        val items = ArrayList<PaymentHistoryItem>()
        items.add(PaymentHistoryItem(R.drawable.netflix_etourism,"Netflix","faithckorir@gmail.com","KSH 1,000.00"))
        items.add(PaymentHistoryItem(R.drawable.zuku_etourism,"Zuku","A/C 320897","KSH 1,000.00"))
        items.add(PaymentHistoryItem(R.drawable.showmax,"Showmax","alexwan..@gmail.com","KSH 1,000.00"))
        items.add(PaymentHistoryItem(R.drawable.netflix_etourism,"Netflix","faithckorir@gmail.com","KSH 1,200.00"))

        return items

    }

    fun getcartTripItems(): List<Trip> {
        val items = ArrayList<Trip>()
        items.add(Trip("mara serena"))
        items.add(Trip("mara serena2"))
        items.add(Trip("mara serena34"))
        items.add(Trip("mara serena"))
        return items

    }
}