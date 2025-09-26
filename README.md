Campus Course & Records Manager (CCRM)

Project Overview

This is a powerful, console-based Java SE application intended to be an all-inclusive Campus Course & Records Manager. The application enables an institute to organize student and course information in an efficient manner, process enrollments and grades, and execute important file operations. Designed with an emphasis on illustrating essential and advanced Java principles, the project is organized into readable packages and follows contemporary programming best practices, such as a menu-based CLI, readable separation of concerns, and strong error handling.

 How to Run the Project:
 
This project is developed and executed locally with the Java Development Kit (JDK) and can be easily maintained on the Eclipse IDE. To get the application up and running on your machine, follow these steps.

1) Prerequisites:

Make sure you have the Java Development Kit (JDK) version 11 or above installed on your machine. You can check your installation by executing java version "21.0.8"  in your command prompt. This should show you the installed JDK version.

2) Clone the Repository:

Clone the whole project using Git to your local system. The command will download all the source code and project files.

3) Setup in Eclipse IDE:

Open Eclipse and import the project by going to File > Import.
Choose General > Projects from Folder or Archive and Next.
Navigate to the root directory of the cloned project and click Finish. Eclipse will automatically identify the project structure.

4) Create a Data Folder:

The program employs a data directory to perform file I/O operations. In the top-level project directory (the CCRM folder), create a new folder called data. Here you will put your test data files and where data will be exported by the application.

5) Run the Application:

To invoke the command-line interface, right-click over the Main.java file (in src/edu/ccrm/cli/Main.java) in your Package Explorer. Then, go to Run As > Java Application. The CLI menu will be displayed in your Eclipse console and you can interact with your program.

Project Deliverables & Concepts:

This project displays an extensive variety of Java concepts. Here's a list of where important topics are illustrated:

OOP & Pillars

1) Encapsulation: Illustrated in edu.ccrm.domain.Student.java with private fields accessed via public getters and setters.

2) Inheritance & Abstraction: The abstract class edu.ccrm.domain.Person.java is used as a template, with edu.ccrm.domain.Student.java inheriting from it.

3) Polymorphism: Illustration can be found in edu.ccrm.service.EnrollmentService.java, which is able to handle various kinds of Person objects.

Advanced Concepts

1) Singleton Pattern: Included in edu.ccrm.config.AppConfig.java and edu.ccrm.config.DataStore.java to keep a single instance.

2) Builder Pattern: Applied in edu.ccrm.domain.Course.java for proper object creation with flexibility.

3) Streams API: Utilized in edu.ccrm.service.CourseService.java for data processing within methods such as getAllCourses() and operations of filtering data.

4) Lambdas & Functional Interfaces: In edu.ccrm.service.CourseService.java, for example, with Comparator.comparingInt(Course::getCredits).

5) Exceptions (Checked/Unchecked): Custom exceptions are declared in edu.ccrm.util.CustomExceptions.java, while proper error handling using try-catch blocks is present in edu.ccrm.cli.CCRM_CLI.java.

6) NIO.2 File I/O: The new file I/O API is utilized in edu.ccrm.io.FileIOService.java using classes such as Path and Files.

7) Enums: Used for type-safe constants in edu.ccrm.domain.Grade.java and edu.ccrm.domain.Semester.java.

Java Platform Overview

Java Evolution (Timeline)

1995: Java 1.0 launched.

1998: Java 2 (J2SE, J2EE, J2ME).

2004: Java 5 (Generics, Annotations, Enums, Autoboxing).

2014: Java 8 (Lambda expressions, Streams API, new Date/Time API).

2018: Java 11 (LTS).

Present: Fast release cadence with new versions every 6 months.

Java SE vs. Java EE vs. Java ME

Java SE (Standard Edition)
This is the central Java platform. It's intended for general-purpose use on the desktop, server, and for web application development. It offers the basic APIs such as JVM, Collections, Streams, and simple GUI libraries (Swing, AWT). Console apps and typical desktop GUI apps are some examples.

Java EE (Enterprise Edition)
Based on Java SE, this version is used for creating large-scale, distributed, and multi-tiered enterprise applications. It provides strong APIs for such features as servlets (web), Enterprise JavaBeans (business logic), Java Persistence API (database access), and RESTful web services. It is the choice for complicated systems such as e-commerce sites and banking systems.

Java ME (Micro Edition)
This is a light-weight profile of the Java SE API, designed for use on resource-limited devices. It was previously used for mobile phone applications (prior to the smartphone era), set-top boxes, and other embedded devices. Old mobile games and feature phone apps are typical examples.

  JDK, JRE, and JVM

  1)   JVM (Java Virtual Machine): This is the central part that executes Java bytecode. It's a virtual machine that gives a runtime environment, making the "write once, run anywhere" philosophy possible.

  2)   JRE (Java Runtime Environment): This is a package that supplies the class libraries and other files required to execute a Java program. It consists of the JVM, but does not include the development tools, e.g., a compiler.

  3)   JDK (Java Development Kit): This is the full complement of development, debug, and run-time Java programs. It consists of the JRE, a compiler (javac), and additional development tools.
  
Java Installation & IDE Setup
  
1) Java on Windows:

Get the JDK installer from Oracle or OpenJDK.

Execute the installer and follow the instructions.

Check the installation by opening Command Prompt and entering "21.0.8"


2) Eclipse IDE Setup:

Get and install Eclipse IDE for Java Developers.

Complete the project setup instructions in the "How to Run the Project" section.


Usage and Sample Data:

The application is accessed through a command-line menu. When you run the program, you'll be shown a list of options to administer students, courses, and data.

Test Data:

Create a data directory in the project root and place the following CSV files to test the import feature.

Assertions : 
To support assertions for testing the invariants of the code, you need to run the program using the -ea flag (enable assertions).

Eclipse Run Configuration:

1) Navigate to Run > Run Configurations.

2) Select your Main run configuration.

3) Navigate to the Arguments tab.

4) In the VM arguments text box, put -ea.

5) Click Apply and Run.

Exports & Backups: 
The app can export data to CSV files and generate a timestamped backup folder in the project directory.

Screenshots: 
All screenshots needed will go into a screenshots/ directory in your repository. The placeholders below specify what to capture.

1) JDK installation check (java -version).
   <img width="1365" height="691" alt="Screenshot 2025-09-25 173718" src="https://github.com/user-attachments/assets/d5fea4cb-8799-4b05-b513-72d3378dad12" />


2) Eclipse project setup and run configuration.
   <img width="487" height="889" alt="image" src="https://github.com/user-attachments/assets/d0f72504-47ac-4af4-bffc-a804dd8f6336" />


3) Running program (main menu and sample operations).
   <img width="439" height="937" alt="image" src="https://github.com/user-attachments/assets/c25fa48b-8099-4470-994e-2749a25d9cd6" />


4) Exports/Backups folder structure.
   <img width="489" height="884" alt="image" src="https://github.com/user-attachments/assets/860c1787-83ca-4d52-8a58-6ad367b4f5ac" />

  
