package com.ekenya.rnd.etourism.di

import com.ekenya.rnd.baseapp.di.AppComponent
import com.ekenya.rnd.baseapp.di.ModuleScope
import com.ekenya.rnd.baseapp.di.injectables.ViewModelModule
import com.ekenya.rnd.etourism.di.injectables.ContextModule
import com.ekenya.rnd.etourism.di.injectables.TourismActivityModule
import com.ekenya.rnd.etourism.di.injectables.TourismFragmentModule
import com.ekenya.rnd.etourism.ui.AppData
import dagger.Component
import dagger.Provides
import dagger.android.support.AndroidSupportInjectionModule

@ModuleScope
@Component(
    dependencies = [
        AppComponent::class
    ],
    modules = [
        AndroidSupportInjectionModule::class,
        TourismActivityModule::class,
        TourismFragmentModule::class,
        ViewModelModule::class,
        ContextModule::class,
    ]
)
interface TourismComponent {
    fun inject(injector: TourismInjector)
    fun inject(appData: AppData)
}