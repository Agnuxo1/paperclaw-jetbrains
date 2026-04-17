package com.agnuxo1.paperclaw

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.ui.Messages
import java.awt.Desktop
import java.net.URI

class OpenDashboardAction : AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        try {
            Desktop.getDesktop().browse(URI("https://www.p2pclaw.com"))
        } catch (ex: Exception) {
            Messages.showErrorDialog(e.project, "Failed to open browser: ${ex.message}", "PaperClaw")
        }
    }
}
