# MiniShell - Java Command Line Shell / מסוף שורת פקודה בג'אווה

## Overview / סקירה כללית
MiniShell הוא יישום שורת פקודה פשוט ב-Java, המדמה מסוף פקודות בסיסי.  
MiniShell is a simple Java command-line application that mimics basic terminal commands.

---

## Features / פקודות נתמכות
- *pwd* - מציג את הנתיב הנוכחי / Print the current working directory.
- *ls* - מציג את רשימת הקבצים והתיקיות / List files and directories.
- *cd [directory]* - עובר לתיקיה מסוימת / Change to a specific directory.
- *mkdir [directory]* - יוצר תיקיה חדשה / Create a new directory.
- *touch [file]* - יוצר קובץ חדש / Create a new file.
- *help* - מציג את רשימת הפקודות / Show help message.
- *exit* - יוצא מהמסוף / Exit the shell.

---

## Project Structure / מבנה הפרויקט
MiniShellProject/
├── src/
│   ├── MiniShell.java
│   └── ShellCommandHandler.java
├── docs/
│   └── FILESYSTEM_RESEARCH.md
└── README.md
---

## How to Run / איך להפעיל
1. *Compile the code / לקמפל את הקוד:*
javac src/*.java
2. *Run the program / להפעיל את התוכנית:*
java -cp src MiniShell
---

## Example Commands / דוגמה לשימוש
mkdir MyFolder
cd MyFolder
touch MyFile.txt
ls
cd ..
help
exit
---

## GitHub Instructions / הוראות עבודה עם GitHub
1. *Initialize a repository / אתחול מאגר:*
git init
2. *Commit your work / לבצע קומיט:*
git add .
git commit -m “Initial commit”
3. *Add remote and push / הוספת רמוט ושליחה:*
git remote add origin https://github.com/your-username/MiniShellProject.git
git branch -M main
git push -u origin main
---

## Author / מחבר
רסיל דארי - Azrieli College of Engineering  
Raseel Dari - Azrieli College of Engineering

---

בהצלחה! Good Luck!
