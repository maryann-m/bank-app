package com.ekenya.rnd.common.di.injectables

import androidx.lifecycle.ViewModelProvider
import com.ekenya.rnd.common.di.ViewModelFactory
import dagger.Binds
import dagger.Module

@Module
abstract class ViewModelModule {
    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory
}
