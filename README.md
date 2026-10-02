# Kotlin Playground

A personal repository for learning Kotlin by running small chunks of code. Each topic is explored in a notebook or a lesson file, and the git history works as a learning diary.

## Tools

- Kotlin (JVM) with Gradle (Kotlin DSL)
- JDK 21
- IntelliJ IDEA with the Kotlin Notebook plugin

## Project structure

```
playground/
├── notebooks/            Kotlin Notebooks (.ipynb) for exploring topics
│   └── Basics.ipynb
├── src/
│   ├── main/kotlin/
│   │   ├── basics/       variables, functions
│   │   └── collections/  lists
│   └── test/kotlin/
│       └── basics/       tests to check my own solutions
├── scripts/              small .kts / .main.kts scripts (optional)
├── GIT-NOTES.md          my git cheat sheet
├── build.gradle.kts
└── settings.gradle.kts
```

## How to run things

**Lesson files:** open a file under `src/main/kotlin` and click the green ▶ next to `main()`, or press `Ctrl+Shift+F10`.

**Notebooks:** open a file in `notebooks/`, then run a cell with `Shift+Enter` or use **Run All**. Restart the kernel and run all cells before committing, to confirm the notebook works from scratch.

**Tests:**

```powershell
.\gradlew test
```

**Scripts:** open a file in `scripts/` and click ▶.

**Scratch files:** quick experiments live outside the repo (`Ctrl+Alt+Shift+Insert` → Kotlin). Anything worth keeping gets moved into a notebook or a lesson file.

## Workflow

1. Try an idea in a scratch file or notebook cell.
2. Write down what I learned in a Markdown cell or a comment.
3. Move code worth keeping into a lesson file, with a test if there is something to verify.
4. Clear notebook outputs, then commit with a message that says what I learned.

### Commit message style

```
topic: what I learned
```

Examples:

- `basics: val vs var, type inference, string templates`
- `collections: map, filter and fold`
- `notebooks: dataframe tables and kandy bar chart`

## Topics

- [ ] Variables and types
- [ ] Functions
- [ ] Lists
- [ ] Maps and sets
- [ ] Null safety
- [ ] Classes and data classes
- [ ] Extension functions and lambdas
- [ ] Coroutines

## Notes

- `.idea/`, `build/` and `.gradle/` are not tracked.
- Notebook outputs are cleared before committing to keep diffs small.
- Git commands I want to remember are in [GIT-NOTES.md](GIT-NOTES.md).