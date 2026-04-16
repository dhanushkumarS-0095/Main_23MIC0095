TO  DO IN ECLPSE
STEP 1: Create Java Program (Student Grade)
🔹 Open IDE
Open Eclipse / MyEclipse
Wait until workspace loads completely
🔹 Create Java Project
Click File → New → Java Project
In Project Name, type:

StudentGrade
Click Finish
🔹 Create Package
Right-click project → New → Package
Enter package name:

com.student.grade
Click Finish
🔹 Create Class
Right-click package → New → Class
Enter class name:

GradeCalculator
Tick: ✔ public static void main(String[] args)
Click Finish
🔹 Write Program
Type Java code:
Import Scanner
Take marks input
Use if-else for grade
🔹 Save & Run
Press Ctrl + S
Click Run → Run As → Java Application
🔹 Output
Enter marks in console
Program displays:

Grade: A / B / C / D / Fail
✅ STEP 2: Create GitHub Repository
🔹 Open GitHub
Go to https://github.com⁠�
Login with your account
🔹 Create Repo
Click + (top right) → New repository
Enter:
Repository Name: JavaGradeSystem
Select: ✔ Public (or Private)
Click Create repository
🔹 Copy Repo URL
In next page, copy:

https://github.com/yourusername/JavaGradeSystem.git
✅ STEP 3: Generate Personal Access Token
Click profile icon → Settings
Go to Developer Settings
Click Personal Access Tokens
Click Tokens (classic)
Click Generate new token
Enter:
Note: Eclipse Push
Select: ✔ repo
Click Generate token
Copy token (save safely)
✅ STEP 4: Share Project with Git (Eclipse)
Right-click project → Team → Share Project
Select: ✔ Git
Click Next
Click Create
Click Finish
✅ STEP 5: Add Files to Git (Staging)
Right-click project → Team → Add to Index
👉 OR
Click + (Add all files) in Git window
✅ STEP 6: Commit Code
Right-click project → Team → Commit
Tick all files
Enter message:

Initial Commit
Click: ✔ Commit and Push
✅ STEP 7: Push Code to GitHub
🔹 Configure Remote
Click Add Remote
Enter:
Name: origin
URI: paste GitHub URL
🔹 Authentication
Enter:
Username → GitHub username
Password → Personal Access Token
🔹 Push
Click Next → Finish → Push
🔹 Verify
Open GitHub repo
Refresh page
Check: ✔ Java file present
✅ STEP 8: Install Jenkins
Download from: https://www.jenkins.io/download/⁠�
Select: ✔ Windows (.msi)
Right-click file → Run as Administrator
Click Next → Install → Finish
✅ STEP 9: Open Jenkins
Open browser
Type:

http://localhost:8080
✅ STEP 10: Unlock Jenkins
Go to:

C:\Program Files\Jenkins\secrets\initialAdminPassword
Copy password
Paste in browser
Click Continue
✅ STEP 11: Install Plugins
Click: ✔ Install Suggested Plugins
Wait until installation completes
✅ STEP 12: Create Admin User
Enter:
Username
Password
Click Save
✅ STEP 13: Create Jenkins Job
Click New Item
Enter:

GradeJob
Select: ✔ Freestyle Project
Click OK
✅ STEP 14: Configure GitHub in Jenkins
Scroll to: ✔ Source Code Management
Select: ✔ Git
Paste repo URL
🔹 Add Credentials
Click Add → Jenkins
Enter:
Username
Token
Click Add & Select
✅ STEP 15: Add Build Steps
Scroll to Build
Click: ✔ Add Build Step
Select: ✔ Execute Windows batch command
🔹 Enter Commands
Batch file
javac src/com/student/grade/GradeCalculator.java
java -cp src com.student.grade.GradeCalculator
✅ STEP 16: Build Project
Click Save
Click: ✔ Build Now
✅ STEP 17: Check Output
Click build number
Click: ✔ Console Output
✔ You will see:
Code pulled from GitHub
Compilation successful
Program output (Grade)
🎯 FINAL FLOW (WRITE THIS FOR EXAM)
Create Java program
Run and verify output
Create GitHub repository
Generate access token
Share project using Git
Add, commit, and push code
Install and configure Jenkins
Create job and connect GitHub
Add build steps
Build project and view output







  TO DO IN IDE:
STEP 1: Create Java Program (IntelliJ IDEA)
🔹 Create Project
Open IntelliJ IDEA
Click New Project
Select Java
Click Next → Finish
Enter Project Name:

StudentGradeApp
🔹 Create Package
Right-click src → New → Package
Enter:

com.student.grade
🔹 Create Class
Right-click package → New → Java Class
Enter:

GradeCalculator
🔹 Write Code
Enter program:
Java
package com.student.grade;

import java.util.Scanner;

public class GradeCalculator {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int marks;

System.out.print("Enter marks: ");
marks = sc.nextInt();

if (marks >= 90)
System.out.println("Grade: A");
else if (marks >= 75)
System.out.println("Grade: B");
else if (marks >= 60)
System.out.println("Grade: C");
else if (marks >= 50)
System.out.println("Grade: D");
else
System.out.println("Grade: Fail");

sc.close();
}
}
🔹 Run Program
Click Run → Run 'GradeCalculator'
Enter input → Output displayed
✅ STEP 2: Create GitHub Repository
Open GitHub
Click New Repository
Enter name:

StudentGradeApp
Click Create Repository
Copy repo URL
✅ STEP 3: Push Code to GitHub (IntelliJ)
🔹 Enable Git
Go to: VCS → Enable Version Control Integration
Select: ✔ Git
🔹 Commit Code
Click Commit (Ctrl + K)
Select all files
Enter message:

Initial Commit
Click Commit and Push
🔹 Add Remote
Paste GitHub URL
Login:
Username
Personal Access Token
Click Push
🔹 Verify
Open GitHub → Check files uploaded
✅ STEP 4: Configure Jenkins
🔹 Open Jenkins
Open browser:

http://localhost:8080
🔹 Create Job
Click New Item
Enter:

GradeJob
Select: ✔ Freestyle Project
Click OK
🔹 Connect GitHub
Go to: Source Code Management
Select: ✔ Git
Paste repo URL
🔹 Add Credentials
Click Add → Jenkins
Enter:
Username
Token
Click Add
✅ STEP 5: Add Build Steps
Scroll to Build
Click Add Build Step
Select: ✔ Execute Windows batch command
🔹 Enter Commands
Batch file
javac src/com/student/grade/GradeCalculator.java
java -cp src com.student.grade.GradeCalculator
✅ STEP 6: Build and Execute
Click Save
Click: ✔ Build Now
✅ STEP 7: View Output
Click build number
Click Console Output
✔ Output Shows:
Code fetched from GitHub
Compilation
Execution
Final Grade output
📸 Screenshot to Upload
👉 Take screenshot of: ✔ Console Output (showing Grade + SUCCESS)
🎯 FINAL FLOW (WRITE IN EXAM)
Create Java program in IntelliJ
Run and verify output
Create GitHub repository
Push code using Git
Configure Jenkins job
Add build steps
Build and check console output
Comment
