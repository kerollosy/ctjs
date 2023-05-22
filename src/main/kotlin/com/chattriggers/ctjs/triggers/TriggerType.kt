package com.chattriggers.ctjs.triggers

import com.chattriggers.ctjs.engine.module.ModuleManager

// TODO(breaking): Removed a bunch of less-used triggers
enum class TriggerType {
    // client
    CHAT,
    ACTION_BAR,
    TICK,
    STEP,
    GAME_UNLOAD,
    GAME_LOAD,
    CLICKED,
    SCROLLED,
    DRAGGED,
    GUI_OPENED,
    MESSAGE_SENT,
    TOOLTIP,
    PLAYER_INTERACT,
    HIT_BLOCK,
    GUI_RENDER,
    GUI_KEY,
    GUI_MOUSE_CLICK,
    GUI_MOUSE_DRAG,
    PACKET_SENT,
    PACKET_RECEIVED,
    SERVER_CONNECT,
    SERVER_DISCONNECT,
    GUI_CLOSED,

    // rendering
    PRE_RENDER_WORLD,
    POST_RENDER_WORLD,
    BLOCK_HIGHLIGHT,
    RENDER_OVERLAY,
    RENDER_PLAYER_LIST,
    RENDER_ENTITY,
    POST_GUI_RENDER,

    // world
    SOUND_PLAY,
    WORLD_LOAD,
    WORLD_UNLOAD,
    BLOCK_BREAK,
    SPAWN_PARTICLE,
    ENTITY_DEATH,
    ENTITY_DAMAGE,

    // misc
    MIXIN,
    COMMAND,
    OTHER;

    fun triggerAll(vararg args: Any?) {
        ModuleManager.trigger(this, args)
    }
}
