package com.yandex.practicum.middle_homework_4.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.ExperimentalPagingApi
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import androidx.paging.compose.LazyPagingItems
import androidx.paging.compose.collectAsLazyPagingItems
import com.yandex.practicum.middle_homework_4.data.NewsRemoteMediator
import com.yandex.practicum.middle_homework_4.data.setting_repository.SettingContainer
import com.yandex.practicum.middle_homework_4.data.database.NewsDatabase
import com.yandex.practicum.middle_homework_4.data.database.entity.News
import com.yandex.practicum.middle_homework_4.ui.contract.SettingsRepository
import com.yandex.practicum.middle_homework_4.ui.contract.NewsService
import com.yandex.practicum.middle_homework_4.ui.contract.WorkManagerService
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch

class AppViewModel(
    private val newsService: NewsService,
    private val newsDatabase: NewsDatabase,
    private val workManagerService: WorkManagerService,
    private val dataStoreService: SettingsRepository,
) : ViewModel() {
    private var pagingItems: LazyPagingItems<News>? = null

    @OptIn(ExperimentalPagingApi::class)

    fun attachPagingItems(paging: LazyPagingItems<News>?) {
        pagingItems = paging
    }

    fun detachPagingItems() {
        pagingItems = null
    }




    }


    companion object {
        const val PAGE_SIZE = 20
        const val PREFETCH_DISTANCE = 20
    }
}