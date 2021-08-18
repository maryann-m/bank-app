package com.ekenya.rnd.etourism.di.injectables

import androidx.lifecycle.ViewModel
import androidx.viewpager.widget.PagerAdapter
import com.ekenya.rnd.baseapp.di.ViewModelKey
import com.ekenya.rnd.etourism.adapters.SliderAdapter
import com.ekenya.rnd.etourism.ui.AppData
import com.ekenya.rnd.etourism.ui.dashboard.DashboardFragment
import com.ekenya.rnd.etourism.ui.dashboard.DashboardViewModel
import com.ekenya.rnd.etourism.ui.home.HomeFragment
import com.ekenya.rnd.etourism.ui.home.HomeViewModel
import com.ekenya.rnd.etourism.ui.home.destination.SingleTripFragment
import com.ekenya.rnd.etourism.ui.home.destination.SingleTripViewModel
import com.ekenya.rnd.etourism.ui.home.learnkenya.BibleKenyaFragment
import com.ekenya.rnd.etourism.ui.home.learnkenya.BibleKenyaViewModel
import com.ekenya.rnd.etourism.ui.home.personaltrips.PersonalTripsFragment
import com.ekenya.rnd.etourism.ui.home.personaltrips.PersonalTripsViewModel
import com.ekenya.rnd.etourism.ui.home.virtualsafari.VirtualSafariFragment
import com.ekenya.rnd.etourism.ui.home.virtualsafari.VirtualSafariViewModel
import com.ekenya.rnd.etourism.ui.login.LoginDialogFragment
import com.ekenya.rnd.etourism.ui.login.LoginViewModel
import com.ekenya.rnd.etourism.ui.wallet.NotificationsFragment
import com.ekenya.rnd.etourism.ui.wallet.NotificationsViewModel
import com.ekenya.rnd.etourism.ui.profile.ProfileFragment
import com.ekenya.rnd.etourism.ui.profile.ProfileViewModel
import com.ekenya.rnd.etourism.ui.profile.accountsettings.AccountSettingsFragment
import com.ekenya.rnd.etourism.ui.profile.accountsettings.AccountSettingsViewModel
import com.ekenya.rnd.etourism.ui.shop.ShopFragment
import com.ekenya.rnd.etourism.ui.shop.ShopViewModel
import com.ekenya.rnd.etourism.ui.shop.shopitemdetail.ItemDetailFragment
import com.ekenya.rnd.etourism.ui.shop.shopitemdetail.ItemDetailViewModel
import com.ekenya.rnd.etourism.ui.wallet.WalletViewModel
import com.ekenya.rnd.etourism.ui.wallet.airtel.AirtelFragment
import com.ekenya.rnd.etourism.ui.wallet.airtel.AirtelViewModel
import com.ekenya.rnd.etourism.ui.wallet.intermediate.IntermediateFragment
import com.ekenya.rnd.etourism.ui.wallet.intermediate.IntermediateViewModel
import com.ekenya.rnd.etourism.ui.wallet.makepayments.MakePaymentsFragment
import com.ekenya.rnd.etourism.ui.wallet.makepayments.MakePaymentsViewModel
import com.ekenya.rnd.etourism.ui.wallet.mpesa.MpesaFragment
import com.ekenya.rnd.etourism.ui.wallet.mpesa.MpesaViewModel
import com.ekenya.rnd.etourism.ui.wallet.pesalink.PesaLinkFragment
import com.ekenya.rnd.etourism.ui.wallet.pesalink.PesaLinkViewModel
import com.ekenya.rnd.etourism.ui.wallet.pin.PinFragment
import com.ekenya.rnd.etourism.ui.wallet.pin.PinViewModel
import com.ekenya.rnd.etourism.ui.wallet.savings.SavingsAccountFragment
import com.ekenya.rnd.etourism.ui.wallet.savings.SavingsAccountViewModel
import com.ekenya.rnd.etourism.ui.wallet.statements.GetStatementFragment
import com.ekenya.rnd.etourism.ui.wallet.statements.GetStatementViewModel
import com.ekenya.rnd.etourism.ui.wallet.topupwallet.TopUpFragment
import com.ekenya.rnd.etourism.ui.wallet.topupwallet.TopUpViewModel
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector
import dagger.multibindings.IntoMap

@Module
abstract class TourismFragmentModule {

    @ContributesAndroidInjector(modules = [TourismLoginDialogFragmentModule::class])
    abstract fun contributeLoginDialogFragment(): LoginDialogFragment

    @Module
    abstract class TourismLoginDialogFragmentModule {
        @Binds
        @IntoMap
        @ViewModelKey(LoginViewModel::class)
        abstract fun bindLoginViewModel(viewModel: LoginViewModel): ViewModel
    }
    @ContributesAndroidInjector(modules = [TourismHomeFragmentModule::class,TourismHomeSliderFragmentModule::class])
    abstract fun contributeHomeFragment(): HomeFragment

    @Module
    abstract class TourismHomeFragmentModule {
        @Binds
        @IntoMap
        @ViewModelKey(HomeViewModel::class)
        abstract fun bindHomeViewModel(viewModel: HomeViewModel): ViewModel
    }
    @Module
     class TourismHomeSliderFragmentModule {

        @Provides
         fun providesAdapter(adapter: SliderAdapter?): PagerAdapter? {
            return adapter
        }

    }
    @ContributesAndroidInjector(modules = [TourismProfileFragmentModule::class])
    abstract fun contributeProfileFragment(): ProfileFragment

    @Module
    abstract class TourismProfileFragmentModule {
        @Binds
        @IntoMap
        @ViewModelKey(ProfileViewModel::class)
        abstract fun bindProfileViewModel(viewModel: ProfileViewModel): ViewModel
    }

    @ContributesAndroidInjector(modules = [TourismNotificationsFragmentModule::class])
    abstract fun contributeNotificationsFragment(): NotificationsFragment

    @Module
    abstract class TourismNotificationsFragmentModule {
        @Binds
        @IntoMap
        @ViewModelKey(WalletViewModel::class)
        abstract fun bindHomeViewModel(viewModel: WalletViewModel): ViewModel
    }

    @ContributesAndroidInjector(modules = [TourismDashboardFragmentModule::class])
    abstract fun contributeDashboardFragment(): DashboardFragment

    @Module
    abstract class TourismDashboardFragmentModule {
        @Binds
        @IntoMap
        @ViewModelKey(DashboardViewModel::class)
        abstract fun bindHomeViewModel(viewModel: DashboardViewModel): ViewModel
    }
    //LIST THE OTHER INJECTABLE FRAGMENTS AS ABOVE


    @ContributesAndroidInjector(modules = [TourismSingleTripFragmentModule::class])
    abstract fun contributeSingleTripFragment(): SingleTripFragment

    @Module
    abstract class TourismSingleTripFragmentModule {
        @Binds
        @IntoMap
        @ViewModelKey(SingleTripViewModel::class)
        abstract fun bindProfileViewModel(viewModel: SingleTripViewModel): ViewModel
    }


    @ContributesAndroidInjector(modules = [TourismShopFragmentModule::class])
    abstract fun contributeShopFragment(): ShopFragment

    @Module
    abstract class TourismShopFragmentModule {
        @Binds
        @IntoMap
        @ViewModelKey(ShopViewModel::class)
        abstract fun bindShopViewModel(viewModel: ShopViewModel): ViewModel
    }


    @ContributesAndroidInjector(modules = [TourismVirtualSafariFragmentModule::class])
    abstract fun contributeVirtualSafariFragment(): VirtualSafariFragment

    @Module
    abstract class TourismVirtualSafariFragmentModule {
        @Binds
        @IntoMap
        @ViewModelKey(VirtualSafariViewModel::class)
        abstract fun bindvirtualSafariViewModel(viewModel: VirtualSafariViewModel): ViewModel
    }


    @ContributesAndroidInjector(modules = [TourismPersonalTripsFragmentModule::class])
    abstract fun contributePersonalTripsFragment(): PersonalTripsFragment

    @Module
    abstract class TourismPersonalTripsFragmentModule {
        @Binds
        @IntoMap
        @ViewModelKey(PersonalTripsViewModel::class)
        abstract fun bindPersonalTripsViewModel(viewModel: PersonalTripsViewModel): ViewModel
    }


    @ContributesAndroidInjector(modules = [TourismBibleKenyaFragmentModule::class])
    abstract fun contributeBibleKenyaFragment(): BibleKenyaFragment

    @Module
    abstract class TourismBibleKenyaFragmentModule {
        @Binds
        @IntoMap
        @ViewModelKey(BibleKenyaViewModel::class)
        abstract fun bindPersonalTripsViewModel(viewModel: BibleKenyaViewModel): ViewModel
    }


    @ContributesAndroidInjector(modules = [TourismAirtelFragmentModule::class])
    abstract fun contributeAirtelFragment(): AirtelFragment

    @Module
    abstract class TourismAirtelFragmentModule {
        @Binds
        @IntoMap
        @ViewModelKey(AirtelViewModel::class)
        abstract fun bindAirtelViewModel(viewModel: AirtelViewModel): ViewModel
    }


    @ContributesAndroidInjector(modules = [TourismMakePaymentsFragmentModule::class])
    abstract fun contributeMakePaymentsFragment(): MakePaymentsFragment

    @Module
    abstract class TourismMakePaymentsFragmentModule {
        @Binds
        @IntoMap
        @ViewModelKey(MakePaymentsViewModel::class)
        abstract fun bindMakePaymentsViewModel(viewModel: MakePaymentsViewModel): ViewModel
    }


    @ContributesAndroidInjector(modules = [TourismMpesaFragmentModule::class])
    abstract fun contributeMpesaFragment(): MpesaFragment

    @Module
    abstract class TourismMpesaFragmentModule {
        @Binds
        @IntoMap
        @ViewModelKey(MpesaViewModel::class)
        abstract fun bindMpesaViewModel(viewModel: MpesaViewModel): ViewModel
    }


    @ContributesAndroidInjector(modules = [TourismSavingsFragmentModule::class])
    abstract fun contributeSavingsFragment(): SavingsAccountFragment

    @Module
    abstract class TourismSavingsFragmentModule {
        @Binds
        @IntoMap
        @ViewModelKey(SavingsAccountViewModel::class)
        abstract fun bindSavingsViewModel(viewModel: SavingsAccountViewModel): ViewModel
    }



    @ContributesAndroidInjector(modules = [TourismGetStatementFragmentModule::class])
    abstract fun contributeGetStatementFragment(): GetStatementFragment

    @Module
    abstract class TourismGetStatementFragmentModule {
        @Binds
        @IntoMap
        @ViewModelKey(GetStatementViewModel::class)
        abstract fun bindSGetStatementViewModel(viewModel: GetStatementViewModel): ViewModel
    }


    @ContributesAndroidInjector(modules = [TourismTopUpFragmentModule::class])
    abstract fun contributeTopUpFragment(): TopUpFragment

    @Module
    abstract class TourismTopUpFragmentModule {
        @Binds
        @IntoMap
        @ViewModelKey(TopUpViewModel::class)
        abstract fun bindTopUpViewModel(viewModel: TopUpViewModel): ViewModel
    }



    @ContributesAndroidInjector(modules = [TourismIntermediateFragmentModule::class])
    abstract fun contributeIntermediateFragment(): IntermediateFragment

    @Module
    abstract class TourismIntermediateFragmentModule {
        @Binds
        @IntoMap
        @ViewModelKey(IntermediateViewModel::class)
        abstract fun bindIntermediateViewModel(viewModel: IntermediateViewModel): ViewModel
    }


    @ContributesAndroidInjector(modules = [TourismPesaLinkFragmentModule::class])
    abstract fun contributePesaLinkFragment(): PesaLinkFragment

    @Module
    abstract class TourismPesaLinkFragmentModule {
        @Binds
        @IntoMap
        @ViewModelKey(PesaLinkViewModel::class)
        abstract fun bindPesaLinkViewModel(viewModel: PesaLinkViewModel): ViewModel
    }


    @ContributesAndroidInjector(modules = [TourismPinFragmentModule::class])
    abstract fun contributePinFragment(): PinFragment

    @Module
    abstract class TourismPinFragmentModule {
        @Binds
        @IntoMap
        @ViewModelKey(PinViewModel::class)
        abstract fun bindPinViewModel(viewModel: PinViewModel): ViewModel
    }


    @ContributesAndroidInjector(modules = [TourismShopItemFragmentModule::class])
    abstract fun contributeItemDetailFragment(): ItemDetailFragment

    @Module
    abstract class TourismShopItemFragmentModule {
        @Binds
        @IntoMap
        @ViewModelKey(ItemDetailViewModel::class)
        abstract fun bindItemDetailViewModel(viewModel: ItemDetailViewModel): ViewModel
    }


    @ContributesAndroidInjector(modules = [TourismAccountSettingsFragmentModule::class])
    abstract fun contributeAccountSettingsFragment(): AccountSettingsFragment

    @Module
    abstract class TourismAccountSettingsFragmentModule {
        @Binds
        @IntoMap
        @ViewModelKey(AccountSettingsViewModel::class)
        abstract fun bindAccountSettingsViewModel(viewModel: AccountSettingsViewModel): ViewModel
    }






}
