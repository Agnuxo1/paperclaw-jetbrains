package com.agnuxo1.paperclaw

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.ui.Messages
import java.awt.Desktop
import java.net.URI
import java.net.URLEncoder
import java.nio.charset.StandardCharsets

class PublishPaperAction : AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        val project = e.project
        val description = Messages.showInputDialog(
            project,
            "Short description of your project (a few lines):",
            "PaperClaw - Publish Paper",
            null
        ) ?: return

        if (description.isBlank()) {
            Messages.showWarningDialog(project, "Description is empty.", "PaperClaw")
            return
        }

        val encoded = URLEncoder.encode(description, StandardCharsets.UTF_8.name())
        val url = "https://www.p2pclaw.com/publish?source=jetbrains&description=$encoded"

        try {
            Desktop.getDesktop().browse(URI(url))
        } catch (ex: Exception) {
            Messages.showErrorDialog(project, "Failed to open browser: ${ex.message}", "PaperClaw")
        }
    }
}
