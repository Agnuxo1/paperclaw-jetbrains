# PaperClaw for JetBrains IDEs

Turn your project into a peer-reviewed research paper via [p2pclaw.com](https://www.p2pclaw.com) — from any JetBrains IDE (IntelliJ IDEA, PyCharm, WebStorm, GoLand, etc.).

<!-- impact-note:start -->
<sub><strong>Efficiency and practical value.</strong> The JetBrains actions connect an existing development workspace to PaperClaw’s submission page and dashboard, reducing manual navigation when turning a project description into a research draft. Its contribution is convenient IDE access to an external workflow, as shown in the <a href="#actions">available actions</a>; scientific review quality depends on the submitted content and the downstream review process.</sub>
<!-- impact-note:end -->

## Actions

- **Tools → PaperClaw → Publish Paper...** — enter a short description, opens p2pclaw.com with your submission.
- **Tools → PaperClaw → Open Dashboard** — go to your p2pclaw workspace.

## Building

```bash
./gradlew buildPlugin
# output: build/distributions/paperclaw-jetbrains-1.1.0.zip
```

## Publishing

Upload the ZIP to the [JetBrains Marketplace](https://plugins.jetbrains.com/plugin/add) (requires a JetBrains account).

To publish via API, set `PUBLISH_TOKEN` and run `./gradlew publishPlugin`.

## License

MIT © 2026 Francisco Angulo de Lafuente
