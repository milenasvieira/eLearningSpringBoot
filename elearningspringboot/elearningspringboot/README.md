#E-learning Project

This project is part of the final evaluation of the full-stack java course by TechAcademy.

###ER Diagram

![img.png](img.png)

### Technologies Used

- Java 8
- Spring Boot 2.6.1
- Maven
- Thymeleaf
- MySQL database

### Observations

The relationship between Users and Courses isn't right/making sense. It might be a Many To Many relationship or a One To Many (one course to many users).   
Also, there isn't a foreign key (userId or courseId) mapped at the respective models on diagram.

### How to start this project

1. Unzip the *elearninspringboot* folder
2. Open an IDE (IntelliJ or Eclipse) and choose the *elearningspringboot* folder
3. Open the *pom.xml* file and download all the dependencies
4. Start the project
5. Test the endpoints at an API Client under the URL <localhost:8080/>

### Front-end part

Since I wasn't able to connect the front-end to my server, I'll put the Thymeleaf forms that I made here.

- **Registration Form**
![img_2.png](img_2.png)

- **Contact Form**
![img_3.png](img_3.png)

- **Course Form**
![img_4.png](img_4.png)

- **Feedback Form**
![img_5.png](img_5.png)


## Contact info

If you have any question, please reach me out!
milena.vieira@amdocs.com