# Git notes

## Daily loop
```
git status                  # what changed?
git diff                    # see unstaged changes
git add <file>              # stage a file
git commit -m "topic: what I learned"
git log --oneline           # history, one line per commit
```

## Undo and fix
```
git reset                   # unstage everything (keeps files)
git restore <file>          # discard changes in a file (careful: lost)
git commit --amend          # fix the last commit (before pushing only)
```

## Branches
```
git switch -c lesson/name   # create and switch
git switch main
git merge lesson/name
```

## Remote
```
git remote add origin https://github.com/Claude-Martin/playground.git
git push -u origin main     # first push, sets the upstream
git push                    # later pushes
```

## Milestones
```
git tag week-1-basics
```

## Things I learned the hard way
- `.idea/` must be in .gitignore before the first `git add .`
- Clear notebook outputs before committing (Find Action -> Clear All Outputs)


## first git cmds
git reset
git status
git add .gitignore build.gradle.kts settings.gradle.kts gradle.properties gradlew gradlew.bat gradle/
git commit -m "chore: initial Gradle Kotlin project"

git add src/main/kotlin/basics src/test/kotlin/basics
git commit -m "basics: variables, functions and first test"

git add src/main/kotlin/collections
git commit -m "collections: lists"

git add notebooks/Basics.ipynb
git commit -m "notebooks: basics, dataframe tables and kandy bar chart"

git add scripts/hello.kts
git commit -m "scripts: hello script for trying .kts files"

git add README.md GIT-NOTES.md
git commit -m "docs: add README and git cheat sheet"

git status
git log --oneline