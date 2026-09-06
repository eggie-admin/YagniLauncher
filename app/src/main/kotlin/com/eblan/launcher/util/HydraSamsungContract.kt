/*
 * Hydra Samsung integration additions are distributed under this repository's GPL-3.0 license.
 */
package com.eblan.launcher.util

import android.content.Intent
import android.net.Uri

object HydraSamsungContract {
    const val ACTION_OPEN_COCKPIT = "art.eggiebagelface.hydra.action.OPEN_COCKPIT"
    const val ACTION_OPEN_TERMUX = "art.eggiebagelface.hydra.action.OPEN_TERMUX"
    const val ACTION_OPEN_SHIZUKU = "art.eggiebagelface.hydra.action.OPEN_SHIZUKU"
    const val ACTION_OPEN_TERMUX_X11 = "art.eggiebagelface.hydra.action.OPEN_TERMUX_X11"

    const val TERMUX_PACKAGE = "com.termux"
    const val SHIZUKU_PACKAGE = "moe.shizuku.privileged.api"
    const val TERMUX_X11_PACKAGE = "com.termux.x11"

    val cockpitUri: Uri = Uri.parse("http://127.0.0.1:8787/")

    fun cockpitIntent(): Intent = Intent(Intent.ACTION_VIEW, cockpitUri)
}
