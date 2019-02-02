
## Getting started

1. [Install the FRC Update Suite](https://wpilib.screenstepslive.com/s/currentCS/m/java/l/1027504-installing-the-frc-update-suite-all-languages)
2. [Install the FRC edition of VS Code, which comes with wpilib](https://github.com/wpilibsuite/allwpilib/releases)
3. [Install the libraries for the motor controllers](https://github.com/CrossTheRoadElec/Phoenix-Releases/releases/download/Phoenix_v5.12.1.0/CTRE.Phoenix.Framework.v5.12.1.0.zip)
4. [Install Git for Windows](https://git-scm.com/download/win)

Next, in VS Code, `Ctrl+Shift+P` to bring up the command palette and run `Git: Clone` and provide the URL `https://github.com/LegitGamer1017/7849ers.git` to download this project.

## To upload the code

1. In VS Code, in the upper right hand corner there is a `...` button, upon clicking that there should be a `Deploy Robot Code` button.
2. You can then open the FRC Driver Station application (installed as part of step 1 above) to `Enable` the robot. (Don't confuse this with the FRC Smart Dashboard, which is different.)

## Working with Git / Github

Git is not a simple tool, and undergraduates can spend entire semesters failing to really figure out how to use it.
As a result, we have to make sure we keep things in a simple "happy path" or we'll spend too much time on git and not robots.
We should be able to do that if we follow one simple rule:

**There should be only one "coding computer" in use at a time.**

This should avoid all the complicated stuff involving merging changes from multiple people together (or worse, merge _conflicts_).

**Before you begin** each day, you should "pull" the latest code from Github.
This can be done by using `Ctrl+Shift+P` in VS Code and selecting `Git: Pull`.

**At the end** of each day, you should "commit and push" your latest changes.
This is a two step process.
First, use `Git: Commit All`. This will ask you to save (if needed), whether to automatically stage your changes (Yes), and ask for a commit message (a short "what we did today" reminder).
Second, use `Git: Push`. This will upload your changes (the commit you just made) from your computer to Github, so they're visible to everyone else.

Both of these steps should not be neglected.
If we use the same computer each day, the "pull" step might do nothing, but it's a good habit to get into, and it may be necessary to get changes from mentors (like this short guide I'm writing here).

And we should never forget to commit and push.
If you didn't push, it didn't happen.

By using git, we:

1. Have a backup, in case something happens to the laptop with the code on it.
2. Have a single "source of truth" for what the robot code is. This avoids having lots of laptops with lots of different little experiments on them. Everyone's goal should be to get those experiments into the main code, and get them committed and pushed. Because if they're not pushed, they haven't happened! :)
3. Can easily switch coding computers, for whatever reason might arise.
4. Have a tracked history of changes. If anything gets hopelessly screwed up, git allows us to just start over and go back to yesterday, discarding today's mistakes.
(Indeed, if you ever get to a point where you're celebrating something working and want to preserve that code before you make further changes, just commit and push right then!)
5. Allow everyone to read the code easily. It's shared, instead of locked away on one laptop somewhere.