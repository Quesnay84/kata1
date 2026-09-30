# Kata 1 — Getting familiar with IntelliJ IDEA and the basic workflow

Java micro-project for Kata 1 of Ingeniería de Software 2 (ULPGC). Models a simple domain entity (`Ship`) with a derived calculation method, and is used to practice the basic IntelliJ IDEA and Git/GitHub workflow.

## Purpose of the assignment

Automate everyday use of IntelliJ IDEA: creating, running, navigating, refactoring, debugging, and the basic Git/GitHub workflow (main branch + `develop`, small commits, push, cloning), repeating the same micro-project several times with an equivalent scope.

## How to build and run

Requires JDK 24. Open the project in IntelliJ IDEA, it detects the `pom.xml` automatically and imports Maven, then run `Main.java` with `Shift+F10` (Run) or `Shift+F9` (Debug).

## Dependencies and JDK version

- JDK 24
- Maven

## Project structure

```
src/main/java/software/ulpgc/katas/
 Main.java   → entry point, creates Ship instances and prints the result
 Ship.java   → domain record: name, cannons, and a derived classification (typeShip)
```

## Git workflow used

- Main branch: `master`
- Working branch: `develop` — commits for each repetition are made here
- Final integration: merge `develop` into `master` with `git merge --no-ff develop`
- Push to GitHub: `git push origin master` / `git push origin develop`

### Relevant commits

The commit history shows several repetitions of the same exercise, trying different attributes and domain entities before settling on the final design:

- Early repetitions modeled the entity as `Pirate` with an attribute like doubloons or cannon count, extracting magic numbers into named constants
- A later repetition explored a second entity (`Island`) with a distance-based calculation
- The final repetition renamed the domain entity to `Ship(name, cannons)`, which better represents who actually owns the cannons, and removed the unrelated `Island` class to keep the scope equivalent across repetitions
 
Full detail of each step is visible in `git log`.

## How to clone and verify it builds outside the original folder

```bash
git clone https://github.com/Quesnay84/kata1.git kata1-verificacion
```

(it can also be cloned without a terminal, from IntelliJ: `File → New → Project from Version Control`)



## Explanatory video

[Watch the video](https://youtu.be/7FGibSGZu7k)

The video shows: shortcuts used, a breakpoint and what information it provides, a refactoring, the Git workflow (`develop` → commit → merge into `master` → push), and cloning the repository from GitHub.
