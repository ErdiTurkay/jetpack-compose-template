package com.erditurkay.jetpackcomposetemplate.data.repository

import com.erditurkay.jetpackcomposetemplate.data.dao.ExampleDao
import com.erditurkay.jetpackcomposetemplate.data.remote.AppApi
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ExampleRepository @Inject constructor(private val appApi: AppApi, private val exampleDao: ExampleDao)
