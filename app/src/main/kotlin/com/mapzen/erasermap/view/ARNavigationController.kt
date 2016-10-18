package com.mapzen.erasermap.view

import android.app.Activity
import android.os.Vibrator
import android.content.Context
import com.mapzen.erasermap.R
import com.mapzen.helpers.RouteEngine
import com.mapzen.valhalla.Instruction
import com.mapzen.valhalla.Router

open class ARNavigationController(val activity: Activity) {

    init {
    }

    fun playStart(instruction: Instruction): Unit =
        play(instruction.turnInstruction)

    fun playMilestone(instruction: Instruction,
            milestone: RouteEngine.Milestone,
            units: Router.DistanceUnits) {
        play(instruction.turnInstruction)
    }

    fun stop() {
//        speakerbox.stop()
    }

    fun playPre(instruction: Instruction): Unit =
            play(instruction.turnInstruction)

    fun playPost(instruction: Instruction): Unit =
            play(instruction.turnInstruction)

    private fun play(turnType: Int) {
//        val vibrator = this.getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
//        if (turnType==0) {
//            vibrator.vibrate(500)
//        } else {
//            vibrator.vibrate(100)
//        }
    }

//    fun mute() {
//        speakerbox.mute()
//    }
//
//    fun unmute() {
//        speakerbox.unmute()
//    }
//
//    fun isMuted(): Boolean {
//        return speakerbox.isMuted()
//    }

    fun shutdown() {
    }

}
