# JetBrains Marketplace — PaperClaw

## Build (once full Kotlin/Java source is wired)

```bash
./gradlew buildPlugin
# output: build/distributions/paperclaw-1.1.0.zip
```

## Manual action required

1. Register/login at <https://plugins.jetbrains.com> as `Agnuxo1`.
2. **Upload plugin → New plugin** and attach the signed `paperclaw-1.1.0.zip`.
3. Tag: `AI`, `Tools Integration`. Family: **IntelliJ Platform**.
4. Submit for moderation (usually 1-3 business days).

This folder contains `plugin.xml` (metadata skeleton) only — the Kotlin/Java action
classes referenced (`PublishProjectAction`, etc.) still need to be implemented in the
`paperclaw-jetbrains-plugin` source repo.
