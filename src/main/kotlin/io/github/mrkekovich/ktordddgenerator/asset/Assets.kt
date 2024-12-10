package io.github.mrkekovich.ktordddgenerator.asset

import com.intellij.openapi.util.IconLoader
import javax.swing.Icon

abstract class Assets {
    protected fun loadIcon(path: String): Icon =
        IconLoader.getIcon(
            path,
            Assets::class.java,
        )
}
