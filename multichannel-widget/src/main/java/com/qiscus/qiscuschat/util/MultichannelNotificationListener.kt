package com.qiscus.qiscuschat.util

import android.content.Context
import com.qiscus.sdk.chat.core.data.model.QiscusComment

/**
 * Created on : 2020-03-02
 * Author     : Taufik Budi S
 * Github     : https://github.com/tfkbudi
 */
interface MultichannelNotificationListener {

    fun handleMultichannelListener(context: Context?, qiscusComment: QiscusComment?)
}