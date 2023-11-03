package com.moataz.fetchtask.app.di

import com.moataz.fetchtask.data.repositories.FetchRepositoryImpl
import com.moataz.fetchtask.domain.repository.FetchRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
abstract class RepositoryModule {

    @ViewModelScoped
    @Binds
    abstract fun bindFetchRepository(
        fetchRepositoryImpl: FetchRepositoryImpl,
    ): FetchRepository
}
