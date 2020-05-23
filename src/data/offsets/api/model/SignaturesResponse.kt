package data.offsets.api.model

import kotlin.reflect.full.memberProperties

data class SignaturesResponse(
    val anim_overlays: Int,
    val clientstate_choked_commands: Int,
    val clientstate_delta_ticks: Int,
    val clientstate_last_outgoing_command: Int,
    val clientstate_net_channel: Int,
    val convar_name_hash_table: Int,
    val dwClientState: Int,
    val dwClientState_GetLocalPlayer: Int,
    val dwClientState_IsHLTV: Int,
    val dwClientState_Map: Int,
    val dwClientState_MapDirectory: Int,
    val dwClientState_MaxPlayer: Int,
    val dwClientState_PlayerInfo: Int,
    val dwClientState_State: Int,
    val dwClientState_ViewAngles: Int,
    val dwEntityList: Int,
    val dwForceAttack: Int,
    val dwForceAttack2: Int,
    val dwForceBackward: Int,
    val dwForceForward: Int,
    val dwForceJump: Int,
    val dwForceLeft: Int,
    val dwForceRight: Int,
    val dwGameDir: Int,
    val dwGameRulesProxy: Int,
    val dwGetAllClasses: Int,
    val dwGlobalVars: Int,
    val dwGlowObjectManager: Int,
    val dwInput: Int,
    val dwInterfaceLinkList: Int,
    val dwLocalPlayer: Int,
    val dwMouseEnable: Int,
    val dwMouseEnablePtr: Int,
    val dwPlayerResource: Int,
    val dwRadarBase: Int,
    val dwSensitivity: Int,
    val dwSensitivityPtr: Int,
    val dwSetClanTag: Int,
    val dwViewMatrix: Int,
    val dwWeaponTable: Int,
    val dwWeaponTableIndex: Int,
    val dwYawPtr: Int,
    val dwZoomSensitivityRatioPtr: Int,
    val dwbSendPackets: Int,
    val dwppDirect3DDevice9: Int,
    val find_hud_element: Int,
    val force_update_spectator_glow: Int,
    val interface_engine_cvar: Int,
    val is_c4_owner: Int,
    val m_bDormant: Int,
    val m_flSpawnTime: Int,
    val m_pStudioHdr: Int,
    val m_pitchClassPtr: Int,
    val m_yawClassPtr: Int,
    val model_ambient_min: Int,
    val set_abs_angles: Int,
    val set_abs_origin: Int
) {
    fun getSignatures() = this::class.memberProperties.map { it.name to it.getter.call(this) as Int }
}