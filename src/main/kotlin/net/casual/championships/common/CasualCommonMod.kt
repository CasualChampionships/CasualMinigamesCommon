package net.casual.championships.common

import eu.pb4.polymer.resourcepack.api.ResourcePackCreator
import net.casual.arcade.utils.ComponentUtils.literal
import net.casual.arcade.utils.ResourcePackUtils.addLangsFromData
import net.casual.championships.common.item.CasualCommonItems
import net.fabricmc.api.DedicatedServerModInitializer
import net.fabricmc.loader.api.FabricLoader
import net.fabricmc.loader.api.ModContainer
import net.minecraft.resources.ResourceLocation
import org.slf4j.Logger
import org.slf4j.LoggerFactory

object CasualCommonMod: DedicatedServerModInitializer {
    const val MOD_ID = "casual_common"

    val logger: Logger = LoggerFactory.getLogger("CasualCommon")

    val COMMON_PACK_CREATOR: ResourcePackCreator = ResourcePackCreator.create()

    init {
        COMMON_PACK_CREATOR.apply {
            addAssetSource(MOD_ID)
            addLangsFromData(MOD_ID)
            packDescription = "Common resources used in CasualChampionships".literal()
        }
    }

    override fun onInitializeServer() {
        CasualCommonItems.noop()
    }

    fun id(path: String): ResourceLocation {
        return ResourceLocation(MOD_ID, path)
    }
}