package com.erditurkay.jetpackcomposetemplate.ui.detail

import androidx.lifecycle.ViewModel
import com.erditurkay.jetpackcomposetemplate.data.repository.ExampleRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DetailViewModel @Inject constructor(private val exampleRepository: ExampleRepository) : ViewModel() {
    private val TAG = DetailViewModel::class.java.simpleName
}
