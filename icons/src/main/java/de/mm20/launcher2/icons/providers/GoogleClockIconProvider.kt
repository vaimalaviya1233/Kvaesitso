package de.mm20.launcher2.icons.providers

import android.content.Context
import android.content.pm.PackageManager
import android.content.res.Resources
import android.graphics.drawable.AdaptiveIconDrawable
import android.graphics.drawable.LayerDrawable
import android.os.Build
import androidx.core.content.res.ResourcesCompat
import de.mm20.launcher2.icons.ClockDynamicLauncherIcon
import de.mm20.launcher2.icons.IconPackManager
import de.mm20.launcher2.icons.LauncherIcon
import de.mm20.launcher2.search.data.Application
import de.mm20.launcher2.search.data.Searchable

class GoogleClockIconProvider(val context: Context) : IconProvider {
    override suspend fun getIcon(searchable: Searchable, size: Int): LauncherIcon? {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.O) return null
        if (searchable !is Application) return null
        if (searchable.`package` != "com.google.android.deskclock") return null
        val pm = context.packageManager
        val appInfo = try {
            pm.getApplicationInfo(
                IconPackManager.GOOGLE_DESK_CLOCK_PACKAGE_NAME,
                PackageManager.GET_META_DATA
            )
        } catch (e: PackageManager.NameNotFoundException) {
            return null
        }
        val drawable =
            appInfo.metaData.getInt("com.google.android.apps.nexuslauncher.LEVEL_PER_TICK_ICON_ROUND")
        val resources = pm.getResourcesForApplication(appInfo)
        val baseIcon = try {
            ResourcesCompat.getDrawable(resources, drawable, null) as? AdaptiveIconDrawable
                ?: return null
        } catch (e: Resources.NotFoundException) {
            return null
        }
        val foreground = baseIcon.foreground as? LayerDrawable ?: return null
        val hourLayer =
            appInfo.metaData.getInt("com.google.android.apps.nexuslauncher.HOUR_LAYER_INDEX")
        val minuteLayer =
            appInfo.metaData.getInt("com.google.android.apps.nexuslauncher.MINUTE_LAYER_INDEX")
        val secondLayer =
            appInfo.metaData.getInt("com.google.android.apps.nexuslauncher.SECOND_LAYER_INDEX")
        return ClockDynamicLauncherIcon(
            context = context,
            background = baseIcon.background,
            backgroundScale = 1.5f,
            foreground = foreground,
            foregroundScale = 1.5f,
            badgeNumber = 0f,
            hourLayer = hourLayer,
            minuteLayer = minuteLayer,
            secondLayer = secondLayer
        )
    }
}