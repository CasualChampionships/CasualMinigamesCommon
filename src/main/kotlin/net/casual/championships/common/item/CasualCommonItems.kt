package net.casual.championships.common.item

import net.casual.championships.common.CasualCommonMod
import net.minecraft.world.item.Item
import net.minecraft.world.item.Items
import java.util.*

object CasualCommonItems {
    val GOLDEN_HEAD = register("golden_head", GoldenHeadItem())
    val PLAYER_HEAD = register("player_head", PlayerHeadItem())

    val MENU = register("menu", MenuItem.MODELLER.item())

    fun noop() {

    }

    private fun <T: Item> register(key: String, item: T): T {
        Items.registerItem(CasualCommonMod.id(key), item)
        return item
    }
}