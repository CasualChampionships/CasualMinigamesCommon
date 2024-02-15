package net.casual.championships.common.util

import net.casual.arcade.gui.screen.SelectionScreenComponents
import net.casual.arcade.utils.ItemUtils.named
import net.casual.championships.common.item.MenuItem
import net.minecraft.network.chat.Component

object CommonScreens {
    private val COMPONENTS = SelectionScreenComponents.Builder().apply {
        next(MenuItem.LONG_NEXT.named("Next"), MenuItem.UNAVAILABLE_LONG_NEXT.named("Next"))
        previous(MenuItem.LONG_PREVIOUS.named("Previous"), MenuItem.UNAVAILABLE_LONG_PREVIOUS.named("Previous"))
        back(MenuItem.CROSS.named("Back"), MenuItem.CROSS.named("Exit"))
    }.build()

    fun named(title: Component): SelectionScreenComponents {
        return SelectionScreenComponents.Builder(COMPONENTS).title(title).build()
    }
}