# Project_Angular_VidJogos

A website for a gameshop that includes a Frontend created with Angular (Using the framework Ionic) and a Backend programmed in a Spring Boot proyect.

## Getting Started

These instructions will give you a copy of the project up and running on
your local machine for development and testing purposes. See deployment
for notes on deploying the project on a live system.

### Prerequisites

·[NodeJs]: https://nodejs.org/es/download/

·[JDK 11 (LTS) or Superior]: https://www.oracle.com/java/technologies/downloads/#jdk17-windows 

·[Eclipse]: https://www.eclipse.org/downloads/

·[Maven]: Already comes with Eclipse, but you can also download it for a newer version 

·[Visual Studio Code]: https://code.visualstudio.com/download

·[Xampp]: https://www.apachefriends.org/es/download.html (It is what i used to deploy a MySQL server but any other one can be used)

·[MySQL Workbench]: https://dev.mysql.com/downloads/workbench/ (I used Workbench to create and modify the )


(Optional) ·[Postman]: It´s usefull to test the Backend response with GET,POST,PUT,DEL sentences
                    
                    You can check my Postman publish with all the test inside backend/postman/PostmanPublish.txt 

We´ll get these done in the next steps for the installing guide, but we need to know what we are into

·[Angular / Ionic]: The Frontend is an Angular/Ionic server we´ll launch from Visual Studio

·[Spring Tool Suite 4]: The Backend is a Spring Boot proyect that we launch from Eclipse


## Installing

First we can clone the repository directly into our local workspace.

    $ git clone https://github.com/Marc-Haze/FrontendProject_Angular_VidJogos.git

Now that we got the Backend and the Frontend folder. ![image](https://user-images.githubusercontent.com/91074603/137822363-5c0fad25-27d7-4426-a1f8-084b54221f39.png)

Database:
  
  - You can import the database from backend/database/db_vidjogos.sql or use the SQL sentences in the .txt to do it manually.

Eclipse:

  - You can install Spring Tools 4 it from the Eclipse´s Marketplace so wen can run the Backend as a "Spring Boot Proyect"
    ![image](https://user-images.githubusercontent.com/91074603/137822645-550c3003-3622-4490-8379-3b543da6f159.png)

   - Open the Project Backend from the Folder (Use the main Folder as the Workspace)
   - Run the Backend as a "Spring Boot App"
    ![image](https://user-images.githubusercontent.com/91074603/137822731-2244fa12-a4fc-4056-ae77-b5c6f53340b7.png)

   - You can check all database items on http://localhost:8080/producto or http://localhost:8080/empleado or even try with Postman as i did in my publish https://documenter.getpostman.com/view/17625230/UV5Xgwaj

![image](https://user-images.githubusercontent.com/91074603/137823312-abb70134-2181-4a8e-9b30-6278e1fc7968.png)
![image](https://user-images.githubusercontent.com/91074603/137823336-a13ea252-ff18-46ea-9750-df12351eb72e.png)

Visual Studio Code:
  - We open a Terminal in the main proyect folder and install ionic and dependencies
  
      $ npm install
      
      $ npm install -g @ionic/cli



## Running the tests

Eclipse:
 
    Ports Used: 8080

Open the Project Backend from the Folder (Use the main Folder as the Workspace)
 
  - Run the Backend as a "Spring Boot App"
      ![image](https://user-images.githubusercontent.com/91074603/137822731-2244fa12-a4fc-4056-ae77-b5c6f53340b7.png)

  - You can check all database items on http://localhost:8080/producto or http://localhost:8080/empleado 

![image](https://user-images.githubusercontent.com/91074603/137823312-abb70134-2181-4a8e-9b30-6278e1fc7968.png)
![image](https://user-images.githubusercontent.com/91074603/137823336-a13ea252-ff18-46ea-9750-df12351eb72e.png)


  - Or even try with Postman as i did in my publish https://documenter.getpostman.com/view/17625230/UV5Xgwaj

Visual Studio Code:

    Ports Used: 8100

 Once installed Ionic and the dependencies, we need to move to our Frontend folder to launch our Ionic server
 
    $ cd frontend
    
    $ ionic serve
    
  Ionic will start in the Home Page of this Project, where you can navigate to other page usin the Menu component or even the Footer Component
 
     Pages: 
        Home (Initial) 
        Products (Pressing on any label of product)
        AboutUs (Pressing on "Contáctanos", its also in the footer)
        LogIn(Pressing in "Conectarse")
        Logged(You can log-in with username="admin" & password="admin")


## Authors

  - **Marcos del Rosario del Castillo**
    [Marc-Haze](https://github.com/Marc-Haze)


## Acknowledgments

  - Pino
  - Tiburcio
  - Gemma
